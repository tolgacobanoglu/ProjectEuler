package projecteuler.problem016;

import java.math.BigInteger;

public class Digit
{
    private final BigInteger number;

    public Digit(BigInteger number)
    {
        this.number = number;
        System.out.println(number.toString() + " generated");
    }

    public int sum()
    {
        int sum = 0;
        String sNumber = String.valueOf(number);
        int currentNumber;
        for (int index = 0; index < sNumber.length(); index++)
        {
            currentNumber = Character.getNumericValue(sNumber.charAt(index));
            System.out.println(index + ". current number : " + currentNumber);
            sum += currentNumber;
        }

        return sum;
    }


}
