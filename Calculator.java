public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.b = b;
        this.a = a;
    }
    public boolean estimation() {
        if (a < b) {
            System.out.println("a меньше b");
        } else if (a > b) {
            System.out.println("a больше b");
        } else {
            System.out.println("a равно b");
        }
        System.out.println("Сумма чисел" + " " + (a + b));
        System.out.println("Произведение чисел" + " " + a * b);
        System.out.println("Вычетание чисел" + " " + (a - b));
        System.out.println("Деление чисел" + " " + a / b);
        return true;
    }
}