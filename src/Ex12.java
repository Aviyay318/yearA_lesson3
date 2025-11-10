import java.util.Scanner;

public class Ex12 {

// כתבו תוכנית המבקשת מהמשתמש להכניס מספר דו-ספרתי.
// אם הוכנס מספר שאינו דו-ספרתי, התוכנית מסתיימת ללא פעולה נוספת.
// אם הוכנס מספר שהוא דו-ספרתי, התוכנית סוכמת את שתי הספרות שלו.
// לדוגמה, אם המספר הוא 47, אז החישוב שמתבצע הוא 4+7, ומחזיר את התוצאה 11.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("תכניס מספר דו ספרתי");
        int number = scanner.nextInt();
        if (number>9 && number<100){
            int sum =  number%10 + number/10;
            System.out.println(sum);
        }
    }

}
