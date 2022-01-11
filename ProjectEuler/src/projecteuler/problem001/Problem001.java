package projecteuler.problem001;

public class Problem001
{
    public static void main(String[] args)
    {
        System.out.println("Limit 10 = "+sumOfMultiples(10,3,5));
        System.out.println("Limit 1000 = "+sumOfMultiples(1000,3,5));
    }

    /**
     * @brief Sums of numbers with modes 0 with respect identifier1 or identifier2
     * @param limit it indicates us to where natural numbers will be ended
     * @param identifier1 first checker for number is mod of
     * @param identifier2 second checker for number is mod of
     * @return sums of numbers which is mod ==0 identifier1 or identifier2
     */
    public static int sumOfMultiples(int limit,int identifier1,int identifier2)
    {
        int result = 0;
        for (int number = 1; number < limit; number++) //starting from 1 because it started from natural number
        {
            if ((number % identifier1 == 0) || (number % identifier2 == 0))
            {
                //System.out.println("item = "+currentIndex);
                result += number;
            }
        }

        return result;
    }

}
