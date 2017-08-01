package CodingBat.Arrays;

import java.util.Arrays;

/**
 * Created by Yurbly on 29.07.2017.
 */
public class Arrays_2 {

    public int countEvens(int[] nums) {
        int count = 0;

        for(int i : nums){
            if(i%2 == 0) count++;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        if(nums.length == 1) return 0;
        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 0; i < nums.length - 1; i++){
            largest = Math.max(largest, nums[i + 1]);
            smallest = Math.min(smallest, nums[i + 1]);

        }
        return largest - smallest;
    }

    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++){
            sum += nums[i];
        }
        return sum/(nums.length - 2);

    }

    public int sum13(int[] nums) {
        int sum = (nums.length == 0 || nums[0] == 13) ? 0 : nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == 13 || nums[i - 1] == 13) continue;
            sum += nums[i];
        }

        return sum;
    }

    public int sum67(int[] nums) {
        boolean flag = false;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 6) flag = true;
            if(!flag) sum += nums[i];
            if(nums[i] == 7) flag = false;

        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i : nums){
            if(i == 1 || i == 3) return false;
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i : nums){
            if(i == 2) sum += 2;
        }
        return sum == 8 ? true : false;
    }

    public boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;
        for (int i : nums){
            if (i == 1) oneCount++;
            if (i == 4) fourCount++;
        }
        return oneCount > fourCount ? true : false;
    }

    public int[] fizzArray(int n) {
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }
        return a;
    }

    public boolean only14(int[] nums) {
        for(int i : nums){
            if(i == 1 || i == 4) continue;
            return false;
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] str = new String[n];
        for(int i = 0; i < str.length; i++)
        {
            str[i] = String.valueOf(i);
        }
        return str;
    }

    public boolean no14(int[] nums) {
        boolean oneHere = false;
        boolean fourHere = false;
        for(int i : nums){
            if(i == 1 && !oneHere) oneHere = true;
            if(i == 4 && !fourHere) fourHere = true;
        }
        return !oneHere || !fourHere;
    }

    public boolean isEverywhere(int[] nums, int val) {
        if(nums.length < 2) return true;
        if(nums[0] != val && nums[1] != val) return false;
        for(int i = 0; i < nums.length; i += 2){
            if(nums[i] != val && i < 2){
                i--;
                continue;
            }
            if(nums[i] != val){
                return false;
            }

        }
        return true;

    }


    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2) two = true;
            if(nums[i] == 4 && nums[i + 1] == 4) four = true;
        }
        return two ^ four;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int diff;
        for (int i = 0; i < nums1.length; i++){
            diff = Math.abs(nums1[i] - nums2[i]);
            if(diff > 0 && diff < 3) count++;
        }
        return count;
    }

    public boolean has77(int[] nums) {
        boolean case1 = false;
        boolean case2 = false;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 7){
                for(int j = i + 1; j < i + 3 && j < nums.length; j++){
                    if(nums[j] == 7) return true;

                }
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean oneDetected = false;

        for(int i : nums){
            if(i == 1 && !oneDetected) oneDetected = true;
            if(i == 2 && oneDetected) return true;
        }
        return false;

    }

    public boolean modThree(int[] nums) {
        outer:
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < i + 3 && j < nums.length; j++){
                if(nums[i] % 2 == 0){
                    if(nums[j] % 2 != 0) continue outer;
                    if (j == i + 2) return true;
                }
                else if(nums[i] % 2 != 0){
                    if (nums[j] % 2 == 0) continue outer;
                    if (j == i + 2) return true;
                }
            }

        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 3) {
                count++;
                if(i + 1 < nums.length && nums[i + 1] == 3) return false;

            }
        }
        return count == 3;
    }

    public boolean twoTwo(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                if((i - 1 < 0 || nums[i - 1] != 2)
                        && (i + 1 >= nums.length || nums[i + 1] != 2)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean sameEnds(int[] nums, int len) {
        if (len == 0) return true;
        int[] begin = new int[len];
        int[] end = new int[len];

        for(int i = 0; i < len; i++){
            if(nums[i] != nums[(nums.length - len) + i]) return false;
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if(nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1) return true;

        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {

        int diff = end - start;
        int[] result = new int[diff];

        for (int i = 0; i < diff; i++){
            result[i] = start + i;
        }

        return result;
    }


    public int[] shiftLeft(int[] nums) {
        if(nums.length == 0) return new int[0];
        int temp = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] tenRun(int[] nums) {
        int mult = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0){
                flag = true;
                mult = nums[i];
            }
            if(flag) nums[i] = mult;
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int f = 0;
        for(int i : nums){
            if(i == 4) break;
            f++;
        }
        int[] result = new int[f];
        for(int i = 0; i < f; i++){
            result[i] = nums[i];
        }
        return result;
    }

    public int[] post4(int[] nums) {
        int f = 0;
        for (int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 4){
                f = i + 1;
                break;
            }
        }
        int[] res = new int[nums.length - f];
        for (int i = 0; i < res.length; i++){
            res[i] = nums[f + i];
        }
        return res;
    }

    public int[] notAlone(int[] nums, int val) {

        for (int i = 1; i < nums.length - 1; i++){
            if(nums[i] == val
                    && nums[i] != nums[i - 1]
                    && nums[i] != nums[i + 1]){
                nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int zeroCount = 0;
        int nonZeroCount = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++){
            if(nums[i] == 0){
                res[i - nonZeroCount] = 0;
                zeroCount++;
            }
            if(nums[i] != 0) {
                res[res.length - 1 - i + zeroCount] = nums[i];
                nonZeroCount++;
            }
        }
        return res;
    }

    public int[] withoutTen(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < res.length; i++){
            if(nums[i] != 10) {
                res[j] = nums[i];
            }
            else{
                continue;
            }
            j++;
        }
        return res;
    }

    public int[] zeroMax(int[] nums) {
        int odd;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                odd = 0;
                for(int j = i + 1; j < nums.length; j++){
                    if (nums[j] % 2 == 0) continue;
                    odd = odd > nums[j] ? odd : nums[j];
                }
                nums[i] = odd;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[i - odd] = nums[i];
                even++;
            }
            else{
                res[res.length - 1 - i + even] = nums[i];
                odd++;
            }
        }
        return res;

    }

    public String[] fizzBuzz(int start, int end) {
        int length = end - start;
        String[] res = new String[length];
        for (int i = 0; i < length; i++){
            String n = String.valueOf(i + start);
            if((i + start) % 3 == 0) n = "Fizz";
            if((i + start) % 5 == 0) n = "Buzz";
            if((i + start) % 5 == 0 && (i + start) % 3 == 0) n = "FizzBuzz";
            res[i] = n;
        }
        return res;
    }




}
