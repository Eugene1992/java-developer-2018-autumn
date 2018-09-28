package javaEssential.homework.gameSeaBattle;

public class GamePlayer {
    static int quantitySheep = 4;

    User user = new User();
    Comp comp = new Comp();

    void outputCompShoot(){
        System.out.println("Comp shoot - " + "[" + comp.compX + "," + comp.compY + "] = " + user.userMatrix.gameMatrix[comp.compX][comp.compY]);
    }

    void run(){
        user.setBoard();
        comp.setBoard();
        comp.compMatrix.outputMatrix();
        while (!(user.userResult == quantitySheep) && !(comp.compResult == quantitySheep)) {
            user.setCoordinateToShoot();
            user.shoot(comp.compMatrix);
            comp.setCoordinateToShoot();
            comp.shoot(user.userMatrix);
            outputCompShoot();
        }
        outputWinner();
    }

    void outputWinner(){
        System.out.println();
        System.out.println();
        if (user.userResult == quantitySheep) {
            System.out.println("You win!!!");
        } else if (comp.compResult == quantitySheep) {
            System.out.println("Computer win");
        }
    }

}
