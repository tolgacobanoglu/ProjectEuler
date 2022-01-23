package projecteuler.problem005;

public class SmallestProduct 
{
    public int result()
    {
        int result = 2520;
        int temp = result;
        boolean isFind = false;
        boolean isDivided;

        while (!isFind)
        {
            for (int divider = 11; divider <= 20; divider++)
            {
                if (temp % divider != 0)
                {
                    isDivided = false;
                    break;
                }
                else
                {
                    isDivided = true;
                }
                if (divider == 20 && isDivided)
                {
                    result = temp;
                    isFind = true;
                }

            }
            temp++;
        }

        return result;
    }
}
