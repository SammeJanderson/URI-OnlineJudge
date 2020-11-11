import java.io.IOException;
import java.util.Scanner;

public class URI1008 {



        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

                int valueA = scanner.nextInt();
                int valueB = scanner.nextInt();
                double valueC = scanner.nextDouble();
                double salario = valueB * valueC;

            System.out.println("NUMBER = " + valueA);
                System.out.printf("SALARY = U$ %.2f \n",  salario);



        }

    }

