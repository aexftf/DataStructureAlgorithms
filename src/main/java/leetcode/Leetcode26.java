package leetcode;

import Self.implemented.data.structure.bottom.MyArrayList;

import java.util.ArrayList;

/**
 * @author Lenovo
 * 删除有序数组中的重复项
 */
public class Leetcode26 {
   //暴力法：用一个数组接着不同的数

    public ArrayList toNoRepeatArray(ArrayList a){
        ArrayList<Integer> integers2 = new ArrayList<Integer>();
        for (int i = 0; i <a.size(); i++) {
            if (a.get(i)!=a.get(i+1)){
                integers2.add((Integer) a.get(i));
            }
        }
    return integers2;

    }



   public static void main(String[] args) {
        //默认已排序
       ArrayList<Integer> integers = new ArrayList<Integer>();
       integers.add(1);
       integers.add(1);
       integers.add(1);
       integers.add(5);
       integers.add(0);



   }

}
