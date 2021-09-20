package server;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] database = new String[100];
        Arrays.fill(database, "");

        Scanner sc = new Scanner(System.in);

        while (true) {
            String command = sc.next();
            if ("exit".equals(command)) {
                break;
            }
            int index = sc.nextInt() - 1;
            String text = sc.nextLine();

            if ("set".equals(command) && checkIndex(index)) {
                database[index] = text;
                System.out.println("OK");

            } else if ("get".equals(command) && checkPresence(index, database)) {
                System.out.println(database[index]);
            } else if ("delete".equals(command) && checkIndex(index)) {
                database[index] = "";
                System.out.println("OK");
            }
        }

    }

    public static boolean checkIndex(int index) {
        if ((index >= 0) && (index <= 99)) {
            return true;
        } else {
            displayError();
            return false;
        }
    }

    public static boolean checkPresence(int index, String[] db) {
        if ((index >= 0) && (index <= 99) && !("".equals(db[index]))) {
            return true;
        } else {
            displayError();
            return false;
        }
    }

    public static void displayError() {
        System.out.println("ERROR");
    }
}
