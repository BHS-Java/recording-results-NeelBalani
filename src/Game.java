import java.util.Random;
import java.util.Scanner;
public class Game implements Results{

  Player p1;
  Player p2;
  private boolean turn = true;
  private boolean winner = false;
  private String winName = "";
  


  public Game(Player p1, Player p2){
    this.p1 = p1;
    this.p2 = p2;
    play();
    
  }


  public void play(){
    Random die = new Random();
    int num = die.nextInt(0, 2);
    Scanner s = new Scanner(System.in);
    while(!winner){
      System.out.println("Guess a number 0 to 100");
      int guess = s.nextInt();
      if(num == guess){
        if(turn){
          //p1 wins
          winner = true;
          winName = p1.getName();
        }
        else{
          //p2 wins
          winner = true;
          winName = p2.getName();
        }
      }
      else{
        turn = !turn;
      }

    }


  }

    public Results getResults() {
        return (new Results() {
          public String getWinner(){
            return winName;
          }
        });
    }

    @Override
    public String getWinner() {
      return winName;
    }



  
}