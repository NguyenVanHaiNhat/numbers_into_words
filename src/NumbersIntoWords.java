import java.util.Scanner;

public class NumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number to convert to text : ");
        number = sc.nextInt();
        String result;
        String unit;
        String dozens = null;
        String dozens2;
        String hundreds;
        if (number >= 0 && number <10 ){
            unit = convertUnit(number);
            System.out.println(unit);
        } else if (number >= 10 && number < 20) {
            int a = number % 10;
            dozens = convertDozens(a);
            System.out.println(dozens);
        } else if (number > 20 && number < 100){
            int b = number / 10;
            int c = number % 10;
            switch (b){
                case 2: dozens = "twenty";
                break;
                case 3: dozens = "thirty";
                break;
            }
            dozens2 = convertDozen2(b);
            if (c > 0){
                unit = convertUnit(c);
                System.out.println(dozens2 + " " + unit);
            } else {
                System.out.println(dozens);
            }

        } else if (number >= 100 && number <= 999){
            int d = number / 100;
            int e = number % 100;
            hundreds = convertUnit(d) + " hundred";
            if (e > 0){
                if (e >= 10 && e < 20){
                    dozens = convertDozens(e % 10);
                    System.out.println(hundreds + " and " + dozens);
                } else {
                    int f = e / 10;
                    int g = e % 10;
                    dozens2 = convertDozen2(f);
                    dozens = convertDozens(f);
                    unit = convertUnit(g);
                    if (g > 0) {
                        System.out.println(hundreds + " and " + dozens2 + " " + unit);
                    } else {
                        System.out.println(hundreds + " and " + dozens);
                    }
                }
            } else {
                System.out.println(hundreds);
            }
        } else {
            result = "out of ability";
            System.out.println(result);
        }

    }
    public static String convertUnit(int digit){
        switch (digit) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String convertDozens(int digit){
        switch (digit) {
            case 0: return "ten";
            case 1: return "eleven";
            case 2: return "twelve";
            case 3: return "thirteen";
            case 4: return "fourteen";
            case 5: return "fifteen";
            case 6: return "sixteen";
            case 7: return "seventeen";
            case 8: return "eighteen";
            case 9: return "nineteen";
            default: return "";
        }
    }

    public static String convertDozen2(int digit){
        switch (digit) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
