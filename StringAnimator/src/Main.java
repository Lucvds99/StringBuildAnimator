import java.util.Scanner;

public class Main {
    public static char[] alphabetArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>/? ".toCharArray();
    public static void main(String[] args) throws InterruptedException {
        while(true){
            Scanner scanner = new Scanner(System.in);
            String enterCap = scanner.nextLine();

            System.out.println("enter string: ");
            String sentence = "this is a test string to stop constently typing it";//scanner.nextLine();
            boolean finished = false;

            while (!finished){
                StringBuilder finalSentence = new StringBuilder();
                char[] array = sentence.toCharArray();
                for (char c : array) {
                    for (char alpha : alphabetArray) {
                        System.out.println(finalSentence.toString() +alpha);
                        Thread.sleep(0, 10);
                        if (alpha == c){
                            finalSentence.append(alpha);
                            break;
                        }
                    }
                }
                finished = true;
            }
        }
    }
}