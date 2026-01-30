package com.junit;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ListManagerTest{
    @Test
    public void testAddElement(){
        ListManager manager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement(){
        ListManager manager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        manager.removeElement(list, 20);
        assertFalse(list.contains(20));
        assertEquals(0, list.size());
    }

    @Test
    public void testGetSize(){
        ListManager manager = new ListManager();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}

