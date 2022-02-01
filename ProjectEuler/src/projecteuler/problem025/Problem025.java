package projecteuler.problem025;

import java.math.BigInteger;

public class Problem025
{
    public static void main(String[] args)
    {
        System.out.println(fibonacciNumbers(3));
        System.out.println(fibonacciNumbers(1000));
    }

    public static BigInteger fibonacciNumbers(int limit)
    {
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("1");
        BigInteger fibonacci = new BigInteger("0");
        final BigInteger one = new BigInteger("1"); // for the increase the index
        BigInteger index = new BigInteger("3"); // F1 = 1,F2 = 1,F3 = 3

        fibonacci = fibonacci.add(first);
        int length = String.valueOf(fibonacci).length();

        while (length != limit)
        {
            fibonacci = fibonacci.add(first);
            first = second;
            second = fibonacci;
            index = index.add(one);
            length = String.valueOf(fibonacci).length();
        }

        index = index.subtract(one);
        return index;
    }




}
