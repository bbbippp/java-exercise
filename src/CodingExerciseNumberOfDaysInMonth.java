/**
 * @author Ian Gumilang
 */
public class CodingExerciseNumberOfDaysInMonth
{
    public static boolean isLeapYear(int year){
        boolean result = false;

        if(year >= 1 && year <= 9999){
            boolean divisibleByFour = (year%4 == 0);
            boolean divisibleByHundred = (year%100 == 0);
            boolean divisibleByFourHundred = (year%400 == 0);

            if(divisibleByFourHundred){
                result = true;
            }else if(divisibleByFour){
                if(!divisibleByHundred){
                    result = true;
                }
            }
        }

        return result;
    }

    public static int getDaysInMonth(int month, int year){
        int result = -1;

        if(month < 1 || month > 12){
            return result;
        }
        if(year < 1 || year > 9999){
            return result;
        }

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = 31;
                break;
            case 2:
                result = isLeapYear(year) ? 29 : 28;
                break;
            default:
                result = 30;
                break;
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(4, 2020));
    }
}
