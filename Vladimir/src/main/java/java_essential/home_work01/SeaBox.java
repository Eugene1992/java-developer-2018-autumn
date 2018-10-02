package java_essential.home_work01;

public class SeaBox {
    private int coordX;
    private int coordY;
    private String haveSomething;

    public SeaBox(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.haveSomething = "Empty";
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

    public void setHaveSomething(String haveSomething) {
        this.haveSomething = haveSomething;
    }

    public String gethaveSomething() {
        return haveSomething;
    }
}
