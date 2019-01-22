/**
 * @author Ian Gumilang
 */
public class LectureSwitch
{
    public static void testSwitch(char switchValue)
    {
        switch(switchValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("value found");
                break;
            default:
                System.out.println("value not found");
                break;
        }
    }

    public static void main(String[] args)
    {
        testSwitch('F');
    }
}
