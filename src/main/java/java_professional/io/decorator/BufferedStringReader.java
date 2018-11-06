package java_professional.io.decorator;

import java.io.Reader;

public class BufferedStringReader extends MyReader {

    private MyReader reader;

    public BufferedStringReader(MyReader reader) {
        this.reader = reader;
    }

    @Override
    int read() {
        return reader.read();
    }

    @Override
    boolean ready() {
        return reader.ready();
    }

    public String readLine() {
        String buf = "";
        while (true) {
            int read = reader.read();
            if (read == '\n') {
                break;
            }
            buf += (char) read;
        }
        return buf;
    }
}
