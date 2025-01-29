
public class Main implements Spec{
    
    public static void main(String[] args) {
        Player p1 = new Player();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
    }

    @Override
    public String askString(String question) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'askString'");
    }

    @Override
    public int askNumber(String question) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'askNumber'");
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
