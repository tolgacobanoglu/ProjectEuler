package projecteuler.problem012;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumber
{
    public long generate(int limit)
    {
        long result = 0;
        for (int i = 0; i <= limit; i++)
        {
            result += i;
        }
        System.out.print(result + " generated ");
        return result;
    }


    public List<Integer> dividerList(long triangleNumber)
    {
        List<Integer> dividers = new ArrayList<>();

        for (int currentNumber = 1; currentNumber <= triangleNumber; currentNumber++)
        {
            if (triangleNumber % currentNumber == 0)
            {
                dividers.add(currentNumber);
            }
        }

        return dividers;
    }


    public long overHundredDivisorsGenerate()
    {
        long number = 1;
        int counter = 1;
        System.out.print("1 Divisors size : " + dividerList(number).size());
        while (dividerList(number).size() < 500)
        {
            counter++;
            number = generate(counter);
            System.out.print(" Divisors size : " + dividerList(number).size());
            System.out.print(" Counter : " + counter);
            System.out.println();
        }

        return number;
    }
}
