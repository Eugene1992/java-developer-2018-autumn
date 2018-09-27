package java_essential.SeaBattle;

public class BoardBox {
    private int yAxis;
    private int xAxis;
    private String status;

    public BoardBox() {
    }

    public BoardBox(int yAxis, int xAxis, String status) {
        this.yAxis = yAxis;
        this.xAxis = xAxis;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
