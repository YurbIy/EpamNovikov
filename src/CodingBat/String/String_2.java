package CodingBat.String;

/**
 * Created by Yurbly on 16.07.2017.
 */
public class String_2 {
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if("hi".equals(str.substring(i, i + 2))) count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if("cat".equals(str.substring(i, i + 3))) catCount++;
            if("dog".equals(str.substring(i, i + 3))) dogCount++;
        }
        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++){
            if("co".equals(str.substring(i, i+2)) && str.charAt(i + 3) == 'e') count++;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        boolean result;
        if (a.length() > b.length()) {
            result = a.substring(a.length() - b.length(), a.length()).toLowerCase().equals(b.toLowerCase());
        }
        else{
            result = b.substring(b.length() - a.length(), b.length()).toLowerCase().equals(a.toLowerCase());
        }
        return result;
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == '.') {
                i++;
                continue;
            }
            if("xyz".equals(str.substring(i, i + 3))) return true;
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++){
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        boolean balanced = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x') balanced = false;
            if(str.charAt(i) == 'y') balanced = true;
        }
        return balanced;
    }

    public String mixString(String a, String b) {
        StringBuilder stb = new StringBuilder();
        String shorter = a.length() < b.length() ? a : b;
        String longer = a.length() < b.length() ? b : a;
        for (int i = 0; i < shorter.length(); i++)
            stb.append(a.charAt(i)).append(b.charAt(i));

        stb.append(longer.substring(shorter.length(), longer.length()));

        return stb.toString();
    }

    public String repeatEnd(String str, int n) {
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < n; i++){
            stb.append(str.substring(str.length() - n, str.length()));
        }
        return stb.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder stb = new StringBuilder();
        for (int i = n; i > 0; i--){
            stb.append(str.substring(0, i));
        }
        return stb.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < count; i++){
            stb.append(word);
            if(i == count - 1) break;
            stb.append(sep);
        }
        return stb.toString();
    }

    public boolean prefixAgain(String str, int n) {
        String pref = str.substring(0, n);
        for(int i = 1; i <= str.length() - n; i++){
            if(pref.equals(str.substring(i, i + n))) return true;
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        if(str.length() < 3) return false;
        String middle;
        if(str.length() < 5) middle = str;
        else middle = str.substring(str.length()/2 + str.length()%2 - 2, str.length()/2 + 2);
        if(middle.contains("xyz")) return true;
        return false;
    }

    public  String getSandwich(String str) {
        StringBuilder stb = new StringBuilder(str);
        int firstBread = -1;
        int lastBread = -1;
        for (int i = 0; i < str.length() - 5; i++){
            if("bread".equals(str.substring(i, i + 5))) {
                firstBread = i;
                break;
            }
        }
        for(int i = str.length(); i > 4; i--){
            if("bread".equals(str.substring(i - 5, i))){
                lastBread = i - 5;
                break;
            }
        }
        if(firstBread == lastBread || firstBread < 0 || lastBread < 0)return "";
        return str.substring(firstBread + 5, lastBread);

    }

    public boolean sameStarChar(String str) {
        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == '*' && !(str.charAt(i - 1) == str.charAt(i + 1))) return false;
        }
        return true;
    }

    public String oneTwo(String str) {
        StringBuilder stb = new StringBuilder();
        if (str.length() < 3) return "";
        for (int i = 2; i < str.length(); i += 3){
            stb.append(str.substring(i - 1, i + 1)).append(str.substring(i - 2, i - 1));
        }
        return stb.toString();
    }

    public String zipZap(String str) {
        StringBuilder stb = new StringBuilder(str);
        int n = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                stb.deleteCharAt(i+1-n);
                n++;
            }
        }
        return stb.toString();
    }

    public String starOut(String str) {
        StringBuilder stb = new StringBuilder();
        char[] ch = str.toCharArray();

        boolean lastWasStar = false;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '*'){
                ch[i] = 0;
                if(i - 1 >= 0 && str.charAt(i - 1) != '*'){
                    ch[i - 1] = 0;
                }
                if(i + 1 < str.length() && !lastWasStar){
                    ch[i + 1] = 0;
                }

                lastWasStar = true;
            }
            else{
                lastWasStar = false;
            }
        }
        for(char c : ch){
            if(c != 0) stb.append(c);
        }

        return stb.toString();

    }

    public String plusOut(String str, String word) {
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < str.length() - word.length() + 1; i++){
            if(word.equals(str.substring(i,i + word.length()))){
                stb.append(word);
                i = i + word.length() - 1;
            }
            else if(i == str.length() - word.length()){
                for (int j = 0; j < word.length(); j++){
                    stb.append("+");
                    i++;
                }
            }
            else{
                stb.append("+");
            }
        }

        for(int k = (str.length() - stb.length()); k > 0 ; k--){
            stb.append("+");
        }


        return stb.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length() - word.length() + 1; i++){
            if(word.equals(str.substring(i, i + word.length()))){
                if(i - 1 >= 0) stb.append(str.substring(i-1,i));
                if(i + word.length() < str.length()) stb.append(str.substring(i + word.length(),i + word.length() + 1));
            }
        }
        return stb.toString();
    }




}
