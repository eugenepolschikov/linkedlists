package com.unity;


import com.unity.assgnmt2.linkedlists.logic.JavaUtilList;
import com.unity.assgnmt2.linkedlists.logic.MyLinkedList;

/**
 * Created by ypolshchykau on 31.07.2015.
 */
public class Runner
{
    public void listsPrinter(MyLinkedList<Integer> appendList,MyLinkedList<Integer> prependList,
                             MyLinkedList<Integer> mySortedList, JavaUtilList javaUtilList){
        System.out.println("my append list:\n"+appendList.toString()+"\n"+
        "my prepend list:\n"+prependList.toString()+"\n"+
        "my list in asc order:\n" + mySortedList.toString()+"\n"+
        "java lib sorted list:\n"+javaUtilList+"\n");
    }
    public static void main( String[] args )
    {
        Runner instance= new Runner();

        MyLinkedList<Integer> appendList = new MyLinkedList<Integer>();
        MyLinkedList<Integer> prependList = new MyLinkedList<Integer>();
        MyLinkedList<Integer> myListToAddInAcsOrder = new MyLinkedList<Integer>();
        JavaUtilList javaLibList = new JavaUtilList();

//        #case 1 adding 1  item:
        Integer num1=new Integer(12);
        appendList.append(num1);
        prependList.prepend(num1);
        myListToAddInAcsOrder.addInAscOrder(num1);
        javaLibList.appendInAscendingOrder(num1);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        Integer num2 = new Integer(3);
        appendList.append(num2);
        prependList.prepend(num2);
        myListToAddInAcsOrder.addInAscOrder(num2);
        javaLibList.appendInAscendingOrder(num2);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        Integer num3= new Integer(-1);
        appendList.append(num3);
        prependList.prepend(num3);
        myListToAddInAcsOrder.addInAscOrder(num3);
        javaLibList.appendInAscendingOrder(num3);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        Integer num4= new Integer(-5);
        appendList.append(num4);
        prependList.prepend(num4);
        myListToAddInAcsOrder.addInAscOrder(num4);
        javaLibList.appendInAscendingOrder(num4);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        Integer num5 = new Integer(-3);
        appendList.append(num5);
        prependList.prepend(num5);
        myListToAddInAcsOrder.addInAscOrder(num5);
        javaLibList.appendInAscendingOrder(num5);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        Integer num6= new Integer(15);
        appendList.append(num6);
        prependList.prepend(num6);
        myListToAddInAcsOrder.addInAscOrder(num6);
        javaLibList.appendInAscendingOrder(num6);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        Integer num7 = new Integer(15);
        appendList.append(num7);
        prependList.prepend(num7);
        myListToAddInAcsOrder.addInAscOrder(num7);
        javaLibList.appendInAscendingOrder(num7);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        Integer num8 = new Integer(-300);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


        num8 = new Integer(225);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(225);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(225);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(0);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(0);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(0);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);

        num8 = new Integer(1);
        appendList.append(num8);
        prependList.prepend(num8);
        myListToAddInAcsOrder.addInAscOrder(num8);
        javaLibList.appendInAscendingOrder(num8);
        instance.listsPrinter(appendList,prependList,myListToAddInAcsOrder,javaLibList);


    }
}

