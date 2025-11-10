import java.util.Scanner;

public class Ex11 {

//    סדרה חשבונית היא קבוצת מספרים שההפרש בין כל שני מספרים סמוכים באותה קבוצה הוא זהה. לדוגמה,
//    רצף המספרים הבאים הוא סדרה חשבונית: 17,20,23,26 (כיוון שההפרש בין כל שני מספרים סמוכים הוא 3).
//    כתבו תוכנית הקולטת מהמשתמש שלושה מספרים, ואם מדובר בסדרה חשבונית, מדפיסה את האיבר הבא באותה הסדרה. לדוגמה,
//    אם המשתמש מזין את המספרים 12,17,22, התוכנית צריכה להדפיס את הערך 27.



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num2 - num1 == num3 - num2){
            int nextNumber = num3 + (num3-num2);
            System.out.println(nextNumber);
        }

    }
}
