ObjectInputStream ois =
    new ObjectInputStream(socket.getInputStream());
// validate/whitelist types before use (e.g., filter or manual check)
Object obj = ois.readObject();
if (!(obj instanceof AllowedType)) {
    throw new InvalidObjectException("disallowed type");
}
// safe to use after validation
