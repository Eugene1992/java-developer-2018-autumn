package java_professional.stream_methods;

import java.util.Date;

public class LineTrafficUsing {
    private Date dateLine;
    private double innerIn;
    private double innerOut;
    private double uaixIn;
    private double uaixOut;
    private double inetIn;
    private double inetOut;

    public LineTrafficUsing(Date dateLine, double innerIn, double innerOut,
                            double uaixIn, double uaixOut, double inetIn, double inetOut) {
        this.dateLine = dateLine;
        this.innerIn = innerIn;
        this.innerOut = innerOut;
        this.uaixIn = uaixIn;
        this.uaixOut = uaixOut;
        this.inetIn = inetIn;
        this.inetOut = inetOut;
    }

    public Date getDateLine() {
        return dateLine;
    }

    public void setDateLine(Date dateLine) {
        this.dateLine = dateLine;
    }

    public double getInnerIn() {
        return innerIn;
    }

    public void setInnerIn(double innerIn) {
        this.innerIn = innerIn;
    }

    public double getInnerOut() {
        return innerOut;
    }

    public void setInnerOut(double innerOut) {
        this.innerOut = innerOut;
    }

    public double getUaixIn() {
        return uaixIn;
    }

    public void setUaixIn(double uaixIn) {
        this.uaixIn = uaixIn;
    }

    public double getUaixOut() {
        return uaixOut;
    }

    public void setUaixOut(double uaixOut) {
        this.uaixOut = uaixOut;
    }

    public double getInetIn() {
        return inetIn;
    }

    public void setInetIn(double inetIn) {
        this.inetIn = inetIn;
    }

    public double getInetOut() {
        return inetOut;
    }

    public void setInetOut(double inetOut) {
        this.inetOut = inetOut;
    }
}

