public class MergeSort{

    public static void mergeSort(int[] v, int ini, int fim) {
        if (fim > ini) {
            int meio = (ini + fim) / 2;
            mergeSort(v, ini, meio);
            mergeSort(v, ini, meio + 1);
            merge(v, ini, fim);
        }

    }

    private static void merge(int[] v, int ini, int fim) {
        int helperFim = fim - ini;
        int[] helper = new int[helperFim + 1];

        for(int i = 0; i < helperFim; i++) {
            helper[i] = v[ini + i];
        }

        int meiohelper = (ini + helperFim) / 2;

        int i = 0;
        int j = meiohelper;
        int k = ini;

        while(i <= meiohelper && j <= helperFim) {
            if(helper[i] <= helper[j]) {
                v[k++] = helper[i++];
            } else {
                v[k++] = helper[j++];
            }
        }

        while(i <= meiohelper) {
            v[k++] = helper[i++];
        }
    }
}