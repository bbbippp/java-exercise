public class ThisOne {

    private int[] elements;
    public int maximumDifference;

    ThisOne(){
        System.out.println("without input");
    }
    ThisOne(int i){
        System.out.println("Integer : " + i);
    }
    ThisOne(String j){
        System.out.println("Yellow! I am string : " + j);
    }

    ThisOne(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        for(int i = 0; i < elements.length; i++){
            for(int j = i+1; j < elements.length; j++){
                System.out.println(elements[i]);
                System.out.println(elements[j]);
                System.out.println((elements[j]-elements[i]));
                if((elements[j]-elements[i]) > maximumDifference){
                    maximumDifference = (elements[j]-elements[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        //this(4);
//        ThisOne ts = new ThisOne("green");
//        ThisOne ti = new ThisOne(3);
        int[] a = {1,2,3,4,5};
        ThisOne to = new ThisOne(a);

        to.computeDifference();

        System.out.println(to.maximumDifference);

    }
}
