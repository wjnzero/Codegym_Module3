package dao;

import model.Food;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodDAO implements IFoodDAO{
    public FoodDAO() {
    }
    protected Connection connection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_test","root","123456");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("connect failed!");
        }
        return connection;
    }
    public static void main(String[] args) {
        FoodDAO foodDAO =new FoodDAO();
        foodDAO.connection();
    }

    @Override
    public void insertFood(Food food) {
        Connection connection = connection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO food (name, img, details) VALUES (?, ?, ?);");
            preparedStatement.setString(1,food.getName());
            preparedStatement.setString(2,food.getImg());
            preparedStatement.setString(3,food.getDetails());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException ohNo) {
            System.out.printf("error: %n",ohNo.toString());
            ohNo.printStackTrace();
        }

    }

    @Override
    public Food selectFood(int id) {
        Food food = null;
        Connection connection = connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id,name,img,details from food where id =?");
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                food = new Food(resultSet.getString("name"),resultSet.getString("img"),resultSet.getString("details"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return food;
    }

    @Override
    public List<Food> selectAllFood() {
        List<Food> foods =new ArrayList<>();
        Connection connection = connection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from food");
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                foods.add(new Food(resultSet.getInt("id"),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
            }
        } catch (SQLException ohNo) {
            ohNo.printStackTrace();
        }
        return foods;
    }

    @Override
    public boolean deleteFood(int id) throws SQLException {
        boolean rowDelete;
        Connection connection = connection();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from food where id = ?;");
        preparedStatement.setInt(1,id);
        rowDelete = preparedStatement.executeUpdate()>0;
        return rowDelete;
    }

    @Override
    public boolean updateFood(Food food) throws SQLException {
        boolean rowUp;
        PreparedStatement preparedStatement = connection().prepareStatement("update food set name = ?,img = ?, details =? where id = ?;");
        System.out.println(preparedStatement);
        preparedStatement.setString(1,food.getName());
        preparedStatement.setString(2,food.getImg());
        preparedStatement.setString(3,food.getDetails());
        preparedStatement.setInt(4,food.getId());

        rowUp=preparedStatement.executeUpdate()>0;
        return rowUp;
    }
}
