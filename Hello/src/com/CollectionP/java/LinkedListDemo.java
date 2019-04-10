package com.CollectionP.java;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.add("5");
        l.add("Iqbal");
        l.add("R");
        System.out.println(l);
        l.set(0,"Durga");
        l.add("Solution");
        System.out.println(l);
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l);

	}

}
