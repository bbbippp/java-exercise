public class StaticOne {

    int id;
    String name;
    static String major = "Engineering";
    static int count=0;

    static void changeMajor(){
        major = "Pharmacy";
    }

    StaticOne(int id, String name){
        this.id = id;
        this.name = name;
        count++;
    }

    void printMe(){
        System.out.println("id: " + id + ", name: " + name + ", major: " + major + ", count: " + count);
    }

    public static void main(String[] args) {
        for(int i = 0 ; i<3; i++) {
            StaticOne so = new StaticOne(3, "ian");

            so.printMe();
        }

        for(int i = 0 ; i<3; i++) {
            StaticOne.changeMajor();
            StaticOne so = new StaticOne(3, "ian");
            so.printMe();
        }

        //System.out.println(id);
    }
}
