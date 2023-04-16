package design.principle._06_liskov_substitution_principle;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //你可以将LinkedList替换成ArrayList不会又任何问题
        LinkedList<String> strings = new LinkedList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        List<String> strings1 = strings.subList(2, 3);
        System.out.println(strings1);

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");
        myArrayList.set(2,"A");
        IList<String> stringIList = myArrayList.subList(3, 5);

        System.out.println(stringIList.get(0));
        System.out.println(myArrayList.get(0));
        System.out.println(stringIList.size());

    }
}
