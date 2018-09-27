package java_essential.SeaBattle;

public class Ship {
    private int yAxis;
    private int xAxis;
    private boolean isAlive;

    public Ship(Player player, int fleet) {
        this.isAlive = true;
    }

	public Ship(int yAxis, int xAxis) {
        this.yAxis = yAxis;
        this.xAxis = xAxis;
        this.isAlive = true;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }    
}
