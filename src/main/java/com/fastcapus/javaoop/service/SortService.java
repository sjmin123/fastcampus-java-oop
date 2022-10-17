package com.fastcapus.javaoop.service;

import com.fastcapus.javaoop.logic.JavaSort;
import com.fastcapus.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String>sort){
        this.sort=sort;
    }


    public List<String> doSort(List<String>list){
        return sort.sort(list);
    }
}
