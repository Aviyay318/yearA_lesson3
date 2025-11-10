import java.util.Scanner;

public class Ex7 {
//    סטודנט מוגדר "מצטיין" אם ממוצע הציונים שלו הוא גבוה מ-90,
//    "טוב" אם ממוצע הציונים שלו נע בין 70-90, ו"מתקשה" אם ממוצעו נמוך מ-70.
//    כתבו תוכנית הקולטת מהמשתמש 3 ציונים  ומדפיסה הודעה לאיזו קטגוריה הוא משתייך לפי הממוצע שלו.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter 3 grades");
        int grade1= scanner.nextInt();
        int grade2= scanner.nextInt();
        int grade3= scanner.nextInt();

        int sum  = grade1 + grade2 + grade3 ;
        double avg = sum / 3 ;

        if (avg>90){
            System.out.println("מצטיין");
        } else if (avg >= 70 && avg <=90) {
            System.out.println("טוב");
        }else {
            System.out.println("מתקשה");
        }
    }
}
