package dao;

import model.Food;

import java.sql.SQLException;
import java.util.List;

public interface IFoodDAO {
    public void insertFood(Food food);

    public Food selectFood(int id);

    public List<Food> selectAllFood();

    public boolean deleteFood(int id) throws SQLException;

    public boolean updateFood(Food food) throws SQLException;
}
