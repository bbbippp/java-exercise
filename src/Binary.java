//https://www.hackerrank.com/challenges/30-binary-numbers/problem

public class Binary {
    public static void main(String[] args) {
        String toBinary = Integer.toBinaryString(5);

        System.out.println(toBinary);

        String[] ary = toBinary.split("");
        //System.out.println(toBinary.length());
        String temp = "0";
        int result = 1;
        int realresult = 1;
        for(int i=0; i<toBinary.length(); i++){
            //System.out.println("temp = " + temp + ", array = " + ary[i]);
            if(temp.equals(ary[i])){
                result++;
                if(result > realresult){
                    realresult = result;
                }
            }else{
                result = 1;
            }
            temp = ary[i];
        }
        System.out.println(realresult);
    }

}
