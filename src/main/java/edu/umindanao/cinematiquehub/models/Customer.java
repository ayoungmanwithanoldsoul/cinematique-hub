package edu.umindanao.cinematiquehub.models;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    // Default Constructors
    public Customer(int id, String firstName, String lastName, String address, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be non-negative.");
        }
    }

    // Additional Methods (if needed)
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

