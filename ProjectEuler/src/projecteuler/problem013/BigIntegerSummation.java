package projecteuler.problem013;

import java.math.BigInteger;

public class BigIntegerSummation
{
    public BigInteger summationOfLine(String numbers[])
    {
        BigInteger result = BigInteger.ZERO;

        for(String number : numbers)
        {
            result = result.add(new BigInteger(number));
        }

        return result;
    }

    public String bigIntegerParser(BigInteger bigInteger)
    {
        return bigInteger.toString().substring(0,10);
    }
}
