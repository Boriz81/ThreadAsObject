package ClassForThreads;

public class ClassForThreads {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();


        System.out.println("Name: " + thread.getName());
        System.out.println("ID: " + thread.getId());
        System.out.println("Alive: " + thread.isAlive());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("Daemon: " + thread.isDaemon());
        // Daemon thread - демон поток (терминология пришла из UNIX) т.е. это
        // поток с низким приоритетом, который работает на заднем фоне для
        // выполнения таких задач как сбор мусора и так далее
        thread.setName("my-thread");
        System.out.println("New Name: " + thread.getName());
    }
}
