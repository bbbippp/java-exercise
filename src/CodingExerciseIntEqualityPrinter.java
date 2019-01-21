/**
 * @author Ian Gumilang
 */
public class CodingExerciseIntEqualityPrinter
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String ALL_DIFFERENT_MESSAGE = "All numbers are different";
    private static final String NEITHER_MESSAGE = "Neither all are equal or different";

    public static void printEqual(int x, int y, int z)
    {
        if(x < 0 || y < 0 || z < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }else{
            if(x == y){
                if(y == z){
                    System.out.println(ALL_EQUAL_MESSAGE);
                }else{
                    System.out.println(NEITHER_MESSAGE);
                }
            }else if(y == z){
                System.out.println(NEITHER_MESSAGE);
            }else if(x == z){
                System.out.println(NEITHER_MESSAGE);
            }else{
                System.out.println(ALL_DIFFERENT_MESSAGE);
            }
        }
    }

    public static void main(String[] args)
    {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
}
