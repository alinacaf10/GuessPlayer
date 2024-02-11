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
            result = playerClient.getAge()+"↓";
        } else if (playerClient.getAge() < playerServer.getAge()) {
            result = playerClient.getAge()+"↑";
        } else {
            result = playerClient.getAge()+"☑";
        }
        return result;
    }

    public String compareKitNum(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer=playerOptional.get();
        if (playerClient.getKitNumber() > playerServer.getKitNumber()) {
            result = playerClient.getKitNumber()+"↓";
        } else if (playerClient.getKitNumber() < playerServer.getKitNumber()) {
            result = playerClient.getKitNumber()+"↑";
        } else {
            result =playerClient.getKitNumber()+" ☑ ";
        }
        return result;
    }

    public String comparePosition(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getPosition().equals(playerClient.getPosition())) {
            result =  playerClient.getPosition()+ " ☑ ";
        } else {
            result = playerClient.getPosition()+  " ⓧ ";
        }
        return result;
    }
    public String compareCountry(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getCountry().equals(playerClient.getCountry())) {
            result = playerClient.getCountry()+ " ☑ ";
        } else {
            result = playerClient.getCountry()+ " ⓧ ";
        }
        return result;
    }
    public String compareLeague(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getLeague().equals(playerClient.getLeague())) {
            result = playerClient.getLeague()+" ☑ ";
        } else {
            result = playerClient.getLeague() + " ⓧ ";
        }
        return result;
    }
    public String compareTeam(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getTeam().equals(playerClient.getTeam())) {
            result = playerClient.getTeam()+" ☑ ";
        } else {
            result = playerClient.getTeam()+" ⓧ ";
        }
        return result;
    }

    public String compareName(String name) {
        String result;
        Player playerClient = playerRepository.findByNameContains(name);
        Optional<Player> playerOptional = playerRepository.findById(id);
        Player playerServer = playerOptional.get();
        if (playerServer.getName().equals(playerClient.getName())) {
            result = playerClient.getName()+" ☑ ";
        } else {
            result = playerClient.getName()+" ⓧ ";
        }
        return result;
    }
}
