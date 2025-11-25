import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Roman {
    public static String intToRoman(int value) {
        Map<String, Integer> my_map = new LinkedHashMap<>();
        my_map.put("M",1000);
        my_map.put("CM",900);
        my_map.put("D",500);
        my_map.put("CD",400);
        my_map.put("C",100);
        my_map.put("XC",90);
        my_map.put("L",50);
        my_map.put("XL",40);
        my_map.put("X",10);
        my_map.put("IX",9);
        my_map.put("V",5);
        my_map.put("IV",4);
        my_map.put("I",1);

        String result = "";

        for(Map.Entry<String, Integer> entry:my_map.entrySet()){
            while(value >= entry.getValue()){
                result += entry.getKey();
                value -=entry.getValue();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}