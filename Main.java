public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator (30, 10);
        System.out.println( calculator.estimation());
        Comparison string = new Comparison();
        String firstLine = "Привет";
        String secondLine = "Пока";
        String thirdLine = "Привет";
        System.out.println(firstLine + " - " + secondLine);
        System.out.println(string.compare(firstLine, secondLine));
        System.out.println(firstLine + " - " + thirdLine);
        System.out.println(string.compare(firstLine, thirdLine));
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}