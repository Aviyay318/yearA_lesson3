import java.util.Scanner;

public class Ex2 {

//    כתבו תוכנית הקולטת מהמשתמש שלושה מספרים שלמים,
//    המהווים את המחירים של מוצרים שרכש.
//    אם העלות הכוללת של המוצרים גבוה מ-500,
//    יש לתת למשתמש 10 אחוזי הנחה על הסכום ולהדפיס את סכום הרכישה לאחר ההנחה.
//    אם הסך נמוך מ-500, יש להדפיס את סכום הרכישה ללא הנחה.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int num1 = scanner.nextInt(); //100
        int num2 = scanner.nextInt(); //200
        int num3 = scanner.nextInt(); //100

        double sum  = num1+ num2+num3; //600
        if (sum>500){
           // sum*=0.9; the same
            double discount = sum * 0.1; // 60
            sum = sum - discount; //600 -60  => 540
        }
        System.out.println(sum);
    }
}
