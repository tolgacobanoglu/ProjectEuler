package projecteuler.problem022.util;

import java.util.ArrayList;

public class Utils
{
    public static ArrayList<String> arrayConvertToArrayListWithRule(String[] words,String rule)
    {
        ArrayList<String> wordsList = new ArrayList<>();
        for (String word:words)
        {
            if (!word.matches(rule))
            {
                wordsList.add(word);
            }
        }
        return wordsList;
    }
}
