import java.util.*;

public class Cow extends Animal {
    int NumberOfHorns;

    public Cow(int h){
        super(4);
        NumberOfHorns = h;
    }

    public int GetNumberOfHorns(){
        return NumberOfHorns;
    }

    public static void main(String[] args) {
        Cow mycow = new Cow( 2);

        System.out.println("Number of horns : " + mycow.GetNumberOfHorns());
        System.out.println("Number of legs : " + mycow.GetNumLegs());

        Map<String,String> map=new HashMap<String,String>();
        map.put("ian", "082216174187");
        map.put("nia", "085776158060");
        map.put("nai", "08197807146");

        for(int i=0;i<3;i++){
            // Write code here
            if(map.containsKey("ian")){
                System.out.println("ian" + "=" + map.get("ian"));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
