package com.junit;

import java.util.List;
public class ListManager{
    public void addElement(List<Integer> list, int element){ // Add element to list
        list.add(element);
    }
    
    public void removeElement(List<Integer> list, int element){  // Remove element from list
        list.remove(Integer.valueOf(element));                   // remove by value
    }

    public int getSize(List<Integer> list){   // Get size of list
        return list.size();
    }
}
