package pl.designs.customarraylist;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();

        for(int i = 1; i <= 25; i++) {
            list.add(i);
        }

        list.remove(3);

        System.out.println(list.size());
    }
}
