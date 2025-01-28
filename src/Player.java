
public class Player implements Person {

    private String name;
    private int height;
    private int age;
    private Results results;
    
    public Player(){
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
