import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yarıçap giriniz :");
        int r = scan.nextInt();
        double pi = 3.14;
        double alan = pi*(r*r);
        double cevre = 2*pi*r;
        System.out.println(alan);
        System.out.println(cevre);

    }
}
