package projecteuler.problem004;

public class Problem004
{
    public static void main(String[] args)
    {
        Palindrome palindrome = new Palindrome();
        int largestPalindrome = palindrome.largestPalindromeProductOfThreeDigits();
        System.out.println(largestPalindrome);
    }
}
