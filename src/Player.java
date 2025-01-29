import java.util.Scanner;
public class Player implements Person {

    private String name;
    private int height;
    private int age;
    private Results results;
    
    public Player(){
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        setName(s.next());
        System.out.println("What is your height in inches?");
        height = s.nextInt();
        System.out.println("What is your age?");
        age = s.nextInt();

        s.close();
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getHeight(){
        return height;
    }

    @Override
    public int getAge( ){
        return age;
    }

    @Override
    public Results getResults(){
        return results;
    }


}
