import java.util.HashMap;

public class HW6{
    public static void main(String[] args) {
        MyHash set = new MyHash();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3); //повторяющийся не запишется

        System.out.println(set);
        System.out.println(set.get(2));
    }
}

class MyHash{

    private HashMap<Integer, Object> values = new HashMap<>();
    private static final Object K = new Object();

    void add(int data){
        values.put(data, K);
    }

    @Override
    public String toString() {
        return values.keySet().toString();
    }

    int get(int index){
        return (int) values.keySet().toArray()[index];
    }
}