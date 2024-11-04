import java.util.Scanner;
public class LinearEquation
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

    public LinearEquation(){}

    public String askForCords()
    {
        System.out.println("Enter coordinate 1");
        c1 = scan.nextLine();
        System.out.println("Enter coordinate 2");
        c2 = scan.nextLine();
        System.out.println();
        return "The two points are " + c1 +" and " + c2;
    }

    public double returnX()
    {
        return Integer.parseInt(x1);
    }
    public double returnY()
    {
        return Integer.parseInt(y1);
    }

    public double slope() {
        x1 = c1.substring(1, 2);
        x2 = c2.substring(1, 2);
        y1 = c1.substring(3, 4);
        y2 = c2.substring(3, 4);
        if (x1.equals("-")) {
            x1 = c1.substring(1, 3);
        }
        if (x2.equals("-")) {
            x2 = c1.substring(1, 3);
        }
        if (c1.substring(1, 2).equals("-") && c1.substring(4, 5).equals("-")) {
            y1 = c1.substring(4, 6);
        }
        if (!c1.substring(1, 2).equals("-") && c1.substring(3, 4).equals("-")) {
            y1 = c1.substring(3, 5);
        }
        if (c2.substring(1, 2).equals("-") && c2.substring(4, 5).equals("-")) {
            y2 = c2.substring(4, 6);
        }
        if (!c2.substring(1, 2).equals("-") && c2.substring(3, 4).equals("-")) {
            y2 = c2.substring(3, 5);
        }
        x = Integer.parseInt(x2) - Integer.parseInt(x1);
        y = Integer.parseInt(y2) - Integer.parseInt(y1);
        if (x > 0) {
            slope = y / x;
            return slope;
        } else if (x==0){
            return -99999;
        }
        return 0;
    }

    public double yIntercept()
    {
        yIntercept = Integer.parseInt(x1)*slope;
        yIntercept = Integer.parseInt(y1)-yIntercept;
      return yIntercept;
    }

    public double distance()
    {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public String plugIn()
    {
        System.out.println();
        System.out.println("Enter a value for x");
        double x = scan.nextDouble();
        scan.nextLine();
        double y = x*slope+yIntercept;
        return "The point on this line is " + "(" + x + "," + y + ")";
    }

}




