public class Tetrahedron implements VolumeCalc {
    private double areaOfBase;
    private double heightToBase;

    @Override
    public double calcVolume() {
        return 1.0/3.0*areaOfBase*heightToBase;
    }

    public double getAreaOfBase() {
        return areaOfBase;
    }

    public void setAreaOfBase(double areaOfBase) {
        this.areaOfBase = areaOfBase;
    }

    public double getHeightToBase() {
        return heightToBase;
    }

    public void setHeightToBase(double heightToBase) {
        this.heightToBase = heightToBase;
    }
}
