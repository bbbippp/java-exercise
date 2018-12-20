/**
 * @author Ian Gumilang
 */
public class CodingExerciseMegaBytesConverter
{
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = 1024;
        int kbLeft = kiloBytes % mb;
        int mbactual = kiloBytes / mb;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + mbactual + " MB and " + kbLeft + " KB");
        }
    }

    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2080);
    }
}
