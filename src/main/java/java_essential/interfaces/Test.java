package java_essential.interfaces;

public class Test {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessagePrinter printer = new ConsoleMessagePrinter();
        MessagePrintRunner messagePrintRunner = new MessagePrintRunner(printer, provider);
        messagePrintRunner.print();
        messagePrintRunner.setProvider(new UserInputMessageProvier());
        messagePrintRunner.print();
    }
}
