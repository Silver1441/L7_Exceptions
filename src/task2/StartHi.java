package task2;

//Given a string, return true if the string starts with "hi" and false otherwise.

public class StartHi {
    public static void main(String[] args) {
        StartHi test = new StartHi();
        System.out.println(test.startHi("hi there"));
    }

    public boolean startHi(String str) {
        return str.matches("hi(.*)");
    }
}
