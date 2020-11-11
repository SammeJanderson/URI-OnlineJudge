import java.io.IOException;
import java.util.Scanner;

public class URI1005 {



        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
                double inpt1 = scanner.nextDouble();
                double input2 = scanner.nextDouble();
                double media = ((inpt1 * 3.5) + (input2 * 7.5)) / 11;
                System.out.printf("MEDIA = %.5f", media);
                System.out.println();



        }

    }

