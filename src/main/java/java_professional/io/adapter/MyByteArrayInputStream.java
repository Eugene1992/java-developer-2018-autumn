package java_professional.io.adapter;

public class MyByteArrayInputStream extends MyInputStream {

    private byte[] bytes;
    private int cursor;

    public MyByteArrayInputStream(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    int read() {
        return bytes[cursor++];
    }

    @Override
    int available() {
        return cursor != bytes.length ? bytes.length - cursor : 0;
    }
}
