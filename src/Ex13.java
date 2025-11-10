import java.util.Scanner;

public class Ex13 {

//    כתבו תוכנית המבקשת מהמשתמש להכניס מספר תלת-ספרתי. אם
//    הוכנס מספר שאינו תלת-ספרתי, התוכנית מסתיימת ללא פעולה נוספת.
//    אם הוכנס מספר שהוא תלת-ספרתי, על התוכנית להדפיס האם
//    הספרות של המספר הן עוקבות (בסדר עולה או יורד).
//    לדוגמה, עבור הקלטים הבאים תודפס תשובה חיובית:
//            123, 567, 876.
//    עבור הקלטים הבאים תודפס תשובה שלילית:
//            156, 890, 985.


    public static void main(String[] args) {
        System.out.println("please enter number with 3 digit");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num>99 && num<1000){
            int digitOfUnity = num%10 ;
            int tensDigit = num/10%10;
            int hundredsDigit = num/100;

            if (tensDigit - digitOfUnity == 1 && hundredsDigit -  tensDigit==1){
                System.out.println("up");
            } else if (tensDigit - digitOfUnity == -1 && hundredsDigit -  tensDigit == -1) {
                System.out.println("down");
            }

        }
    }
}
