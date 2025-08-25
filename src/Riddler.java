/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int shift = 12;
        for(int i = 0; i < encrypted.length(); i++) {
            if(Character.isLetter(encrypted.charAt(i))) {
                char temp = encrypted.charAt(i);
                if((temp - shift) <= 'a' || (temp - shift) >= 'z') {
                    decrypted +=
                }
            } else {
                decrypted += encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptTwo() function.

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
