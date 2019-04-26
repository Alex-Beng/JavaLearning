import java.util.Scanner;

public class Str2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            double t = Double.parseDouble(str);
            System.out.println(t);
        } catch (NumberFormatException exc) {
            System.out.println("NumberFormatException");
        } finally {
            System.out.println(str + " Finally");
        }
    }
}