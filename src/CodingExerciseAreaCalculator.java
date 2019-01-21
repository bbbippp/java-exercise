/**
 * @author Ian Gumilang
 */
public class CodingExerciseAreaCalculator
{
    private static final double PI = 3.14159;

    public static double area(double radius)
    {
        double result = -1.0;

        if(radius < 0){
            return result;
        }

        result = radius * radius * PI;

        return result;
    }

    public static double area(double x, double y)
    {
        double result = -1.0;

        if(x < 0 || y < 0)
        {
            return result;
        }

        result = x * y;

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0,4.0));
    }
}
