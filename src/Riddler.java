/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 * <p>
 * Completed by: Zander Deutch
 */
public class Riddler {

   // Caesar shift puzzle
    public String decryptOne(String encrypted) {
        String decrypted = "";
        // The letters are shifted forward by 9
        int shift = 9;
        for (int i = 0; i < encrypted.length(); i++) {
            char temp = encrypted.charAt(i);
            // If the character is a letter
            if (Character.isLetter(encrypted.charAt(i))) {
                // check if it is upper case or lower case
                if (temp >= 'A' && temp <= 'Z') {
                    // add the shift and then wrap the text with modulus
                    char shifted = (char) ((temp + shift - 'A') % 26 + 'A');
                    decrypted += shifted;
                } else if (temp >= 'a' && temp <= 'z') {
                    char shifted = (char) ((temp + shift - 'a') % 26 + 'a');
                    decrypted += shifted;
                }
            } else {
                decrypted += temp;
            }
        }
        return decrypted;
    }

    // AASCI value puzzle
    public String decryptTwo(String encrypted) {
        String decrypted = "";
        while (encrypted.length() > 0) {
            String aasci;
            // seperate each number by the space after
            int space = encrypted.indexOf(" ");
            // if there are no spaces, then you get out of loop
            if (space == -1) {
                aasci = encrypted;
                encrypted = "";
            } else {
                // Otherwise make the number the string and move the rest of the text
                aasci = encrypted.substring(0, space);
                encrypted = encrypted.substring(space + 1);
            }
            // convert to integer and then to its equivalent char value
            int val = Integer.parseInt(aasci);
            decrypted += (char) val;
        }
        return decrypted;
    }

    // Binary puzzle
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // These are 8 bit binary strings, so seperate accordingly
        int length = 8;
        // first divide each into its 8-bit chunks
        for (int i = 0; i < encrypted.length(); i += length) {
            int value = 0;
            // for each number in the chunk
            for (int j = i; j < i + length; j++) {
                // Shift left if there is a 1
                if (encrypted.charAt(j) == '1') {
                    value += 1 << (j - i);
                }
            }
            // finally, convert that binary to a char and repeat
            decrypted += (char) value;
        }
        return decrypted;
    }

    // Dingbat puzzle
    public String decryptFour(String encrypted) {
        String decrypted = "";
        // The shift is by 9919
        int shift = 9919;

        // for each emoji
        for(int i = 0; i < encrypted.length(); i++) {
            // shift it back and add to your string
            int temp = encrypted.charAt(i);
            int decoded = temp- shift;
            decrypted += (char) decoded;
        }
        return decrypted;
    }
}
