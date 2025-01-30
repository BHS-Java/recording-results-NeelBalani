import java.util.Scanner;
public class Main implements Spec{
    
    private Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Main test = new Main();

        String name = test.askString("What is your name?");
        int age = test.askNumber("What is your age?");
        int height = test.askNumber("What is your height in inches?");
        Player p1 = new Player(name, age, height);
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
    public Results getResults(Game guessingOrBetter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResults'");
    }

    @Override
    public Person makePerson(Object name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePerson'");
    }

    @Override
    public void addResults(Person player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addResults'");
    }
}
