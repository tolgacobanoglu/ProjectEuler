package projecteuler.problem016;

public class Problem016
{
    public static void main(String[] args)
    {
        Pow p = new Pow();

        Digit digit = new Digit(p.generate(2,15));
        System.out.println("Digit Sum = "+digit.sum());

        Digit digit2 = new Digit(p.generate(2,1000));
        System.out.println("Digit Sum = "+digit2.sum());
    }
}
