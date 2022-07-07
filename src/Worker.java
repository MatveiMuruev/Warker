public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(OnTaskErrorListener error) {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + (i == errorCallback.onError() ?  " isn't done" : " is done"));
        }
    }
}