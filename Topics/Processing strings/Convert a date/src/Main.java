import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] inputArr = input.split("-");

        System.out.printf("%s/%s/%s", inputArr[1], inputArr[2], inputArr[0]);
    }
}