/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;
import java.util.*;

import org.springframework.web.bind.annotation.*;
import com.example.player.PlayerService;


@RestController
public class PlayerController {    
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerByPlayerId(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerByPlayerId(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }
    
}