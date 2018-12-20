public class Subclass extends Superclass{
    public void printMethod(){
        super.printMethod();
        System.out.println("I am not.");
    }

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}
