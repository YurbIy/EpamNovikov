package CodingBat.WarmUp_1;

/**
 * Created by Yurbly on 26.06.2017.
 */
public class WarmUp_1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday | vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) return (a + b) * 2;
        else return a + b;
    }

    public int diff21(int n) {
        if (n > 21) return Math.abs(n - 21) * 2;
        else return Math.abs(n - 21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        return (((a == 10) || (b == 10)) || (a + b == 10));
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) >= 0) && (Math.abs(100 - n) <= 10)) || ((Math.abs(200 - n) >= 0) && (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == false)
            return ((a < 0) ^ (b < 0));
        else return (a < 0) & (b < 0);
    }

    public static String notString(String str) {
        if (str.equals("not") || str.startsWith("not ")){
            return str;
        }
        else{
            return "not " + str;
        }
    }

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        return str.length() <= 1 ? str : str.charAt(str.length() - 1) + str.substring(1,(str.length() - 1)) + str.charAt(0);
    }

    public String front3(String str) {
        return (str.length() < 4)? (str + str + str) : (str.substring(0,3) + str.substring(0,3) + str.substring(0,3));
    }

    public String backAround(String str) {
        char a = str.charAt(str.length() - 1);
        return  a + str + a;
    }

    public boolean or35(int n) {
        return ((n % 3) == 0) || ((n % 5) == 0);
    }

    public String front22(String str) {
        if(str.length() <= 2){
            return str + str + str;
        }
        else{
            String a = str.substring(0,2);
            return a + str + a;
        }
    }

    public boolean startHi(String str) {
        if (str.length() <= 1) return false;
        return str.substring(0,2).equals("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0) && (temp2 > 100)) || ((temp1 > 100) && (temp2 < 0));
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10) && (a <= 20)) || ((b >= 10) && (b <=20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19)) || ((c >= 13) && (c <= 19));
    }

    public boolean loneTeen(int a, int b) {
        return ((a >= 13) && (a <= 19)) ^ ((b >= 13) && (b <= 19));
    }

    public String delDel(String str) {
        if(str.length() < 4){
            return str;
        }

        else if(str.substring(1,4).equals("del")){
            return str.charAt(0) + str.substring(4, str.length());

        }
        else{
            return str;
        }
    }

    public boolean mixStart(String str) {
        if (str.length() < 3){
            return false;
        }
        else if (str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
            return c;
        } else if (a <= b) {
            if (b > c) {
                return b;
            }
            return c;
        }
        if (a > c) {
            if (a > b) {
                return a;
            }
            return b;
        } else if (a <= c) {
            if (c > b) {
                return c;
            }
            return b;
        }

        if (b > c) {
            if (b > a) {
                return b;
            }
            return a;
        } else if (b <= c) {
            if (c > a) {
                return c;
            }
            return a;
        }
        return a;
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)){
            return a;
        }
        else if (Math.abs(10 - a) > Math.abs(10 - b)){
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        return (((a >= 30) && (a <= 40)) && ((b >= 30) && (b <= 40))) || (((a >= 40) && (a <= 50)) && ((b >= 40) && (b <= 50)));
    }

    public int max1020(int a, int b) {
        boolean aOk = false;
        boolean bOk = false;

        if ((a >= 10) && (a <= 20)){
            aOk = true;
        }
        if ((b >= 10) && (b <= 20)){
            bOk = true;
        }
        if(aOk && bOk){
            return a >= b ? a : b;
        }
        if(aOk){
            return a;
        }
        if(bOk){
            return b;
        }
        return 0;

    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                count++;
            }
        }
        if((count >= 1) && (count <=3)){
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3){
            return str.toUpperCase();
        }
        return str.substring(0, (str.length() - 3)) + str.substring((str.length() - 3), str.length()).toUpperCase();
    }

    public String everyNth(String str, int n) {
        if(str.equals("")){
            return str;
        }
        if(str.length() <= n){
            return String.valueOf(str.charAt(0));
        }

        String result = String.valueOf(str.charAt(0));
        for(int i = n; i < str.length(); i = i + n){
            result += str.charAt(i);
        }
        return result;
    }




}
