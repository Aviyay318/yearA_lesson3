import java.util.Scanner;

public class Ex3 {

//    כתבו תוכנית הקולטת מהמשתמש שלושה מספרים בזה אחר
//    זה. לאחר מכן, התוכנית תבדוק האם ההפרש בין המספר הראשון והשני זהה למספר השני והשלישי,
//    ותדפיס הודעה בהתאם.
//    לדוגמה, עבור הקלט 3, 9, 15 תודפס תשובה חיובית.
//    עבור הקלט 11, 14, 15 תודפס תשובה שלילית.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int dif1 = num1 -num2; //-6
        int dif2 = num2 - num3; //6

        if (dif1<0){
            dif1 = dif1*-1; //6
        }
        if (dif2<0){
            dif2 = dif2*-1;
        }
        if (dif1 == dif2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

//
//        boolean isEquals = false;
//        if (dif1 == dif2){
//           isEquals = true;
//        }
//        System.out.println(isEquals);
    }
}
