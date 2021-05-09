package chapter3;

public class Chapter3 {

    public static void main(String[] args) throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Print . to quite");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch += 32;
                changes++;
                System.out.println("ch = " + ch);
            } else if (ch >= 'A' &  ch <= 'Z'){
                ch -= 32;
                changes++;
                System.out.println("ch = " + ch);
            }
        }
            while (ch != '.');
            System.out.println("changes = " + changes);      
    }
}
