package com.example.obligatorythird;

public class Ticket {

    private String movies;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String amount;

    public Ticket(String movies, String firstName, String lastName, String phoneNumber, String email, String amount){
        this.movies = movies;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.amount = amount;
    }

    public  Ticket(){ }


    public String getMovies(){
        return movies;
    }

    public void setMovies(String movies){
        this.movies = movies;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getAmount(){
        return amount;
    }

    public void setAmount (String amount){
        this.amount = amount;
    }
}