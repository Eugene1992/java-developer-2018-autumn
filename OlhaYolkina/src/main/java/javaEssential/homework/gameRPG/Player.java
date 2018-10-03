package javaEssential.homework.gameRPG;

public class Player {
    private String user = "user";
    private boolean isComputer;

    public String getUser() {
        return this.user;
    }

    public boolean getIsComputer() {
        return isComputer;
    }

    public void setIsComputer(String answer) {
        if (answer.equals("Yes")) {
            this.isComputer = true;
            this.user = "computer";
        }
    }
}
