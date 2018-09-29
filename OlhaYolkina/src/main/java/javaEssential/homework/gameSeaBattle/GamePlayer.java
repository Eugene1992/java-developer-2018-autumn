package javaEssential.homework.gameSeaBattle;

public class GamePlayer {
    static int quantitySheep = 4;

    void run(){
        User user = new User();
        Comp comp = new Comp();
        user.userMatrix = user.setBoard();
        comp.compMatrix = comp.setBoard();
        comp.compMatrix.outputMatrix();
        while (!(user.userResult == quantitySheep) && !(comp.compResult == quantitySheep)) {
            user = user.setCoordinateToShoot();
            user = user.shoot(comp.compMatrix);
            comp = comp.setCoordinateToShoot();
            System.out.println("Comp shoot - " + "[" + comp.compX + "," + comp.compY + "] = " + user.userMatrix.gameMatrix[comp.compX][comp.compY]);
            comp = comp.shoot(user.userMatrix);
        }
        System.out.println();
        System.out.println();
        if (user.userResult == quantitySheep) {
            System.out.println("You win!!!");
        } else if (comp.compResult == quantitySheep) {
            System.out.println("Computer win");
        }
    }
}
