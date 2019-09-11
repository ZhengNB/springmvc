package com.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,demo> map =new HashMap<String, demo>();
        demo d=new demo();
        map.put("1",d);
        map.put("2",d);
        map.put("3",d);
        System.out.println(map.get("1"));
        System.out.println(map.get("4"));
    }
}
