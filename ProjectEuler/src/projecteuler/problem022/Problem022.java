package projecteuler.problem022;

import java.util.ArrayList;
import java.util.Collections;

public class Problem022
{
    public static void main(String[] args)
    {
        FileOperation fp = new FileOperation();
        Regex regex = new Regex();

        String namesLine = fp.readFile("C:\\Users\\tolga\\Desktop\\ProjectEuler\\src\\projecteuler\\problem022\\resources\\names.txt");
        System.out.println(namesLine);

        ArrayList<String> namesList = regex.split(namesLine);
        Collections.sort(namesList);
        System.out.println(namesList);


        NameScore nameScore = new NameScore();
        System.out.println("sum : "+nameScore.sum(namesList).toString());

        //System.out.println(nameScore.calculate("COLIN",938));

    }
}
