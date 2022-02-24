import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast vægt");
        double w = scan.nextDouble();

        System.out.println("Indtast højde");
        double h = scan.nextDouble();
        double bmi = w /(h*h);
        System.out.format("Dit BMI er %.1f", bmi);
        System.out.println();
        String out = "Du er ";
        if (bmi <18.5) { out+="undervægtig";
        } else if (bmi < 25){
            out+= "normalvægtig";
        } else if (bmi <30){
            out+= "overvægtig";
        } else {
            out += "svært overvægtig";
        }
        System.out.println(out);
    }
}
