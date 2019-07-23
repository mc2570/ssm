package com.zking.test;

import java.util.function.Predicate;

public class MyPro implements Predicate{


    @Override
    public boolean test(Object o) {
        return false;
    }

    public String strA(String s){
        if(s.contains("a")){
            return null;
        }
        return s;
    }

}
