import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if ("abcdefghijklmnopqrstuvwxyz".contains(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}