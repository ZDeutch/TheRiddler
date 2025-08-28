/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    // Unsure whether the method for wrapping the text is correct
    // Wasn't able to determine how to wrap around the alphabet
    public String decryptOne(String encrypted) {
        String decrypted = "";
        int shift = 12;
        for(int i = 0; i < encrypted.length(); i++) {
            char temp = encrypted.charAt(i);
            if(Character.isLetter(encrypted.charAt(i))) {
                if(temp >= 'A' || temp <= 'Z') {
                    char shifted = (char) ((char) (temp - 'A' - 9 + 26) + 'A');
                    decrypted += shifted;
                }
            } else if(temp >= 'a' || temp <= 'z') {
                char shifted = (char) ((char) (temp - 'a' - 9 + 26) + 'a');
                decrypted += shifted;
            } else {
                decrypted += temp;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String current = "";

        for(int i = 0; i < encrypted.length(); i++) {
            char temp = encrypted.charAt(i);
            if(temp != ' '){
                current += temp;
            } else {
                int num = Integer.parseInt(current);
                char letter = (char) num;
                decrypted += letter;
                current = "";
            }
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
