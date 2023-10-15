package me.whiteship;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(20);
        integerList.add(44);
        integerList.add(3);
        integerList.add(2);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        integerList.sort(desc);

        System.out.println(integerList);
    }

}
