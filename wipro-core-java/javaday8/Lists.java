package javaday8;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list.get(2));
        // System.out.println(list.toString());
        // System.out.println(list.remove(2));
        // System.out.println(list.size());
        // System.out.println(list.contains(3));
        // list.clear();
        // System.out.println(list.isEmpty());
        //list.forEach(e-> System.out.println(e));
        list.forEach(System.out::println);
    }
    
}
