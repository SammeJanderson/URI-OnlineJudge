import java.io.IOException;
import java.util.Scanner;

public class URI1009 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double totalInSells = scanner.nextDouble();


        double bonusSalary = salary + (totalInSells * 0.15);
        System.out.printf("TOTAL = R$ %.2f", bonusSalary);
        System.out.println();


    }

}

