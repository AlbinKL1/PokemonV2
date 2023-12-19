package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon_statistics")
public class PokemonStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int winAmount;
    private int lossAmount;

    //Constructors
    public PokemonStatistics(int winAmount, int lossAmount) {
        this.winAmount = winAmount;
        this.lossAmount = lossAmount;
    }
    public PokemonStatistics() {

    }

    //Getters
    public int getId() {
        return id;
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
        return "PokemonStatistics{" +
                "id=" + id +
                ", winAmount=" + winAmount +
                ", lossAmount=" + lossAmount +
                '}';
    }
}
