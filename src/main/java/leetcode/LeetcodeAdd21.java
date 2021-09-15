package leetcode;
//合并两有序链表
public class LeetcodeAdd21 {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
      else if (l2==null){
            return l1;
        }
       else if (l1.value< l2.value){
            //递归调用
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
           l2.next = mergeTwoLists(l2.next, l1);
           return l2;
        }







        return
    }






}
