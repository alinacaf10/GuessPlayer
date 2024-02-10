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

    final Integer id = 2;
    public String compareAge(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer=playerOptional.get();
        if (playerClient.getAge() > playerServer.getAge()) {
            result = "Down Age";
        } else if (playerClient.getAge() < playerServer.getAge()) {
            result = "Up Age";
        } else {
            result = "True Age";
        }
        return result;
    }

    public String compareKitNum(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer=playerOptional.get();
        if (playerClient.getKitNumber() > playerServer.getKitNumber()) {
            result = "Down Kit Number";
        } else if (playerClient.getKitNumber() < playerServer.getKitNumber()) {
            result = "Up Kit Number";
        } else {
            result = "True Kit Number";
        }
        return result;
    }

    public String comparePosition(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getPosition().equals(playerClient.getPosition())) {
            result = "True Position";
        } else {
            result = "False Position";
        }
        return result;
    }
    public String compareCountry(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getCountry().equals(playerClient.getCountry())) {
            result = "True Country";
        } else {
            result = "False Country";
        }
        return result;
    }
    public String compareLeague(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getLeague().equals(playerClient.getLeague())) {
            result = "True League";
        } else {
            result = "False League";
        }
        return result;
    }
    public String compareTeam(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getTeam().equals(playerClient.getTeam())) {
            result = "True Team";
        } else {
            result = "False Team";
        }
        return result;
    }

    public String compareName(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getName().equals(playerClient.getName())) {
            result = "True Name";
        } else {
            result = "False Name";
        }
        return result;
    }
}
