package abst;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("검정", "현대");
        GasolinCar gasolinCar = new GasolinCar("흰색", "기아");
        electricCar.printInfo();
        gasolinCar.printInfo();
        electricCar.setColor("검흰");
        electricCar.printInfo();
    }
}
