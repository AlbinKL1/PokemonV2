package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="user_statistics")
public class UserStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    private int winAmount;
    private int lossAmount;

    //Constructors
    public UserStatistics(int winAmount, int lossAmount) {
        this.winAmount = winAmount;
        this.lossAmount = lossAmount;
    }
    public UserStatistics() {

    }

    //Getters
    public String getUsername() {
        return username;
    }
    public int getWinAmount() {
        return winAmount;
    }
    public int getLossAmount() {
        return lossAmount;
    }

    //Setters
    public void setWinAmount(int winAmount) {
        this.winAmount = winAmount;
    }
    public void setLossAmount(int lossAmount) {
        this.lossAmount = lossAmount;
    }

    //ToString
    @Override
    public String toString() {
        return "UserStatistics{" +
                "id=" + username +
                ", winAmount=" + winAmount +
                ", lossAmount=" + lossAmount +
                '}';
    }
}
