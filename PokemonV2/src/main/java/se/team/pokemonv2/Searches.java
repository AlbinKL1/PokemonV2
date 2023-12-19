package se.team.pokemonv2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="searches")
public class Searches {
    @Id
    private String search;

    private int amount;

    //Constructors
    public Searches(String search, int amount) {
        this.search = search;
        this.amount = amount;
    }
    public Searches() {

    }

    //Getters
    public String getSearch() {
        return search;
    }
    public int getAmount() {
        return amount;
    }

    //Setters
    public void setSearch(String search) {
        this.search = search;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    //ToString
    @Override
    public String toString() {
        return "Searches{" +
                "search='" + search + '\'' +
                ", amount=" + amount +
                '}';
    }
}
