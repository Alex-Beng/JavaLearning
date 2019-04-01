
/**
 * main
 */
public class main {
    public static void main(String[] args) {
        ComplexNum cn_1 = new ComplexNum(3, 2);
        ComplexNum cn_2 = new ComplexNum(3, 3);
        cn_1.divide(cn_2);
        System.out.print(cn_1);

    }
}