package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="element")
public class Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String element;

    //Constructors
    public Element(String element) {
        this.element = element;
    }
    public Element() {

    }

    //Getters
    public int getId() {
        return id;
    }
    public String getElement() {
        return element;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setElement(String element) {
        this.element = element;
    }

    //ToString
    @Override
    public String toString() {
        return "Element{" +
                "id=" + id +
                ", element='" + element + '\'' +
                '}';
    }
}
