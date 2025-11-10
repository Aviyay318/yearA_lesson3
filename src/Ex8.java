import java.util.Scanner;

public class Ex8 {
//
//    כתבו תוכנית הקולטת מהמשתמש שלושה מספרים שלמים ומדפיסה על המסך את
//    ההודעה OK רק במידה והמספר הראשון שהוכנס הוא הגבוה ביותר.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Ok");
        }

        //the biggest:

        if (num1>num2){
            if (num1>num3){
                System.out.println(num1);
            }else {
                System.out.println(num3);
            }
        }else {
            if (num2>num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }











    }
}
