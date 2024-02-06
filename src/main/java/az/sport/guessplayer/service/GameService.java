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
        Player playerClient = playerRepository.findByName(name);
        Optional<Player> playerServer = playerRepository.findById(1);
        if (playerClient.getAge() > playerServer.get().getAge()) {
            result += "Down Age";
        } else if (playerClient.getAge() < playerServer.get().getAge()) {
            result += "Up Age";
        } else {
            result += "True Age";
        }
        return result;
    }
}
