import java.util.Scanner;

public class InputWord{
    private final Scanner scanner;

    public InputWord(){
        scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        InputWord userWord = new InputWord();

        String userSay = userWord.getInput("What is on your mind: ");
        System.out.println("You are thinking: " + userSay);

        userWord.closeScanner();
    }
}
