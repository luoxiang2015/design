package com.lx.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author lx
 * @description TODO
 * @date 2020/9/30 16:35
 */
public class XiaoPeng {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");

        LinkedHashSet<String> sets = new LinkedHashSet<>(list);
        list2.forEach(item ->{
            sets.add(item);
        });
        System.out.println(sets.toString());


    }
}
