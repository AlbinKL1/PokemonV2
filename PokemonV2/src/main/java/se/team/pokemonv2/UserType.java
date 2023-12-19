package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    //Constructors
    public UserType(String type) {
        this.type = type;
    }
    public UserType() {

    }

    //Getters
    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }

    //Setters
    public void setType(String type) {
        this.type = type;
    }

    //ToString
    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
