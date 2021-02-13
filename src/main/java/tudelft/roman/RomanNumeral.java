package tudelft.roman;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }

    public int convert2(String s) {
        int temp = 0;
        int result = 0;
        s = s.toUpperCase(Locale.ROOT);
        for (int i = 0; i < s.length(); i++) {
            int currInt = map.get(s.charAt(i));
            int nextInt = 0;
            if (i < s.length() - 1 )
                nextInt = map.get(s.charAt(i + 1));


            if (currInt < nextInt) {
                temp = nextInt - currInt;
                i++;
            } else {
                temp = currInt;
            }
            result += temp;
        }

        return result;
    }
}
