package com.fastcapus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class JavaSort<T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}
