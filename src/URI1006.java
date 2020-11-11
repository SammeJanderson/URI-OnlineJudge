import java.io.IOException;
import java.util.Scanner;

public class URI1006 {



        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

                double gradeA = scanner.nextDouble();
                double gradeB = scanner.nextDouble();
                double gradeC = scanner.nextDouble();

                double media = ((gradeA * 2) + (gradeB * 3)+ (gradeC * 5) ) / 10;
                System.out.printf("MEDIA = %.1f", media);
                System.out.println();



        }

    }

