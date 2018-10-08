package java_essential.singletone;

public class Connection {
    private String url;

    private static final Connection instance = new Connection("http:///allaal.com");

    private Connection(String url) {
        this.url = url;
    }

    public static Connection getInstance() {
        return instance;
    }
}
