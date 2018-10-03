package java_essential.interfaces;

public class MessagePrintRunner {
    private MessagePrinter printer;
    private MessageProvider provider;

    public MessagePrintRunner(MessagePrinter printer, MessageProvider provider) {
        this.printer = printer;
        this.provider = provider;
    }

    public MessagePrinter getPrinter() {
        return printer;
    }

    public void setPrinter(MessagePrinter printer) {
        this.printer = printer;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public void print() {
        printer.printMessage(provider.getMessage());
    }
}
