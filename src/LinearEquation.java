public class LinearEquation
{
    public LinearEquation(){}


    public void start()
    {
        LinearEquationLogic linear = new LinearEquationLogic();
        System.out.println(linear.askForCords());
        System.out.println(linear.slope());
        System.out.println(linear.yIntercept());
        System.out.println(linear.equation());
        System.out.println(linear.distance());
        System.out.println(linear.plugIn());
        linear.repeatUntilNo();


    }
}

