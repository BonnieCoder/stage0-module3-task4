package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    static double formula(int a, int b){
        return (9 * a * a - 5 * b + 2 + a - 7) * ((double) (a + b - 4 * a * b) / 2);
    }
    public static void main(String[] args) {
        int a, b;
        a = 2;
        b = 3;
        System.out.println(formula(a, b));
    }
}
