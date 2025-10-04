void readFile(Path p) throws IOException {
    BufferedReader br = Files.newBufferedReader(p);
    String line = br.readLine();
    // ... may exit early, never closes br
}
