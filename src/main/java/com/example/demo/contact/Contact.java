package com.example.demo.contact;

import jakarta.persistence.*;

@Entity
@Table
public class Contact {
    @Id
    @SequenceGenerator(name = "contact_sequence", sequenceName = "contact_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_sequence")
    private int id;
    private String name;
    private int number;

    public Contact() {
    }

    public Contact(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
