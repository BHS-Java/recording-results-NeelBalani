public interface Spec {
    public String   askString(String question);
    public int      askNumber(String question);
    public Results  getResults(Game guessingOrBetter);
    public Person   makePerson(String name, int age, int height);
    public void     addResults(Player player);
}
