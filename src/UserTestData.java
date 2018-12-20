import java.util.Random;


public class UserTestData {

    public static final String name = "Ian";
    public static final int age = 25;
    String position;

    private static final String[] EXAMPLE_HANDLES = new String[]{"aaa","bbb","ccc","aab","aac","aad","aae","aaf","aag","aah",};

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void main(String[] args) {
        Random random = new Random();

        //return EXAMPLE_HANDLES[random.nextInt(27)];


        System.out.println(UserTestData.age);
        //System.out.println(EXAMPLE_HANDLES);
    }


}
