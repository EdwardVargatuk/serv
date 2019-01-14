public class Cuboid implements VolumeCalc {
    private  double sideA;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private double sideB;
    private double sideC;
    @Override
    public double calcVolume() {
        return sideA*sideB*sideC;
    }
}
