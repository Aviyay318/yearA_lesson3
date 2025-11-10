import java.util.Scanner;

public class Ex9 {
//
//    לפני כל נסיעה במכונית, עלינו לבדוק האם יש צורך למלא דלק.
//    כתבו תוכנית הקולטת מהמשתמש את גודל
//    מיכל הדלק שברכבו ואת כמות הליטרים שקיימת בפועל במיכל.
//    לאחר מכן התוכנית תדפיס אחת מההודעות הבאות:
//    -אם מיכל הדלק מלא ביותר ב-50%, יש להדפיס הודעה שאין צורך במילוי דלק.
//-אם במיכל הדלק יש 15%-50% דלק יש להדפיס הודעה שמומלץ למלא דלק.
//-אם פחות מ-15% ממיכל הדלק מלא, יש להדפיס שחובה למלא דלק.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter size of gas");
        int size =  scanner.nextInt();
        System.out.println("please enter amount of liter");
        int liter = scanner.nextInt();


        if (size*0.5 <liter){
            System.out.println("אין צורך במילוי דלק");
        } else if (liter <= size*0.5 && liter>=size*0.15) {
            System.out.println("מומלץ למלא דלק");
        }else {
            System.out.println("חובה לתדלק");
        }

    }
}
