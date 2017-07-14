package CodingBat.String;

/**
 * Created by Yurbly on 11.07.2017.
 */
public class String_1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String a = str.substring(str.length() - 2, str.length());
        return a + a + a;
    }

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() > b.length() ? b+a+b : a+b+a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1,a.length()) + b.substring(1,b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }
    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if(str.length() == 0) return str;
        if(str.length()  == 1) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str){
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if(str.length() < 2) return false;
        if(str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y') return true;
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if(str.length() <= 2) return str;
        if(str.length() <= index + 1 || index < 0) return str.substring(0,2);
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length()/2 - 1, str.length()/2 + 2);
    }

    public boolean hasBad(String str) {
        if(str.length() < 3) return false;
        if(str.length() < 4 && str.charAt(0) != 'b') return false;
        return (str.substring(0,3).contains("bad") || str.substring(1,4).contains("bad"));
    }

    public String atFirst(String str) {
        String result = "";
        for (int i = 0; i < 2; i++){
            if(i >= str.length()) result += '@';
            else result += str.charAt(i);
        }
        return result;
    }

    public String lastChars(String a, String b) {
        return (a.length() == 0 ? "@" : a.substring(0,1))
                + (b.length() == 0 ? "@" : b.substring(b.length() - 1, b.length()));
    }

    public String conCat(String a, String b) {
        if(a.length() == 0 || b.length() == 0) return a + b;
        return a.charAt(a.length()-1) == b.charAt(0) ? a.substring(0,a.length() - 1) +
                b : a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, str.length() - 2)
                + str.substring(str.length() - 1, str.length())
                + str.substring(str.length() - 2, str.length() - 1);
    }

    public String seeColor(String str) {
        if (str.length() < 3) return "";
        if (str.substring(0,3).equals("red")) return "red";
        if (str.length() < 4) return "";
        if (str.substring(0,4).equals("blue")) return "blue";
        return "";
    }

    public boolean frontAgain(String str) {
        if(str.length() < 2) return false;
        if(str.charAt(0) == str.charAt(str.length() - 2)
                && str.charAt(1) == str.charAt(str.length() - 1)) return true;
        return false;

    }

    public String minCat(String a, String b) {

        int shorter = a.length() <= b.length() ? a.length() : b.length();
        return a.substring(a.length() - shorter, a.length()) + b.substring(b.length() - shorter, b.length());
    }

    public String extraFront(String str) {
        String start = str.length() < 2 ? str : str.substring(0,2);
        return start+start+start;
    }

    public String without2(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) return str.substring(2,str.length());
        return str;
    }

    public String deFront(String str) {

        if(str.length() < 1) return str;
        StringBuilder stb = new StringBuilder();
        if(str.charAt(0) == 'a')stb.append("a");
        if(str.length() > 1){
            if(str.charAt(1) == 'b') stb.append("b");
            stb.append(str.substring(2, str.length()));
        }
        return stb.toString();

    }

    public String startWord(String str, String word) {
        if(str.length() < 1 || str.length() < word.length()) return "";
        StringBuilder stb = new StringBuilder();
        stb.append(str.substring(0,1));
        for (int i = 1; i < word.length(); i++){
            if (str.charAt(i) != word.charAt(i)) return "";
            stb.append(str.charAt(i));
        }
        return stb.toString();

    }

    public String withoutX(String str) {
        if(str.length() < 1) return str;
        StringBuilder stb = new StringBuilder(str);
        if(str.charAt(0) == 'x') stb.deleteCharAt(0);
        if(stb.length() != 0 && stb.charAt(stb.length() - 1) == 'x') stb. deleteCharAt(stb.length() - 1);
        return stb.toString();
    }

    public String withoutX2(String str) {
        if(str.length() < 1) return str;
        StringBuilder stb = new StringBuilder();
        for(int i = 0;i < 2 && i < str.length(); i++){
            if(str.charAt(i) == 'x') continue;
            stb.append(str.charAt(i));
        }
        if(str.length() > 2) stb.append(str.substring(2, str.length()));
        return stb.toString();
    }


}

