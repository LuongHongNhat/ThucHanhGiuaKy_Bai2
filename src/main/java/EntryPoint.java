import java.util.Scanner;

public class EntryPoint {
    private static String inputString() {
        System.out.println("Input your string:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString;
    }

    public static void main( String[] args ) {
        String inputStr = inputString();
        Password.Level res = Password.checkPassword(inputStr);
        switch (res) {
            case WEAK:
                System.out.println("Your password is weak.");
                break;
            case STRONG:
                System.out.println("Your password is strong.");
                break;
            case NOT_STRONG_ENOUGH:
                System.out.println("Your password is not strong enough.");
                break;
        }
    }
}
