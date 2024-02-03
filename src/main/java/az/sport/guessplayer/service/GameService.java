package az.sport.guessplayer.service;

import az.sport.guessplayer.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {
final PlayerRepository playerRepository;

    public GameService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

}
