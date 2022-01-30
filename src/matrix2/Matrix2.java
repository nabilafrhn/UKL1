/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix2;

/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class Matrix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int sisimatriks = 4;
        int deret = a;
        int total = 0;

        for (int i = 0; i < sisimatriks; i++) {
            for (int j = i; j <sisimatriks; j++) {
                System.out.print(deret + " \t");

                deret += b;
                total += deret;

            }
            System.out.println("");

        }
        System.out.println("Total " + total);

    }
}
