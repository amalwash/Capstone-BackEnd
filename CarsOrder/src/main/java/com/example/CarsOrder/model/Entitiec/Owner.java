package com.example.CarsOrder.model.Entitiec;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Owner {
    @Id
   private int owner_id;
   private String owner_firstName;
    private String owner_lastName;
   private String owner_address;
    private int owner_phone;
     private int owner_age;
   private String owner_email;


 @OneToMany(mappedBy = "owner")
   @JsonIgnore
 private List<Car> items = new ArrayList<>();


    public Owner(int owner_id, String owner_firstName, String owner_lastName, String owner_address, int owner_phone, int owner_age, String owner_email, List<Car> items) {
        this.owner_id = owner_id;
        this.owner_firstName = owner_firstName;
        this.owner_lastName = owner_lastName;
        this.owner_address = owner_address;
        this.owner_phone = owner_phone;
        this.owner_age = owner_age;
        this.owner_email = owner_email;
        this.items = items;
    }

    public Owner() {
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_firstName() {
        return owner_firstName;
    }

    public void setOwner_firstName(String owner_firstName) {
        this.owner_firstName = owner_firstName;
    }

    public String getOwner_lastName() {
        return owner_lastName;
    }

    public void setOwner_lastName(String owner_lastName) {
        this.owner_lastName = owner_lastName;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public int getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(int owner_phone) {
        this.owner_phone = owner_phone;
    }

    public int getOwner_age() {
        return owner_age;
    }

    public void setOwner_age(int owner_age) {
        this.owner_age = owner_age;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public List<Car> getItems() {
        return items;
    }

    public void setItems(List<Car> items) {
        this.items = items;
    }
}
