package com.alfa.work1;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Shape)o1).getColor().compareTo(((Shape)o2).getColor());
    }
}
