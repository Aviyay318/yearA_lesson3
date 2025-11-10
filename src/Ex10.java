import java.util.Random;

public class Ex10 {
//    סדרה חשבונית היא קבוצת מספרים שההפרש בין כל שני מספרים סמוכים באותה קבוצה הוא זהה.
//    לדוגמה, רצף המספרים הבאים הוא סדרה חשבונית:
//    17,20,23,26 (כיוון שההפרש בין כל שני מספרים סמוכים הוא 3).
//    כתבו תוכנית שמגרילה שלושה מספרים (בטווח 1-5),
//    מדפיסה אותם על המסך, ומדפיסה האם מדובר בסדרה חשבונית או לא.

    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(1,6);
        int num2 = random.nextInt(1,6);
        int num3 = random.nextInt(1,6);


        if (num2-num1 == num3 - num2){
            System.out.println("סדרה חשבונית");
        }
    }
}
