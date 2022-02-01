package projecteuler.problem012;

public class Problem012
{
    public static void main(String[] args)
    {
        TriangleNumber triangleNumber = new TriangleNumber();
        System.out.println(triangleNumber.dividerList(1));
        System.out.println(triangleNumber.dividerList(3));
        System.out.println(triangleNumber.dividerList(6));
        System.out.println(triangleNumber.dividerList(10));
        System.out.println(triangleNumber.dividerList(15));
        System.out.println(triangleNumber.dividerList(21));
        System.out.println(triangleNumber.dividerList(28));

        System.out.println(triangleNumber.overHundredDivisorsGenerate());

    }
}
