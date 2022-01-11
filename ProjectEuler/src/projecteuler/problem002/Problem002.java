package projecteuler.problem002;

public class Problem002
{
    public static void main(String[] args)
    {
        System.out.println("\nresult = "+fibonacciSummations(4000000));
    }

    public static int fibonacciSummations(int limit)
    {
        int first = 1;
        int second = 2;
        int evenNumberSummations = 0;
        evenNumberSummations += second; //we already initial manually the second element which is equals to 2
        int newElement = first + second;
        System.out.print(first+" "+second);
        while(newElement < limit)
        {
            newElement = first + second;
            if (newElement % 2 == 0)
            {
                evenNumberSummations += newElement;
            }
            first = second;
            second = newElement;
            System.out.print(" "+newElement);
        }
        return evenNumberSummations;
    }
}
