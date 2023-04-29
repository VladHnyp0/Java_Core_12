package ua.lviv.lgs.car;

public class Auto {
    int horsepower;
    int yearManufacture;
    Wheel wheel;
    Engine engine;


    public Auto(int horsepower, int yearManufacture, Wheel wheel, Engine engine) {
        this.horsepower = horsepower;
        this.yearManufacture = yearManufacture;
        this.wheel = wheel;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "horsepower= " + horsepower +
                ", yearManufacture= " + yearManufacture +
                ", wheel material= " + wheel.wheelMaterial +
                ", wheel diametr= " + wheel.wheelDiametr +
                ", engine= " + engine.cylinders +
                '}';
    }

}
