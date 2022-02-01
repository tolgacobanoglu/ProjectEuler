package projecteuler.problem008;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LargestProductOfSeries
{

    private List<String> digitParser(String setOfSeries)
    {
        List<String> series = new ArrayList<>();
        int firstIndicator = 0;
        int lastIndicator = 13; //length of digits
        String tempSeries;
        while (lastIndicator != (setOfSeries.length() + 1))
        {
            tempSeries = setOfSeries.substring(firstIndicator,lastIndicator);
            if (zeroChecker(tempSeries))
            {
                series.add(tempSeries);
            }
            firstIndicator++;
            lastIndicator++;
        }

        return series;
    }

    // regex for check series has 0 or not if there are 0 product will be equal to 0
    private boolean zeroChecker(String series)
    {
        return Pattern.matches("[^0]+",series);
    }

    private long productOfSeriesDigits(String series)
    {
        long result = 1;
        for (int index = 0; index < series.length(); index++)
        {
            result *= Character.getNumericValue(series.charAt(index));
        }

        return result;
    }

    public long largestProductOfSet(String setOfSeries)
    {
        List<String> series = new ArrayList<>();
        series = digitParser(setOfSeries);

        long largest = productOfSeriesDigits(series.get(0));


        for(String serial:series)
        {
            if (productOfSeriesDigits(serial) > largest)
            {
                largest = productOfSeriesDigits(serial);
                System.out.println("--"+serial);
            }
        }

        return largest;
    }

}
