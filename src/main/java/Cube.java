public class Cube implements VolumeCalc{
    private double dimension;

    public Cube(){}

    public Cube(double dimension, double volume) {
        this.dimension = dimension;
        this.volume = volume;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double volume;


    @Override
    public double calcVolume() {
        return Math.pow(dimension, 3);
    }
}
