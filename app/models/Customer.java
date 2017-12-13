package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer extends Model{
    @Id
    private Long id;

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

    public Customer(Long id, String fn, String ln, String p, String em) {
        this.id = id;
        this.first_Name = fn;
        this.last_Name = ln;
        this.phone = p;
        this.email = em;
    }


    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
    
    public static final List<Customer> findAll() {
        return Customer.find.all();
    }

    public Long getID() {
        return this.id;
    }

    public String getFirstName() {
        return first_Name;
    }

    public String getLastName(){
        return last_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public void setFirstName(String fn) {
        first_Name = fn;
    }
    
    public void setFirst_Name(String fn) {
        first_Name = fn;
    }

    public void setLast_Name(String ln) {
        last_Name = ln;
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