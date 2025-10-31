package h3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class H3_main {
    public static void main(String[] args) {
       /* int i = 10, j = 8, k = -10; // i>j Ausdruck 1, i>200 Ausdruck 2, j>100 Ausdruck 3 wieso klappt nicht?
        if (i > j) {
            k = 1;
            if (i > 200) {
                k = 2;
                if (j > 100) {
                    k = 3;
                }
            }
          else{
                k = 4;
            }
        }
        System.out.println("Das k hat den folgenden Wert: " + k); */

        int i, j, k;
        i = 201;
        j = 108;
        k = -10;

        if (i > j) {
            k = 1;
            if (i > 200) {
                k = 2;
                if (j > 100) {
                    k = 3;
                }
            }
        }


        if (!(i > j)) {
            if (!(i > 200)) {
                if (!(j > 100)) {
                    k = 4;
                }
            }
        }
        System.out.println("Das k hat den folgenden Wert: " + k);
    }
}


