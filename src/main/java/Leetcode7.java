/**

反转整数
 * @author DELL
力扣思路混乱时可以用特殊值法，想一个简单的数就可以验证，再加上特殊情况；


比如此题想23；

 */


public class Leetcode7 {

    public static void main(String[] args) {
reverse(213);


    }



    public static int reverse(int x){
        final  int MAXInteger= (int) (Math.pow(2,31)-1);
        final  int MINInteger= (int) -Math.pow(2,31);
        int ret = 0;
        int value=0;
        if(x>MAXInteger||x<MINInteger){
            return 0;
        }
        while(x!=0){
            value=x%10;
            x=x/10;
            ret=ret*10+value;
        }


        return ret;
    }




}
