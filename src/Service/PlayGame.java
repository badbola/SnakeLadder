package Service;

import entity.Dice;
import entity.Player;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PlayGame {

    public static void main(String[] args) {

        Dice dice = new Dice(1);
        Player p1 = new Player(1);
        Player p2 = new Player(2);
        Player[] players = new Player[]{p1, p2};
        Map<Integer,Integer> positionMap = new HashMap<>();
        positionMap.put(4,9);
        positionMap.put(31,2);
        positionMap.put(55,87);
        positionMap.put(99,1);
        positionMap.put(90,98);

        Board board = new Board(dice, players,positionMap,100);

        board.playGame();
    }
}
