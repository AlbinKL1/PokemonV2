package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="element_mashup")
public class ElementMashup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "attacking_id", referencedColumnName = "id")
    private Element attackingElement;

    @OneToOne
    @JoinColumn(name = "defending_id", referencedColumnName = "id")
    private Element defendingElement;

    private float effectiveness;

    //Constructors
    public ElementMashup(Element attackingElement, Element defendingElement, float effectiveness) {
        this.attackingElement = attackingElement;
        this.defendingElement = defendingElement;
        this.effectiveness = effectiveness;
    }
    public ElementMashup() {

    }

    //Getters
    public int getId() {
        return id;
    }
    public Element getAttackingElement() {
        return attackingElement;
    }
    public Element getDefendingElement() {
        return defendingElement;
    }
    public float getEffectiveness() {
        return effectiveness;
    }

    //Setters
    public void setAttackingElement(Element attackingElement) {
        this.attackingElement = attackingElement;
    }
    public void setDefendingElement(Element defendingElement) {
        this.defendingElement = defendingElement;
    }
    public void setEffectiveness(float effectiveness) {
        this.effectiveness = effectiveness;
    }

    //ToString
    @Override
    public String toString() {
        return "ElementMashup{" +
                "id=" + id +
                ", attackingElement=" + attackingElement +
                ", defendingElement=" + defendingElement +
                ", effectiveness=" + effectiveness +
                '}';
    }
}
