package CodingBat.WarmUp;

/**
 * Created by Yurbly on 08.07.2017.
 */
public class WarmUp_2 {

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        String begin = str.length() <= 3 ? str : str.substring(0,3);
        for(int i = 0; i < n; i++){
            result += begin;
        }
        return result;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) != 'x') continue;
            // for (int j = i; j < str.length(); j++){
            //   if(str.charAt(j) != 'x') continue;
            if(str.charAt(i + 1) == 'x') count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == 'x'){
                if(str.charAt(i + 1) == 'x') return true;
                else return false;
            }
        }
        return false;
    }

    public String stringBits(String str) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2){
            stb.append(str.charAt(i));
        }
        return stb.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder stb = new StringBuilder();
        for(int i = 1; i < str.length(); i++){
            stb.append(str.substring(0, i));
        }
        stb.append(str);
        return stb.toString();
    }

    public int last2(String str) {
        if (str.length() < 3) return 0;
        int count = 0;
        String temp = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++){
            if(temp.equals(str.substring(i, i + 2))) count++;
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9) count++;
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++){
            if(nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] != 1) continue;
            if (nums[i + 1] != 2) continue;
            if (nums[i + 2] != 3) continue;
            return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {

        int l = (a.length() < b.length()) ? a.length() : b.length();
        if (l < 2) return 0;
        int count = 0;
        for (int i = 0; i < l - 1; i++){
            if(a.substring(i, i + 2).equals(b.substring(i , i + 2))) count++;
        }
        return count;
    }

    public String stringX(String str) {

        if(str.length() < 2) return str;
        StringBuilder stb = new StringBuilder();
        stb.append(str.charAt(0));
        char ch;
        for(int i = 1; i < str.length() - 1; i++){
            ch = str.charAt(i);
            if (ch != 'x') stb.append(ch);

        }
        stb.append(str.charAt(str.length() - 1));
        return stb.toString();
    }

    public String altPairs(String str) {
        if (str.length() < 2) return str;
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 4){
            for (int j = i; j < str.length() && j < i + 2; j++){
                stb.append(str.charAt(j));
            }
        }
        return stb.toString();


    }

    public String stringYak(String str) {

        StringBuilder stb = new StringBuilder(str);
//
        while(stb.indexOf("yak") != -1){
            stb.delete(stb.indexOf("yak"), stb.indexOf("yak") + 3);
        }
        return stb.toString();
    }

    public int array667(int[] nums) {
        if (nums.length < 2) return 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if((nums[i] == 6 || nums[i] == 7) && nums[i - 1] == 6) count++;
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) return false;
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i + 1] - nums[i] != 5) continue;
            if(nums[i] - nums[i+2] < -1 || nums[i] - nums[i+2] > 3) continue;
            return true;
        }
        return false;
    }


}
