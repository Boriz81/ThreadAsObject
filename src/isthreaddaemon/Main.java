package isthreaddaemon;

public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setName("New thread");
        String name = ThreadUtil.getName(thread);
        System.out.println(name);
    }
}
