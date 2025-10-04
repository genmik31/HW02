class Counter {
    private int value;

    public void inc() {
        synchronized (this) {        // locking on this (publicly accessible)
            value++;
        }
    }
}
