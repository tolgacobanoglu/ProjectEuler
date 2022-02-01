package projecteuler.problem022;

import java.math.BigInteger;
import java.util.ArrayList;

public class NameScore
{
    public BigInteger calculate(String word,int order)
    {
        BigInteger score;
        BigInteger tempCharValue = new BigInteger("0");

        for (int index = 0; index < word.length(); index++)
        {
            tempCharValue = tempCharValue.add(BigInteger.valueOf(Character.getNumericValue(word.charAt(index)) - 9));
            //System.out.println("temp char" + tempCharValue);
        }

        score = tempCharValue.multiply(BigInteger.valueOf(order));
        System.out.println(word+" "+score);
        return score;
    }

    public BigInteger sum(ArrayList<String> names)
    {
        BigInteger result = new BigInteger("0");
        BigInteger tempScore;

        for(int index = 0 ; index < names.size() ; index++)
        {
            tempScore = calculate(names.get(index),index);
            result = result.add(tempScore);
        }


        return result;
    }
}
