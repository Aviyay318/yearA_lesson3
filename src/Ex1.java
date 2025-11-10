import java.util.Scanner;

public class Ex1 {

//    תרגיל 1:
//    כתבו תוכנית המבקשת מהמשתמש להכניס מספר גבוה מ-1000. -> הדפסה
//    אם אכן מוכנס מספר גבוה מ-1000, התוכנית מדפיסה "Success",
//    אחרת היא מדפיסה "Failure".


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number bigger than 1000");
        int number = scanner.nextInt();

        if (number>1000){
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }
    }
}
