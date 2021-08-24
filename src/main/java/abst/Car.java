package abst;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
    private String color;
    private String manufacturer;

    public void printInfo(){
        System.out.println("이차의 색 : "+this.color);
        System.out.println("이차의 제조 : "+this.manufacturer);
        System.out.println("이차의 정보 : "+ fillUp());
    }

    abstract String fillUp();

    public void setColor(String color) {
        this.color = color;
    }
}
