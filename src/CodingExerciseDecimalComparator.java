/**
 * @author Ian Gumilang
 */
public class CodingExerciseDecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double firstOne, double secondOne){
        boolean result = false;

        if(firstOne >  0 && secondOne < 0){
            result = false;
        }else if(firstOne < 0 && secondOne > 0){
            result = false;
        }else{
            String strOfFirstOne = String.valueOf(firstOne);;
            String strOfSecondOne = String.valueOf(secondOne);
            int lengthOfStrOfFirstOne = strOfFirstOne.length();
            int lengthOfStrOfSecondOne = strOfSecondOne.length();
            int dotOfFirstOne = strOfFirstOne.indexOf(".");
            int dotOfSecondOne = strOfSecondOne.indexOf(".");

            int decimalAfterDotOne = lengthOfStrOfFirstOne - dotOfFirstOne - 1;
            int decimalAfterDotTwo = lengthOfStrOfSecondOne - dotOfSecondOne - 1;

            String compareStrOne;
            String compareStrTwo;

            if(decimalAfterDotOne >= 3){
                compareStrOne = strOfFirstOne.substring(0, strOfFirstOne.indexOf(".")+4);
                compareStrTwo = strOfSecondOne.substring(0, strOfSecondOne.indexOf(".")+4);
                if(compareStrOne.equals(compareStrTwo)){
                    result = true;
                }
            }else{

                compareStrOne = strOfFirstOne.substring(0, (lengthOfStrOfFirstOne - dotOfFirstOne + 1));
                compareStrTwo = strOfSecondOne.substring(0, lengthOfStrOfSecondOne - dotOfSecondOne + 1);
                if(compareStrOne.equals(compareStrTwo)){
                    result = true;
                }

            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(String.valueOf(areEqualByThreeDecimalPlaces(3.1756, 4.1757)));
    }
}
