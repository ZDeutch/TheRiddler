/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 * <p>
 * Completed by: Zander Deutch
 */
public class Riddler {

    // Unsure whether the method for wrapping the text is correct
    // Wasn't able to determine how to wrap around the alphabet
    public String decryptOne(String encrypted) {
        String decrypted = "";
        int shift = 9;
        for (int i = 0; i < encrypted.length(); i++) {
            char temp = encrypted.charAt(i);
            if (Character.isLetter(encrypted.charAt(i))) {
                if (temp >= 'A' && temp <= 'Z') {
                    char shifted = (char) ((temp + shift - 'A') % 26 + 'A');
                    decrypted += shifted;
                }
            } else if (temp >= 'a' && temp <= 'z') {
                char shifted = (char) ((temp + shift - 'a') % 26 + 'a');
                decrypted += shifted;
            } else {
                decrypted += temp;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        while (encrypted.length() > 0) {
            String aasci;
            int space = encrypted.indexOf(" ");
            if (space == -1) {
                aasci = encrypted;
                encrypted = "";
            } else {
                aasci = encrypted.substring(0, space);
                encrypted = encrypted.substring(space + 1);
            }
            int val = Integer.parseInt(aasci);
            decrypted += (char) val;
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        int length = 8;
        for (int i = 0; i < encrypted.length(); i += length) {
            int value = 0;
            for (int j = i; j < i + length; j++) {
                if (encrypted.charAt(j) == '1') {
                    value += 1 << (j - i);
                }
            }
            decrypted += (char) value;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        int shift = 9919;

        for(int i = 0; i < encrypted.length(); i++) {
            int temp = encrypted.charAt(i);
            int decoded = temp- shift;
            decrypted += (char) decoded;
        }
        return decrypted;
    }
}
