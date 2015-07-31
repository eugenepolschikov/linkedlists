package main.com.unity;

import main.com.unity.assgnmt2.linkedlists.logic.MyLinkedList;

/**
 * Created by ypolshchykau on 31.07.2015.
 */
public class Runner
{
    public static void main( String[] args )
    {

        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
      /*  list.append(5);
        list.append(7);
        list.append(-5);
        System.out.println(list.toString() + "\n");

        System.out.println("test delete item action\n");
        list.remove(7);
        System.out.println("the whole list after one item delete\n");
        System.out.println(list.toString() + "\n");*/

//        test case1: asc order
        list.addInAscOrder(12);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(3);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(-1);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(-5);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(-3);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(15);
        System.out.println(list.toString() + "\n");

        list.addInAscOrder(15);
        System.out.println(list.toString() + "\n");





    }
}

