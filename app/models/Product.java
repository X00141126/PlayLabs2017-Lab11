package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Product extends Model {

// Properties
@Id
private Long id;

@Constraints.Required
private String name;

@ManyToOne
private Category category;

@Constraints.Required
private String description;

@Constraints.Required
private int stock;

@Constraints.Required
private double price;

// Default Constructor

public Product() {

}

// Constructor to initialise object

public Product(Long id, String name, String description, int stock, double price) {

this.id = id;

this.name = name;

this.description = description;

this.stock = stock;

this.price = price;

}

//FindAll
public static final Finder<Long, Product> find = new Finder<>(Product.class);

public static final List<Product> findAll() {
    return Product.find.all();
}
// Accessor methods

public Long getId() {

return this.id;

}

public void setId(Long id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public Category getCategory() {
    return category;
}

public void setCategory(Category c) {
    this.category = c;
}

public String getDescription() {
    return description;
}

public void setDescription(String d) {
    description = d;
}

public int getStock() {
    return stock;
}

public void setStock(int s) {
    stock = s;
}

public double getPrice() {
    return price;
}

public void setPrice(double p) {
    price = p;
}

}