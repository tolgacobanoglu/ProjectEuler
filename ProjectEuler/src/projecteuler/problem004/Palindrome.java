package projecteuler.problem004;

public class Palindrome
{
    private boolean isPalindrome(int number)
    {
        boolean isPalindrome = true;
        String sNumber = "";
        sNumber += number;
        for (int index = 0; index < sNumber.length() / 2; index++)
        {
            if (sNumber.charAt(index) != sNumber.charAt(sNumber.length()-1-index))
            {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }


    public int largestPalindromeProductOfThreeDigits()
    {
        int largestPalindrome = -1;


        for ( int first = 999; first >= 100; first--)
        {
            for (int second = 999; second >= 100; second--)
            {
                if (isPalindrome(first * second))
                {
                    if (first*second > largestPalindrome)
                    {
                        largestPalindrome = first * second;
                        System.out.println("Palindrome "+largestPalindrome);
                    }
                }
            }
        }

        return largestPalindrome;
    }
}
