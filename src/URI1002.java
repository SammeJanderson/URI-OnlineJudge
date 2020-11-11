import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double entrada = scanner.nextDouble();

        double area = 3.14159 * Math.pow(entrada,2) ;

        System.out.printf("A=%.4f", area);

    }
}