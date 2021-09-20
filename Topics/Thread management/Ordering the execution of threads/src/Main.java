class Invoker {

    public static void invokeMethods(Thread t1, Thread t2, Thread t3) throws InterruptedException {
        // start passed instances here
        try {
            t3.start();
            t3.join();
            t2.start();
            t2.join();
            t1.start();
            t1.join();
        } catch (Exception e) {
            System.out.println("java.lang.RuntimeException: All threads must be terminated before ending the implemented method");
        }
    }
}