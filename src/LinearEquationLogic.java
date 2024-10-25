import java.util.Scanner;
public class LinearEquationLogic
{
    Scanner scan = new Scanner(System.in);
    private String x1;
    private String y1;
    private String x2;
    private String y2;
    private double x;
    private double y;
    private String c1;
    private String c2;
    private double slope;
    private double yIntercept;




    public LinearEquationLogic(){}




    public String askForCords()
    {
        System.out.println("Welcome to the slope calculator!");
        System.out.println("Enter coordinate 1");
        c1 = scan.nextLine();
        System.out.println("Enter coordinate 2");
        c2 = scan.nextLine();
        System.out.println();
        return "The two points are " + c1 +" and " + c2;
    }




    public String slope()
    {
        x1 = c1.substring(1,2);
        x2 = c2.substring(1,2);
        y1 = c1.substring(3,4);
        y2 = c2.substring(3,4);
        x = Integer.parseInt(x2) - Integer.parseInt(x1);
        y = Integer.parseInt(y2) - Integer.parseInt(y1);
        if (x>0) {
            slope = y / x;
            return "The slope of this line is " + slope;
        }
        else {
            return "The slope of this line is 0";
        }
    }




    public String yIntercept()
    {
        return "The y-intercept of this line is " + yIntercept;
    }




    public String equation()
    {
        double cordCheckX = Integer.parseInt(x1);
        double cordCheckY = Integer.parseInt(y1);
        yIntercept = cordCheckY - (slope*cordCheckX);
        if (cordCheckX * slope == cordCheckY)
        {
            return "The equation of this line is y = " + slope + "x";
        }
        else if (slope == 0)
        {
            return "The equation of this line is y = " + yIntercept;
        }
        return "The equation of this line is y = " + slope + "x" + " + " +yIntercept;
    }




    public String distance()
    {
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return "The distance between the two points is: " + distance;
    }




    public String plugIn()
    {
        System.out.println();
        System.out.println("Enter a value for x");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        double y = x*slope+yIntercept;
        return "The point on this line is ("+x+ "," + y + ")";
    }


    public void repeatUntilNo()
    {
        LinearEquationLogic linear = new LinearEquationLogic();
        int loop2 = 0;
        String loop1 = "";
        while (loop2==0)
        {
            System.out.println("Would you like to enter new coordinates? (yes/no)");
            loop1 = scan.nextLine();
            if (loop1.equals("yes"))
            {
                System.out.println(linear.askForCords());
                System.out.println(linear.slope());
                System.out.println(linear.yIntercept());
                System.out.println(linear.equation());
                System.out.println(linear.distance());
                System.out.println(linear.plugIn());
            }
            else
            {
                loop2 = 1;
            }
        }


    }
}




