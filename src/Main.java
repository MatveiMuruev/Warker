public class Main {
    public static void main(String[] args) {

        int taskError = 33;

        OnTaskDoneListener a = System.out::println;
        OnTaskErrorListener s = () -> taskError;
        Worker worker = new Worker(a, s);
        worker.start(s);
    }
}