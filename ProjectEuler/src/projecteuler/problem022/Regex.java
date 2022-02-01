package projecteuler.problem022;

import projecteuler.problem022.util.Utils;

import java.util.ArrayList;

public class Regex
{
    public ArrayList<String> split(String words)
    {
        String[] wordsArray = words.split("[\",]+");
        return Utils.arrayConvertToArrayListWithRule(wordsArray,"");
    }
}