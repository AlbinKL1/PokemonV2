package se.team.pokemonv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;
    @Autowired
    UserStatisticsRepo userStatRepo;
    @Autowired
    PokemonRepo pokemonRepo;
    @Autowired
    PokemonStatisticsRepo pokemonStatRepo;
    @Autowired
    ElementRepo elementRepo;
    @Autowired
    ElementMashupRepo elementMashupRepo;
    @Autowired
    LogRepo logRepo;

    @Override
    public void run(String[] args) throws Exception {
        logRepo.save(new Log().setLoginTime(new Datetime()));
        User user1 = this.userRepo.findById("Tony").get();
        User user2 = this.userRepo.findById("Albin").get();
        System.out.println(user1);
        System.out.println(user2);
    }
}
