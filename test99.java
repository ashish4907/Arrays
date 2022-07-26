import java.util.Scanner;

public class test99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Octa to Decimal -- "+octaToDecimal(a));
    }
   

    private static String octaToDecimal(int dec) {
        String octa = "";
        while (dec > 0) {
            int rem = dec % 8;
            octa = rem + octa;
            dec = dec / 8;
        }
        return octa;

    }
}

