package ArrrayPros;

import javax.sound.midi.Soundbank;

public class TestNew {


    public static void main(String[] args) {


        String str = "JaVa SeleNium";

// Convert to all lowercase
        String lowercaseStr = str.toLowerCase();
        System.out.println(lowercaseStr); // Output: java selenium

// Convert to all uppercase
        String uppercaseStr = str.toUpperCase();
        System.out.println(uppercaseStr); // Output: JAVA SELENIUM

// Convert lowercase to uppercase and vice versa
        String convertedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                convertedStr += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                convertedStr += Character.toUpperCase(c);
            } else {
                convertedStr += c;
            }
        }
        System.out.println(convertedStr); // Output: jAvA sELENIUM



    }
}


