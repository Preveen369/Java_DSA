import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patterns {
    static void pattern_1(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j < n; j++) { // n->5
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j <= i; j++) { // j=i
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= i; j++) { // j=i
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= i; j++) { // j=i
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern_5(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            for (int j = 1; j <= n - i + 1; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_6(int n) {
        for (int i = 1; i <= n; i++) { // n->5
            // 1<j<=n-i+1
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_7(int n) {
        for (int i = 0; i < n; i++) { // n->5
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");  // spaces
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");  // stars
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");  // spaces
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader((System.in));
        BufferedReader br = new BufferedReader(in);
        int n = Integer.parseInt(br.readLine());
        // pattern_1(n);
        // pattern_2(n);
        // pattern_3(n);
        // pattern_4(n);
        // pattern_5(n);
        // pattern_6(n);
        pattern_7(n);
    }
}
