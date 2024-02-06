package az.sport.guessplayer.service;

import az.sport.guessplayer.model.Player;
import az.sport.guessplayer.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {
final PlayerRepository playerRepository;

    public GameService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public String compareResult(String name) {
        String result = "";
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(1);
        Player playerServer=playerOptional.get();
        if (playerClient.getAge() > playerServer.getAge()) {
            result += "Down Age";
        } else if (playerClient.getAge() < playerServer.getAge()) {
            result += "Up Age";
        } else {
            result += "True Age";
        }
        return result;
    }
}
