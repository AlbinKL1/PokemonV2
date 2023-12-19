package se.team.pokemonv2;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne
    @JoinColumn(name = "element", referencedColumnName = "id")
    private Element element;
    @Column(name = "attackdamage")
    private int attackDamage;
    @Column(name = "hitpoints")
    private int hitPoints;
    @OneToOne
    @JoinColumn(name = "id")
    private PokemonStatistics pokemonStats;
    @ManyToOne
    @JoinTable(
            name="user_pokemon",
            joinColumns = @JoinColumn(name="pokemon_id"),
            inverseJoinColumns = @JoinColumn(name="username")
    )
    private User user;

    //Constructors
    public Pokemon(String name, Element element, int attackDamage, int hitPoints) {
        this.name = name;
        this.element = element;
        this.attackDamage = attackDamage;
        this.hitPoints = hitPoints;
    }
    public Pokemon() {

    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Element getElement() {
        return element;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setElement(Element element) {
        this.element = element;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    //ToString

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", element=" + element +
                ", attackDamage=" + attackDamage +
                ", hitPoints=" + hitPoints +
                ", pokemonStats=" + pokemonStats +
                ", user=" + user.getUsername() +
                '}';
    }
}
