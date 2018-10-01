package java_essential.home_work01;

public class Ship {
    private int coordX;
    private int coordY;
    private boolean isAlive = true;

    public Ship(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean getIsAlive() {
        return isAlive;
    }
}
