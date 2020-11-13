import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class URI1066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor4 = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor5 = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor6 = Double.parseDouble(st.nextToken());

        List<Double> entradas = new ArrayList<>();

        entradas.add((double) valor1);
        entradas.add((double) valor2);
        entradas.add(valor3);
        entradas.add(valor4);
        entradas.add(valor5);
        entradas.add(valor6);

        System.out.println(entradas.stream().filter((entrada) -> entrada > 0.).count() + " valores positivos");




    }
}