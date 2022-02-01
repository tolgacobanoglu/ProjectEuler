package projecteuler.problem016;

import java.math.BigInteger;

public class Pow
{
    public BigInteger generate(int base, int power)
    {
        BigInteger result = new BigInteger(String.valueOf(base));

        return result.pow(power);
    }
}
