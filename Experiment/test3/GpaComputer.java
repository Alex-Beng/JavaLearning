import java.util.Scanner;

public class GpaComputer {
    int ToSingle(double grade) {
        if (85<=grade && grade<=100) {
            return 4;
        }
        else if (75<=grade && grade<=84) {
            return 3;
        }
        else if (60<=grade && grade<=74) {
            return 2;
        }
        else if (45<=grade && grade<=59) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main (String args[]) {
        double upper;
        double downer;

        double grade;
        double score;
        double gpa;
        final GpaComputer gpa_computer = new GpaComputer();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            upper = 0.0;
            downer = 0.0;
            for (int j=0; j<3; j++) {

                score = sc.nextDouble();
                grade = sc.nextDouble();
                grade = gpa_computer.ToSingle(grade);
                upper += grade*score;
                downer += score;
            }
            gpa = upper/downer;
            System.out.println("Gpa: "+gpa);
        }
    }
}
