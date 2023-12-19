package se.team.pokemonv2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementMashupRepo extends JpaRepository<ElementMashup, Integer> {
}
