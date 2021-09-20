import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int firstThreeSum = input.charAt(0) + input.charAt(1) + input.charAt(2);
        int lastThreeSum = input.charAt(3) + input.charAt(4) + input.charAt(5);
        if (firstThreeSum == lastThreeSum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}