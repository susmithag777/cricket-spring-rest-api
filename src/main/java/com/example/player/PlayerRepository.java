// Write your code here
package com.example.player;
import java.util.*;

public interface PlayerRepository {
    ArrayList <Player> getPlayers();
    Player addPlayer(Player player);
    Player getPlayerByPlayerId(int playerId);
    Player updatePlayer(int playerId, Player player);
    void deletePlayer(int playerId);
    
}