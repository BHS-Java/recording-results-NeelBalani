import java.util.Scanner;
public class Main implements Spec{
    
    private Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main test = new Main();

        /*String name = test.askString("What is your name?");
        int age = test.askNumber("What is your age?");
        int height = test.askNumber("What is your height in inches?");
        Player p1 = new Player(name, age, height);
        name = test.askString("What is your name?");
        age = test.askNumber("What is your age?");
        height = test.askNumber("What is your height in inches?");
        Player p2 = new Player(name, age, height);
        
        Game g = new Game(p1, p2);
        p1.setResults(test.getResults(g));*/
        test.climb("BR");
        test.climb("BL");
    }


    public void climb(String direction){
        if(direction.equals("UR")){
            int o = 0;
            for(int i = 5; i > 0; i--){
                while(o <= i){
                    System.out.print("  ");
                    o++;
                }
                System.out.print("_");
                System.out.print("|");
                System.out.println();
                o = 0;
            }
        }
        if(direction.equals("UL")){
            int o = 0;
            for(int i = 0; i < 5; i++){
                while(o <= i){
                    System.out.print("  ");
                    o++;
                }
                System.out.print("|");
                System.out.print("_");
                System.out.println();
                o = 0;
            }
        }
        if(direction.equals("BL")){
            int o = 0;
            for(int i = 5; i > 0; i--){
                while(o <= i){
                    System.out.print("_");
                    o++;
                }
                System.out.print("_");
                System.out.print("|");
                System.out.println();
                o = 0;
            }
        }
        if(direction.equals("BR")){
            int o = 0;
            for(int i = 0; i < 5; i++){
                while(o <= i){
                    System.out.print("_");
                    o++;
                }
                System.out.print("_");
                System.out.print("|");
                System.out.println();
                o = 0;
            }
        }
    }

    @Override
    public String askString(String question) {
       System.out.println(question);
       return(s.next());
    }


    

    @Override
    public int askNumber(String question) {
        System.out.println(question);
       return(s.nextInt());
    }

    @Override
    public Results getResults(Game g) {
       return g.getResults();
    }

    public Player makePerson(String name, int age, int height) {
        return new Player(name, age, height);
    }

    @Override
    public void addResults(Player p) {
         
    }
}
