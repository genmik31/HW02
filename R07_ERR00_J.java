try {
    someApiThatThrows();
} catch (IOException e) {
    // handle or propagate
    System.err.println("I/O error: " + e.getMessage());
    // or: throw e;  (rethrow after logging)
}
