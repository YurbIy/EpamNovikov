<<<<<<< HEAD:src/HW170701/Logic_1.java
package HW170701;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40) && (cigars <= 60 || isWeekend);

    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;

        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && ((isSummer && temp <= 100) || (temp <= 90)));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) speed = speed - 5;
        if (speed <= 60) return 0;
        if (speed >= 61 && speed <= 80) return 1;
        return 2;
    }

    public int sortaSum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 19) ? 20 : (a + b);
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day != 6 && day != 0) return "10:00";
            return "off";
        }
        if (day != 6 && day != 0) return "7:00";
        return "10:00";
    }

    public boolean love6(int a, int b) {
        return (a == 6)
                || (b == 6)
                || (a + b) == 6
                || Math.abs(a - b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode){
            return (n <= 1) || (n >= 10);
        }

        return (n >= 1) && (n <= 10);
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public boolean more20(int n) {
        return (n % 20 >=1 && n % 20 <= 2);
    }

    public boolean old35(int n) {
        return ((n % 3 == 0) ^ (n % 5 == 0));
    }

    public boolean less20(int n) {
        return ((n + 1) % 20 == 0) || ((n + 2) % 20 == 0);
    }

    public boolean nearTen(int num) {
        return (num + 1) % 10 == 0
                || (num + 2) % 10 == 0
                || num % 10 == 1
                || num % 10 == 2
                || num % 10 == 0;
    }

    public int teenSum(int a, int b) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2){
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")){
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        String result = "";
        //if (n % 3 == 0 && n % 5 == 0) result = "FizzBuzz!";
        if (n % 3 == 0) result = "Fizz";
        if (n % 5 == 0) result += "Buzz";
        if ("".equals(result)) return n + "!";

        return result + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk){
            return c > b;
        }
        return (b > a && c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk) return a <= b && b <= c;
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
    }

    public boolean lessBy10(int a, int b, int c) {
        return ((Math.abs(a - b) >= 10) || (Math.abs(c - b) >= 10) || Math.abs(a - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2){
            if(die1 == 6) return 7;
            return die1 + die2 + 1;
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if(a == b) return 0;
        if(a % 5 == b % 5) return a < b ? a : b;
        return a > b ? a : b;
    }

    public int redTicket(int a, int b, int c) {
        if(a == b && a == c && a == 2) return 10;
        if(a == b && a == c) return 5;
        if(a != b && a !=c) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if(a == b && a == c) return 20;
        if(a == b || a == c || b == c) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) return 10;
        if (((a + b) - (a + c) == 10) || ((a + b) - (b + c) == 10)) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10)
                || (a % 10 == b / 10)
                || (a / 10 == b % 10)
                || (a / 10 == b / 10);

    }

    public int sumLimit(int a, int b) {
        return String.valueOf(a + b).length() == String.valueOf(a).length() ? a + b : a;
    }




}
=======
package CodingBat.Logic;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40) && (cigars <= 60 || isWeekend);

    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;

        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && ((isSummer && temp <= 100) || (temp <= 90)));
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) speed = speed - 5;
        if (speed <= 60) return 0;
        if (speed >= 61 && speed <= 80) return 1;
        return 2;
    }

    public int sortaSum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 19) ? 20 : (a + b);
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day != 6 && day != 0) return "10:00";
            return "off";
        }
        if (day != 6 && day != 0) return "7:00";
        return "10:00";
    }

    public boolean love6(int a, int b) {
        return (a == 6)
                || (b == 6)
                || (a + b) == 6
                || Math.abs(a - b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode){
            return (n <= 1) || (n >= 10);
        }

        return (n >= 1) && (n <= 10);
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public boolean more20(int n) {
        return (n % 20 >=1 && n % 20 <= 2);
    }

    public boolean old35(int n) {
        return ((n % 3 == 0) ^ (n % 5 == 0));
    }

    public boolean less20(int n) {
        return ((n + 1) % 20 == 0) || ((n + 2) % 20 == 0);
    }

    public boolean nearTen(int num) {
        return (num + 1) % 10 == 0
                || (num + 2) % 10 == 0
                || num % 10 == 1
                || num % 10 == 2
                || num % 10 == 0;
    }

    public int teenSum(int a, int b) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2){
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")){
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        String result = "";
        //if (n % 3 == 0 && n % 5 == 0) result = "FizzBuzz!";
        if (n % 3 == 0) result = "Fizz";
        if (n % 5 == 0) result += "Buzz";
        if ("".equals(result)) return n + "!";

        return result + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || a + c == b || b + c == a);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk){
            return c > b;
        }
        return (b > a && c > b);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk) return a <= b && b <= c;
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
    }

    public boolean lessBy10(int a, int b, int c) {
        return ((Math.abs(a - b) >= 10) || (Math.abs(c - b) >= 10) || Math.abs(a - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2){
            if(die1 == 6) return 7;
            return die1 + die2 + 1;
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if(a == b) return 0;
        if(a % 5 == b % 5) return a < b ? a : b;
        return a > b ? a : b;
    }

    public int redTicket(int a, int b, int c) {
        if(a == b && a == c && a == 2) return 10;
        if(a == b && a == c) return 5;
        if(a != b && a !=c) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if(a == b && a == c) return 20;
        if(a == b || a == c || b == c) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) return 10;
        if (((a + b) - (a + c) == 10) || ((a + b) - (b + c) == 10)) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10)
                || (a % 10 == b / 10)
                || (a / 10 == b % 10)
                || (a / 10 == b / 10);

    }

    public int sumLimit(int a, int b) {
        return String.valueOf(a + b).length() == String.valueOf(a).length() ? a + b : a;
    }




}
>>>>>>> 077123c... Some solved excersises added:src/CodingBat/Logic/Logic_1.java
