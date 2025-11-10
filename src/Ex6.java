import java.util.Random;

public class Ex6 {

//    כתבו תוכנית המגרילה מספר בטווח 0-1000. התוכנית תדפיס את המספר שהוגרל,
//    ולאחר מכן תבדוק אם המספר מתחלק ב-3 ללא שארית.
//    אם כן - התוכנית תדפיס את ההודעה: "זכית בבונוס
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(0,1001);
        System.out.println(randomNumber);

        if (randomNumber%3 == 0){
            System.out.println("זכית בבונוס");
        }
    }
}
