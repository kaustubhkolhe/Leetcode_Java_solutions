class Solution {
    public int romanToInt(String s) {
         Map<Character,Integer> toNum=new HashMap<>();

        toNum.put('I',1);
        toNum.put('V',5);
        toNum.put('X',10);
        toNum.put('L',50);
        toNum.put('C',100);
        toNum.put('D',500);
        toNum.put('M',1000);

        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");

        int number = 0;
        for (int i = 0; i < s.length(); i++)
        {
            number = number + (toNum.get(s.charAt(i)));
        }
        return number;
        
    }
}