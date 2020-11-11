import java.io.IOException;
import java.util.Scanner;

public class URI1007 {



        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

                int valueA = scanner.nextInt();
                int valueB = scanner.nextInt();
                int valueC = scanner.nextInt();
                int valueD = scanner.nextInt();
                int diferenca = (valueA * valueB - valueC * valueD);
                System.out.println("DIFERENCA = " +  diferenca);



        }

    }

