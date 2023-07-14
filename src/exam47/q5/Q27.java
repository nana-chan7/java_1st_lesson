package exam47.q5;

import java.util.LinkedList; 
// ArrayListの親戚のようなもの
// 順序の保証がされていない ArrayListに対して LinkedListは保証されている

public class Q27 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.addLast("2");
        ll.addFirst("3");
        for (String s : ll) {
            System.out.println(s);
        }
    }
}
