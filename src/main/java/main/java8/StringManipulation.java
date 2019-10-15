package main.java8;

public class StringManipulation {

    public static void main(String[] args) {
        //String result = reverseString( "Hello");
        //System.out.println(result);
        //String response = stringReverse("hello");
        //System.out.println(response);
        String str = "Hello";
        char[] strArray = str.toCharArray();
        char[] charArray = {};

        for(int i = strArray.length; i > 0; i--){
            char temp = strArray[strArray.length -i];
            
            System.out.println(temp);

        }


    }

    /*private static String stringReverse(String reversethis) {
        String rev = "";
        for(int i = 0; i <= reversethis.length() - 1; i++){
            rev = rev + reversethis.charAt(reversethis.length() -1 - i);
        }
        return rev;
    }

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int half = charArray.length / 2;
        int last = charArray.length - 1;

        for(int i = 0; i < half/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[last -i];
            charArray[last -i] = temp;
        }
        return new String(charArray);
    }
*/
}
