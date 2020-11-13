import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class URI1259 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int valor = in.nextInt();

        while (numeros.size() < valor){
            numeros.add(in.nextInt());
        }

        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> numerosOrg = new ArrayList<>();

        numerosOrg.addAll(pares);
        numerosOrg.addAll(impares);

        numerosOrg.forEach(System.out::println);







    }

}