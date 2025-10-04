void readFile(Path p) throws IOException {
    try (BufferedReader br = Files.newBufferedReader(p)) {
        String line = br.readLine();
        // use line...
    } // auto-closed
}
