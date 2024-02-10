package az.sport.guessplayer.controller;

import az.sport.guessplayer.model.Player;
import az.sport.guessplayer.repository.PlayerRepository;
import az.sport.guessplayer.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/game")
public class    GameController {

    final GameService gameService;
    final
    PlayerRepository playerRepository;

    public GameController(GameService gameService, PlayerRepository playerRepository) {
        this.gameService = gameService;
        this.playerRepository = playerRepository;
    }

    @GetMapping
    public ResponseEntity<List<Player>> getALlPlayer(){
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/guess")
    public ResponseEntity<String> guessPlayer(@RequestParam String  name){
        String result = gameService.compareAge(name);
        result += "\n" + gameService.compareKitNum(name);
        result += "\n" + gameService.comparePosition(name);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
}
