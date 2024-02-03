package az.sport.guessplayer.controller;

import az.sport.guessplayer.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping
    public ResponseEntity<String> game(String name){
        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
