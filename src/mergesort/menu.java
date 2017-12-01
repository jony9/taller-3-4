/*
 * 
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author jonathan moreno
 */
public class menu {

    public static void main(String args[]) {
        int vec[] = {17, 12, 8, 1, 22, 21, 27, 32, 3, 7, 4};
        System.out.println("numeros originales");
        imprimirVector(vec);
        System.out.println("\nnumeros ordenados");
        ordenacionMergeSort(vec);
        imprimirVector(vec);
    }

    public static void ordenacionMergeSort(int vec[]) {
        if (vec.length <= 1) {
            return;
        }
        int mitad = vec.length / 2;
        int izq[] = Arrays.copyOfRange(vec, 0, mitad);
        int der[] = Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);
        combinarVector(vec, izq, der);
    }

    public static void combinarVector(int v[], int izq[], int der[]) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < v.length; k++) {
            if (i >= izq.length) {
                v[k] = der[j];
                j++;
                continue;
            }
            if (j >= der.length) {
                v[k] = izq[i];
                i++;
                continue;
            }
            if (izq[i] < der[j]) {
                v[k] = izq[i];
                i++;
            } else {
                v[k] = der[j];
                j++;
            }
        }
    }

    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }

}
