class Counter {
    private final Object lock = new Object();
    private int value;

    public void inc() {
        synchronized (lock) {        // private final lock object
            value++;
        }
    }
}
