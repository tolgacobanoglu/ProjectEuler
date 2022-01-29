package projecteuler.problem007;

public class Prime
{
    private boolean isPrime(long number)
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

    public long primeFactory(int limit)
    {
        int counter = 0;
        long temp = 2;
        while (counter != limit)
        {
            if (isPrime(temp))
            {
                counter++;
            }
            temp += 1;
        }
        return temp-1;
    }
}
