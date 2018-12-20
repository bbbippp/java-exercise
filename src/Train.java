public class Train {
    public static void main(String[] args) {
        double first = 20;
        double second = 80;

        double formula = (first+second)*25;
        System.out.println(formula);
        double remainder = formula % 40;
        System.out.println(remainder);
        if(remainder <= 20)
            System.out.println("Total was over the limit");
    }
}
