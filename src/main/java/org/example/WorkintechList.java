package org.example;

import java.util.*;


public class WorkintechList extends ArrayList {

    public WorkintechList() {

    }

    public void sort() {

    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public boolean remove(Object item){
        sort();
        return false;
    }

}
