import area.AreaOfCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaOfCircle areaOfCircle=new AreaOfCircle();
        Scanner scanner=new Scanner(System.in);
        double radius= scanner.nextDouble();
        System.out.println("Please enter your radius of circle");
        areaOfCircle.getResult();

    }
}