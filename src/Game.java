import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Game implements Results{

  Player p1;
  Player p2;
  private boolean turn = true;
  private boolean winner = false;
  private String winName = "";
  private ArrayList<String> list = new ArrayList<String>();
  private ArrayList<Integer> ageList = new ArrayList<Integer>();
  private ArrayList<Integer> heightList = new ArrayList<Integer>();
  String[] WordList;
  


  public Game() throws FileNotFoundException, IOException{
    loadPlayers();
    p1 = selectPlayer();
    p2 = selectPlayer();
    play();
    
  }

  public void loadPlayers() throws FileNotFoundException, IOException{
    File f = new File("PlayerHub.csv");

    Scanner s = new Scanner(f);
    int i = 0;
    

    while (s.hasNextLine()){
      while(s.hasNext()){
        WordList = s.nextLine().split(",");
        list.add(WordList[0]);
        ageList.add(Integer.parseInt(WordList[1]));
        ageList.add(Integer.parseInt(WordList[2]));
        System.out.println(list.get(i));
        i++;
      }
    }      
 }

  public Player selectPlayer() throws FileNotFoundException, IOException{

    File f = new File("PlayerHub.csv");

    Scanner s = new Scanner(f);
    int i = 0;
    

    

    Scanner n = new Scanner(System.in);
    System.out.println("Choose your player.");
    while (s.hasNextLine()){
      while(s.hasNext()){
        System.out.println(i + list.get(i));
        i++;
      }
    }
    int player = n.nextInt();
    return new Player(list.get(player), ageList.get(player) , heightList.get(player));
    


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