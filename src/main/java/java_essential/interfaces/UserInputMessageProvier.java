package java_essential.interfaces;

import java.util.Scanner;

public class UserInputMessageProvier implements MessageProvider {
    @Override
    public String getMessage() {
        return new Scanner(System.in).next();
    }
}
