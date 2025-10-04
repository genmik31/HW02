class Worker {
    static volatile boolean done = false; // ensure visibility across threads

    static void spin() {
        while (!done) {
            // do work
        }
    }
}
