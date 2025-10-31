package h2;

public class H2_main {
        public static void main(String[] args) {
            int i = -1, j = 4, k = -3;
            int min = i; // i ist der Startwert
            int max = i; // i ist der Startwert

            if (j < min) {
                min = j;
            }
            if (k < min) {
                min = k;
            }

            if (j > max) {
                max = j;
            }
            if (k > max) {
                max = k;
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }







