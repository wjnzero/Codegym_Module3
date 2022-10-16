package model;

public class Food {
    protected int id;
    protected String name, img, details;

    public Food() {
    }

    public Food(String name, String img, String details) {
        this.name = name;
        this.img = img;
        this.details = details;
    }

    public Food(int id, String name, String img, String details) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
