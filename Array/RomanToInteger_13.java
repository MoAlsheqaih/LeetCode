import java.util.LinkedHashMap;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("MCMXCIV")); //1994
    }
    public static int romanToInt(String s) {
        int sum = 0;
        LinkedHashMap<String, Integer> roman = new LinkedHashMap<>();
        roman.put("I", 1 );
        roman.put("V", 5 );
        roman.put("X", 10 );
        roman.put("L", 50 );
        roman.put("C", 100 );
        roman.put("D", 500 );
        roman.put("M", 1000);
        for ( int i = 0 ; i < s.length() - 1 ; i++ ){
            String c1 = s.charAt(i) + "";
            String c2 = s.charAt(i+1) + "";
            if ( roman.get(c1) < roman.get(c2) ){
                sum = sum - roman.get(c1);
            }
            else {
                sum = sum + roman.get(c1);
            }
        }
        sum = sum + roman.get(s.charAt(s.length()-1) +"");
        return sum;
    }
}
