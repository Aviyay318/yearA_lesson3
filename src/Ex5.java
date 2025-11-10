import java.util.Scanner;

public class Ex5 {
//    אדם מוגדר קטין אם גילו קטן מ-18,
//    בוגר אם גילו בטווח של 18-65, ופנסיונר אם גילו גבוה מ-65.
//    כתבו תוכנית המבקשת מהמשתמש להכניס את גילו ומציגה לו האם הוא קטין,
//    בוגר, או פנסיונר.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        if (age<18){
            System.out.println("קטין");
        } else if (age>=18 && age<=65) {
            System.out.println("בוגר");
        } else if (age>65) {
            System.out.println("פנסיונר");
        }


    }
}
