package abst;

public class GasolinCar extends Car{
    public GasolinCar(String color, String manufacturer) {
        super(color, manufacturer);
    }

    @Override
    String fillUp() {
        return "이차는 가솔린 차입니다.";
    }
}
