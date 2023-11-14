package lan.zold;

import java.util.Scanner;

public class Circle {
    public void s() {
        String b = a("Sugár: ");
        Double sugar = Double.parseDouble(b);
        Double area = ca(sugar);
        System.out.printf("%.2f\n", area);

    }
    public String a(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        String line = sc.nextLine();
        sc.close();
        return line;
    }
    public double ca(double r) {
        return Math.pow(r, 2) * Math.PI;
    }
}
