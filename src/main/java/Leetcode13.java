import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {

    Map<Character, Integer> m=new HashMap<>();
    Integer x=0;

    public Integer stingToInt(String s){
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        //符号对应数字一个一个，现场找规律有点难。
        Integer value=0;
        Integer result = 0;
        for (int i = 0; i <s.length() ; i++) {
            value=m.get(s.charAt(i));
            if((i < s.length() - 1&&value<m.get(s.charAt(i+1)))){
                //排除最后一个，并且保证前一个小的命题规律。
                result-=value;
            }
            else {
                result+=value;
            }

        }



        return result;
    }










}
