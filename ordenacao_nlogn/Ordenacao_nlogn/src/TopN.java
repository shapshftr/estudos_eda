import java.util.Arrays;
import java.util.Scanner;

class TopN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entrada =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(topN(entrada, n));
    }

    public static String topN(int[] v, int n) {
        int[] top = new int[n];

        for (int i = 0; i < n; i++) {
            int k = i;
            int maior = k;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[maior]) {
                    maior = j;
                }
            }

            int sup = v[k];
            v[k] = v[maior];
            v[maior] = sup;
            top[i] = v[k];
        }

        return stringuificador(top);
    }


    public static String stringuificador(int[] v) {
        String retorno = "";

        for (int i = 0; i < v.length; i++) {
            retorno += v[i] + " ";
        }

        return retorno.trim();
    }
}