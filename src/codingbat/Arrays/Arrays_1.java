package CodingBat.Arrays;

/**
 * Created by Yurbly on 09.07.2017.
 */
public class Arrays_1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && (nums[0] == nums[nums.length - 1]));
    }

    public int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length -1] == b[b.length -1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++)
        {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int[] a = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            a[i] = nums[nums.length - 1 - i];
        }
        return a;
    }

    public int[] maxEnd3(int[] nums) {
        int biggest = nums[0] > nums[2] ? nums[0] : nums[2];
        nums[0] = biggest;
        nums[1] = biggest;
        nums[2] = biggest;

        return nums;
    }

    public int sum2(int[] nums) {
        if(nums.length == 0) return 0;
        if (nums.length < 2) return nums[0];
        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] c = {a[1],b[1]};
        return c;
    }

    public int[] makeEnds(int[] nums) {
        int[] a = {nums[0], nums[nums.length - 1]};
        return a;
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) return false;
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] a = new int[nums.length * 2];
        a[a.length - 1] = nums[nums.length - 1];
        return a;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        return (nums[0] == 2 || nums[0] == 3) && nums[0] == nums[1];
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < 2; i++){
            if (nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length > 0 && a[0] == 1) count++;
        if(b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {

        return (a[0] + a[1]) < (b[0] + b[1]) ? b : a;
    }

    public int[] makeMiddle(int[] nums) {
        int[] a = {nums[nums.length/2 - 1], nums[nums.length/2]};
        return a;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] c = {a[0], a[1], b[0], b[1]};
        return c;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] middle = {nums[nums.length / 2 - 1], nums[nums.length / 2],
                nums[nums.length / 2 + 1]};
        return middle;
    }

    public int maxTriple(int[] nums) {
        int biggest = nums[0];
        if(nums[nums.length/2] > biggest) biggest = nums[nums.length/2];
        if(nums[nums.length - 1] > biggest) biggest = nums[nums.length - 1];
        return biggest;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 3) return nums;
        int[] a = {nums[0], nums[1]};
        return a;
    }

    public boolean unlucky1(int[] nums) {
        if(nums.length < 2) return false;
        if((nums[0] == 1 && nums[1] == 3)
                ||(nums[1] == 1 && nums[2] == 3)
                || (nums[nums.length - 2] == 1 && nums[nums.length -1] == 3)){
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] c = new int[2];
        if(a.length == 0) {
            c[0] = b[0];
            c[1] = b[1];
        }
        else if(a.length == 1){
            c[0] = a[0];
            c[1] = b[0];
        }
        else{
            c[0] = a[0];
            c[1] = a[1];
        }
        return c;

    }

    public int[] front11(int[] a, int[] b) {

        if(a.length == 0 && b.length == 0){
            int[] c = {};
            return c;
        }

        else if(a.length == 0){
            int[] c = {b[0]};
            return c;
        }
        else if(b.length == 0){
            int[] c = {a[0]};

            return c;
        }
        else{
            int[] c = {a[0], b[0]};

            return c;
        }

    }




}
