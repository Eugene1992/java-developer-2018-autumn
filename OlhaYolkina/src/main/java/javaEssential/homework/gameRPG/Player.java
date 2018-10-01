package javaEssential.homework.gameRPG;

public class Player {
    private String user = "user";
    private boolean isComputer;

    public String getUser(){
        return this.user;
    }

    public void checkIsComputer(){
        if (this.isComputer){
            this.user = "computer";
        }
    }

    public void setIsComputer(String answer){
//        System.out.println("Is this user is Computer?");
        if (answer.equals("Yes")){
            this.isComputer = true;
        }
    }
}
