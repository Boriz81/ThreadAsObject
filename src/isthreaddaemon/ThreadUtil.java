package isthreaddaemon;

class ThreadUtil {
    public static void printlfDaemon(Thread thread) {
        System.out.println(thread.isDaemon() ? "Daemon" : "Not Daemon");
    }
    public static String getName(Thread thread) {
        /*String nameThread;
        System.out.println(thread.getName());*/
        /*return getName(thread);*/
        return thread.getName();
    }
}
