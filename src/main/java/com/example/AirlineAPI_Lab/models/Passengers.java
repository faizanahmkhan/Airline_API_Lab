package com.example.AirlineAPI_Lab.models;

import javax.persistence.*;
import java.util.List;

@Entity(name =  "passengers")
public class Passengers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email_address")
    private String emailAddress;

    @ManyToMany
    @JoinTable(
            name = "passenger_flights",
            joinColumns = {@JoinColumn(name = "flights_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "passenger_id", nullable = false)}
    )
    private List<Flights> flightsList;


    public Passengers (String name){
        this.name = name;
        this.emailAddress = emailAddress;
    }

    private Passengers(){

    }

    public Long getId() {
        return id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Flights> getFlightsList() {
        return flightsList;
    }

    public void setFlightsList(List<Flights> flightsList) {
        this.flightsList = flightsList;
    }
}
