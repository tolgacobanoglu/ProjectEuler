package projecteuler.problem003;

public class PrimeFactor
{
    public boolean isPrime(long number)
    {
        boolean isPrime = true;
        long temp = 2;
        while (number > temp)
        {
            if (number % temp == 0)
            {
                isPrime = false;
                break;
            }
            else
            {
                temp++;
            }
        }
        return isPrime;
    }

    public long largestPrimeFactorFinder(long number)
    {
        long temp = 1;
        long largestPrimeFactor = 1;
        while (temp <= number)
        {
            if (number % temp == 0)
            {

                if (isPrime(temp))
                {
                    largestPrimeFactor = temp;
                    number /= temp;
                }
            }
            temp++;
        }

        return largestPrimeFactor;
    }
}
