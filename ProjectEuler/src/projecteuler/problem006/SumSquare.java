package projecteuler.problem006;

public class SumSquare
{
    private long square(long number)
    {
        return number*number;
    }

    private long summation(long limit)
    {
        return (limit *(limit+1))/2;
    }

    private long squareOfSum(long limit)
    {
        long result;
        result = square(summation(limit));
        return result;
    }

    private long sumOfSquare(long limit)
    {
        long result = 0;
        long temp;
        for (int i = 1; i <= limit; i++)
        {
            temp = square(i);
            result += temp;
        }

        return result;
    }

    public long difference(int limit)
    {
        long difference = 0;
        long sumOfSquare = sumOfSquare(limit);
        long squareOfSum = squareOfSum(limit);
        difference =  squareOfSum - sumOfSquare;
        System.out.println("sumOfSquare : " + sumOfSquare +" squareOfSum : " + squareOfSum);
        System.out.println("Difference : " + difference);

        return difference;
    }
}
