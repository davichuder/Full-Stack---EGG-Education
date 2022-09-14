package prueba;

import java.util.ArrayList;

public class app {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add(list1.get(0));
        list2.add(list1.get(1));
        list2.add(list1.get(2));
        System.out.println(list2);

        list1.remove(0);
        System.out.println(list1);
        System.out.println(list2);

        list1.removeIf(x -> x.equals("c"));
        System.out.println(list1);
        System.out.println(list2);
    }

}
