package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        numbs.add(6);
        numbs.add(7);
        numbs.add(8);
        Optional<Integer> max = numbs.stream().filter(x -> x % 2 ==0).map(x -> x * x).max(Integer::compare);
        System.out.println(max.get());

    }
}
