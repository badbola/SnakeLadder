package Service;

import entity.Dice;
import entity.Player;

import java.util.Map;

public class Board {


    private Dice dice;
    private Player[] players;
    private Map<Integer,Integer> positionMap;
    private int boardSize;
    private int turn;

    public Board(Dice dice, Player[] players, Map<Integer, Integer> positionMap, int boardSize) {
        this.dice = dice;
        this.players = players;
        this.positionMap = positionMap;
        this.boardSize = boardSize;
        this.turn = 0;
    }

    void playGame(){
        while(players.length>1){
            if(turn>=players.length){
                turn=0;
            }
            Player player = players[turn++];
            int position = dice.rollDice();
            if (positionMap.containsKey(position)){
                if (positionMap.get(position)>position){
                    System.out.println(player.getId()+" got ladder of "+positionMap.get(position));
                }
                player.setPosition(positionMap.get(position));
            } else {
                player.setPosition(player.getPosition()+position);
            }
            System.out.println(player.getId()+" position is "+player.getPosition());
            if (player.getPosition()>boardSize){
                player.setPosition(player.getPosition()-position);
            } else if (player.getPosition()==boardSize){
                System.out.println("Player "+player.getId()+" has won! Hurray");
                break;
            }
        }
    }
}
