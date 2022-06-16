package array_list;


import java.util.Arrays;

public class ArrayList34 {
    public static void main(String[] args) {
        int [] nums ={65,34,23,78,20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);

        for(int i =nums.length-1; i >=0;i--) {
            System.out.println(nums[i] + "");
        }
    }
}
