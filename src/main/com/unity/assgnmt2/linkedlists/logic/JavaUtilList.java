package com.unity.assgnmt2.linkedlists.logic;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ypolshchykau on 03.08.2015.
 */
public class JavaUtilList {

    private  java.util.LinkedList<Integer> javaUtilList;
    public  JavaUtilList(){
        javaUtilList = new java.util.LinkedList<Integer>();

    }

/**
 * append item
 */

    public void append(Integer a){
        javaUtilList.add(a);
    }

    /**
     * appeand and sort list in asc order
     * @return
     */
    public void appendInAscendingOrder(Integer toAppend){
        javaUtilList.add(toAppend);
        Collections.sort(javaUtilList);
     /*   Collections.sort(javaUtilList, new Comparator<Integer>() {
            public int compare(Integer p1, Integer p2) {
                return Integer.valueOf(p1).compareTo(p2);
            }
        });
*/

    }



    public String toString(){
        return javaUtilList.toString();
    }



}
