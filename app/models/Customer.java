package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer{
    @Id
    private long id;

    @Constraints.Required
    private String firstName;

    @Constraints.Required
    private String lastName;

    @Constraints.Required
    private String phone;

    @Constraints.Required
    private String email;

    public Customer() {
    }

    public Customer(long id, String fn, String ln, String p, String em) {
        this.id = id;
        firstName = fn;
        lastName = ln;
        phone = p;
        email = em;
    }


    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
    
    public static final List<Customer> findAll() {
        return Customer.find.all();
    }

    public long getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void setID(long id) {
        this.id = id;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public void setEmail(String e) {
        email = e;
    }
}