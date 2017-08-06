package CodingBat.Arrays;

import java.util.Arrays;

/**
 * Created by Yurbly on 04.08.2017.
 */
public class Arrays_3 {

    public int maxSpan(int[] nums) {
        if(nums.length == 0) return 0;
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++){
            int span = 1;
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    span = j - i + 1;
                }
            }
            maxSpan = span > maxSpan ? span : maxSpan;
        }
        return maxSpan;
    }

    public int[] fix34(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 3){
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 4 && (j - 1 >= 0) && nums[j - 1] != 3){
                        swap(nums, i + 1, j);

                    }
                }
            }
        }
        return nums;
    }

    public int[] swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        return nums;
    }

    public int[] fix45(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 4){
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 5 && (j - 1 < 0 || nums[j - 1] != 4)){
                        swap(nums, i + 1, j);

                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            sum += nums[i];
            int sum2 = 0;
            for(int j = i - 1; j >= 0; j--){
                sum2 += nums[j];
            }
            if(sum == sum2) return true;
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length > outer.length) return false;
        marker:
        for(int i = 0; i < inner.length; i++){
            for(int j = 0; j < outer.length; j++){
                if(inner[i] == outer[j]){

                    continue marker;
                }

            }
            return false;
        }
        return true;
    }

    public int[] squareUp(int n) {
        int[] res = new int[n*n];
        for (int i = 0; i < n; i++){
            for(int j = n - 1; j > n - 2 - i; j--){
                res[i*n + j] = n - j;
            }
        }
        return res;
    }

    public static int[] seriesUp(int n) {
        int[] res = new int[n*(n + 1)/2];
        for (int i = 0, a = 0; a <= n && i < res.length - n + 1; i = a*(a + 1)/2, a++){
            for(int j = 1; j < a + 1; j ++){
                res[i + j - 1] = j;
            }
        }
        return res;
    }

    public static int maxMirror(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length - 1; j >=0 ; j--){
                if (nums[i] == nums[j]){
                    int count = 1;
                    for(int k = i + 1, l = j - 1; k < nums.length && l >= 0; k++, l--){
                        if (nums[k] == nums[l]){
                            count++;
                            System.out.println(" k = l,  count = " + count);
                        }
                        else{
                            res = count > res ? count : res;
                            break;
                        }
                    }
                    res = count > res ? count : res;
                }
            }
        }
        return res;
    }

    public int countClumps(int[] nums) {
        int clump = 0;
        boolean inClump = false;
        for (int i = 0; i < nums.length - 1; i++){

            if (nums[i] == nums[i + 1] && !inClump){
                clump++;
                inClump = true;
            }
            else if(nums[i] == nums[i + 1]){}
            else{
                inClump = false;
            }
        }
        return clump;
    }





}
