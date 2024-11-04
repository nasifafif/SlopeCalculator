import java.util.Scanner;
public class LinearEquationLogic
{
    public LinearEquationLogic(){}

    public void start() {
        Scanner scan = new Scanner(System.in);
        LinearEquation linear = new LinearEquation();
        int loop2 = 0;
        while (loop2 != 1) {
            System.out.println("Would you like to enter coordinates? (y/n)");
            String answer = scan.nextLine();
            if (answer.equals("y")) {
                System.out.println(linear.askForCords());
                double slope = linear.slope();
                if (slope != -99999) {
                    System.out.println("The slope of the line is " + linear.slope());
                    double yInt = linear.yIntercept();
                    System.out.println("The y-intercept of the line is " + yInt);
                    double x = linear.returnX();
                    double y = linear.returnY();
                    double cordCheckX = x;
                    double cordCheckY = y;
                    yInt = cordCheckY - (slope * cordCheckX);
                    if (cordCheckX * slope == cordCheckY) {
                        System.out.println("The equation of this line is y = " + slope + "x");
                    } else if (slope == 0) {
                        System.out.println("The equation of this line is y = " + yInt);
                    } else {
                        System.out.println("The equation of this line is y = " + slope + "x" + " + " + yInt);
                    }
                    System.out.println("The distance between the two points is " + linear.distance());
                    System.out.println(linear.plugIn());
                } else {
                    System.out.println("The slope of the line is undefined");
                }
            } else {
                loop2 = 1;
            }
        }
    }
}




