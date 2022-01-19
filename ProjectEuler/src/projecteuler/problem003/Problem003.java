package projecteuler.problem003;

public class Problem003
{
    public static void main(String[] args)
    {
        PrimeFactor p = new PrimeFactor();
        System.out.println(p.largestPrimeFactorFinder(13195));
        System.out.println(p.largestPrimeFactorFinder(600851475143L));

    }
}
