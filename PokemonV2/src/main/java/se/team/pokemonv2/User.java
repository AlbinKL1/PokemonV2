package se.team.pokemonv2;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "usertype_id")
    private UserType userType;
    @OneToOne
    @JoinColumn(name = "username")
    private UserStatistics userStats;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="user_pokemon",
            joinColumns = @JoinColumn(name="username"),
            inverseJoinColumns = @JoinColumn(name="pokemon_id")
    )
    private List<Pokemon> pokemons = new ArrayList<Pokemon>();
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="user_log",
            joinColumns = @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="username")
    )
    private List<Log> logs = new ArrayList<Log>();

    //Constructors
    public User(String username, String password, UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    public User() {

    }

    //Getters
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public UserType getUserType() {
        return userType;
    }

    //Setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    //ToString
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", userStats=" + userStats +
                ", pokemons=" + pokemons +
                ", logs=" + logs +
                '}';
    }
}
