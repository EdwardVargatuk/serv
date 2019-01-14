public class Sphere implements VolumeCalc {
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double r;


    @Override
    public double calcVolume() {
        return (4.0 / 3.0 * Math.PI * Math.pow(r, 3));
    }
}
