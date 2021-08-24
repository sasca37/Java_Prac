package interf;

public class Sample05 {
    public static void main(String[] args) {
        ICompute a = new Apartment();
        float area = a.compute(30);
        System.out.println("아파트면적 : " + area);
        area = a.toPyung(area);
        System.out.println(area);
    }
}

class Apartment implements ICompute {

    @Override
    public float compute(int area) {
        return pyung * area;
    }
}

abstract interface ICompute {
    float pyung = 3.3f;
    float compute(int area);
    //float toPyung(int area);
    default float toPyung(float area){
        return area/pyung;
    }
}