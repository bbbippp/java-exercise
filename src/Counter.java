public class Counter {
    int count;

    public Counter(){
        count = 0;
    }

    public void Increment(){
        count++;
    }

    public int GetCount(){
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("my counter is on : " + counter.GetCount());
        for(int i = 0; i<5; i++){counter.Increment();}
        System.out.println("my counter is on : " + counter.GetCount());

    }
}
