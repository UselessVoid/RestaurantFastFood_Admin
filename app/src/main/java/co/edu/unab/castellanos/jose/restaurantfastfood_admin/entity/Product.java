package co.edu.unab.castellanos.jose.restaurantfastfood_admin.entity;

import com.google.firebase.firestore.Exclude;
import com.google.firebase.firestore.PropertyName;

import java.io.Serializable;

public class Product implements Serializable {

    private String id;
    private String type;
    private String name;
    private double price;
    private String description;
    private String url_picture;

    public Product() {

    }


    public Product(String type, String name, double price, String url_picture, String description) {

        this.name = name;
        this.price = price;
        this.type = type;
        this.description = description;
        this.url_picture = url_picture;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @PropertyName("url_picture")
    public String getUrl_picture() {
        return url_picture;
    }

    @PropertyName("url_picture")
    public void setUrl_picture(String url_picture) {
        this.url_picture = url_picture;
    }

    @Exclude
    public String getId() {
        return id;
    }

    @Exclude
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}