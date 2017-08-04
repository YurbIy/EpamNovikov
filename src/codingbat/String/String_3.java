package CodingBat.String;

/**
 * Created by Yurbly on 02.08.2017.
 */
public class String_3 {
    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(!Character.isLetter(str.charAt(i))
                    && i - 1 >= 0
                    && (str.substring(i - 1, i).compareToIgnoreCase("z") == 0
                    || str.substring(i - 1, i).compareToIgnoreCase("y") == 0)){
                count++;
            }
        }
        if(str.substring(str.length() - 1, str.length()).compareToIgnoreCase("z") == 0
                || str.substring(str.length() - 1, str.length()).compareToIgnoreCase("y") == 0){
            count++;
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        if(base.length() < remove.length()) return base;
        StringBuilder stb = new StringBuilder(base);
        // int j = 0;
        for(int i = 0; i < stb.length(); ){
            // if(j >= stb.length()) break;
            if(remove.length() <= stb.length() - i && remove.compareToIgnoreCase(stb.substring(i, i + remove.length())) == 0){
                stb.delete(i, i + remove.length());

            }
            else i++;

        }
        return stb.toString();
    }

    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if("is".equals(str.substring(i, i + 2))){
                isCount++;
            }
            if(i < str.length() - 2 && "not".equals(str.substring(i, i + 3))){
                notCount++;
            }

        }
        return isCount == notCount;
    }

    public boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'g'){
                if(str.length() == 1) return false;
                for(int j = i; j < str.length(); j++){
                    if((j == i + 1 && str.charAt(j) != 'g') || (i - 1 > 0 && str.charAt(i - 1) != 'g' && i == str.length() - 1)){
                        return false;
                    }
                    else if(str.charAt(j) != 'g'){
                        i = j;
                        break;
                    }
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {

        int count = 0;
        if (str.length() < 3) return 0;
        outer:
        for (int i = 0; i < str.length() - 2; i++){
            for (int j = i + 1; j < i + 3; j++){
                if(str.charAt(j) != str.charAt(i)) continue outer;

            }
            count++;
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        String res = "";
        if(string.length() < 2) return "";
        for (int i = 0; i < string.length()/2; i++){
            if(string.substring(0, i + 1).equals(string.substring(string.length() - i - 1, string.length()))){
                res = string.substring(0, i + 1);
            }
        }
        return res;
    }

    public String mirrorEnds(String string) {
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--){
            if(string.charAt(i) == string.charAt(j)){
                res.append(string.substring(i, i + 1));
            }
            else break;
        }
        return res.toString();
    }

    public int maxBlock(String str) {
        if(str.length() == 0) return 0;
        int max = 1;

        for(int i = 0; i < str.length() - 1; i++){
            int block = 1;
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(j) != str.charAt(i)){
                    i = j - 1;
                    max = block > max ? block : max;
                    break;
                }
                else{
                    block++;
                }
            }
            max = block > max ? block : max;
        }
        return max;
    }

    public int sumNumbers(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++){
            String number = "";
            for (int j = i; j < str.length() && Character.isDigit(str.charAt(j));){
                number += str.substring(j, j + 1);
                i = ++j;
            }
            num += "".equals(number) ? 0 : Integer.parseInt(number);
        }
        return num;
    }

    public String notReplace(String str) {
        StringBuilder stb = new StringBuilder(str);
        for(int i = 0, j = 0; i < str.length() - 1; i++){
            if("is".equals(str.substring(i, i + 2))
                    && (i - 1 < 0 || !Character.isLetter(str.charAt(i - 1)))
                    && (i + 2 >= str.length() || !Character.isLetter(str.charAt(i + 2)))){
                stb.insert(i + 2 + j*4, " not");
                j++;
            }
        }
        return stb.toString();
    }





}
