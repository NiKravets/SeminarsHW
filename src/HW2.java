import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        String str = "aaaaabbbbcddd";
        String counting = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            String s =Integer.toString(count);
            counting += s + str.charAt(i);


        }
        System.out.println(counting);
    }
}
