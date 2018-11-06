package java_professional.io.decorator;

public class StringReader extends MyReader {

    private byte[] bytes;
    private int cursor;

    public StringReader(String str) {
        this.bytes = str.getBytes();
    }

    @Override
    int read() {
        return bytes[cursor++];
    }

    @Override
    boolean ready() {
        return cursor != bytes.length;
    }
}
