package se.team.pokemonv2;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date loginTime;
    private Date logoutTime;
    @ManyToOne
    @JoinTable(
            name="user_log",
            joinColumns = @JoinColumn(name="username"),
            inverseJoinColumns = @JoinColumn(name="id")
    )
    private User user;

    //Constructors
    public Log(Date loginTime, Date logoutTime) {
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }
    public Log() {

    }

    //Getters
    public int getId() {
        return id;
    }
    public Date getLoginTime() {
        return loginTime;
    }
    public Date getLogoutTime() {
        return logoutTime;
    }

    //Setters
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    //ToString
    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", user=" + user.getUsername() +
                '}';
    }
}
