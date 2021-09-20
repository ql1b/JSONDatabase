import java.util.Scanner;

class MessageNotifier extends Thread {
    private final Scanner scanner = new Scanner(System.in);
    private String msg;
    private int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}