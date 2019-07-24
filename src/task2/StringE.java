package task2;

//Return true if the given string contains between 1 and 3 'e' chars.

public class StringE {
    public static void main(String[] args) {
        StringE test = new StringE();
        System.out.println(test.stringE("Hello there!"));
    }

    public boolean stringE(String str) {
        char strChar;
        int letterCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            strChar = str.charAt(i);
            if (strChar == 'e') {
                letterCounter += 1;
            }
        }

        return letterCounter > 0 && letterCounter < 4;
    }
}
