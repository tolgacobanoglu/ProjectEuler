package projecteuler.problem010;

public class Prime
{
    private boolean isPrime(int number)
    {
        if (number == 2)
        {
            return true;
        }

        for (int divider = 2; divider < number; divider++)
        {
            if (number % divider == 0)
            {
                return false;
            }
        }

        return true;
    }

    public long sumOfPrimes(int limit)
    {
        long result = 0;

        for (int number = 2; number < limit; number++)
        {
            if (isPrime(number))
            {
                result += number;
            }
            System.out.println("Number : " + number + " Sum : " + result);
        }

        return result;
    }
}
