package com.fastcapus.javaoop;

import com.fastcapus.javaoop.logic.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort=new BubbleSort<>();

        System.out.println(sort.sort(Arrays.asList(args)));
    }

}
