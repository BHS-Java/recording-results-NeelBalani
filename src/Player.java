public class Player implements Person {

    private String name;
    private int height;
    private int age;
    Results results;
    
    public Player(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
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

    public void setResults (Results results){
        this.results = results;
    }



}
