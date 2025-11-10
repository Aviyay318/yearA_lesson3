import java.util.Scanner;

public class Ex4 {
//    אדם מוגדר קטין אם גילו קטן מ-18, אחרת הוא מוגדר כבוגר.
//    כתבו תוכנית המבקשת מהמשתמש להכניס את גילו ומציגה לו הודעה האם הוא קטין או בוגר.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("קטין");
        }else {
            System.out.println("בוגר");
        }

    }
}
