class Info {

    public static void printCurrentThreadInfo() {
        // get the thread and print its info
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        int priority = thread.getPriority();

        System.out.println("name: " + name);
        System.out.println("priority: " + priority);

    }
}