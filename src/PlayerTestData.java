public class PlayerTestData extends UserTestData {
    static int playerCount;
    String name;
    int age;

    public static void main(String[] args) {
        String position = "Striker";

        String result = PlayerTestData.setThisShit(position);

        System.out.println(result);
                for (int i = 0; i <= 100; i++)
                {
                    if(i % 5 != 0)
                    {
                        continue;
                    }

                    System.out.println(i);
                }
    }

    public static String setThisShit(String position){
        UserTestData users = new UserTestData();

        users.setPosition("Striker");

        return users.getPosition();
    }
}
