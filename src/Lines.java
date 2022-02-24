import java.util.Scanner;

public class Lines {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double a = (y2-y1)/(x2-x1);
        double b = y1-a*x1;
        System.out.println("y = " + a + "x + " + b);
    }
}
