package projecteuler.problem009;

public class Pythagorean
{
    private boolean pythagoreanChecker(int a,int b,int c)
    {
        return (a*a)+(b*b) == (c*c);
    }

    public int PythagoreanTripletFinder()
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 1000;

        // a < b < c
        for (a=1 ; a < (sum/3) ; a++)
        {
            for (b = 0 ; b < (sum/2) ; b++)
            {
                c = sum - a - b;
                if (pythagoreanChecker(a,b,c))
                {
                    return a*b*c;
                }
            }
        }
        return -1;
    }
}
