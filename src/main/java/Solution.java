import sun.text.resources.cldr.ext.FormatData_en_JE;

/**
 * @author DELL
 */
public class Solution {
    public static void main(String[] args) {

    }



    public int[]twoSum(int []nums,int target) throws Exception {
        int i = 0;
        int j = 1;
        int len = nums.length - 1;
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                } else {
                    return new int[]{};
                }
            }

        }
        throw new Exception("没有哦");
    }


}
