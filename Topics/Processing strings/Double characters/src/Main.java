import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output += String.format("%s%s", input.charAt(i), input.charAt(i));
        }

        System.out.println(output);
    }
}