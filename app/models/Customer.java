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
    private String first_Name;

    @Constraints.Required
    private String last_Name;

    @Constraints.Required
    private String phone;

    @Constraints.Required
    private String email;

    public Customer() {
    }

    public Customer(long id, String fn, String ln, String p, String em) {
        this.id = id;
        first_Name = fn;
        last_Name = ln;
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
        return first_Name;
    }

    public String getLastName(){
        return last_Name;
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
        first_Name = fn;
    }

    public void setLastName(String ln) {
        last_Name = ln;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public void setEmail(String e) {
        email = e;
    }
}