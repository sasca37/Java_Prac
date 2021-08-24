package interf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        Data data = new Asc();
        data.setData(1,3,5,4,6);
        data.sort();
        System.out.println(data.toString());

        Data data2 = new Desc();
        data2.setData(1,3,5,4,6);
        data2.sort();
        System.out.println(data2.toString());
    }
}

abstract class Data {
    int[] data;
    public void setData(int ...data){
        this.data = data;
    }
    public abstract void sort();

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}

class Asc extends Data{

    @Override
    public void sort() {
       // Arrays.sort(data);
        int tmp;
        for( int i =0; i< data.length -1; i++) {
            for (int j = 1; j < data.length; j++){
                if(data[i] > data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}

class Desc extends Data {

    @Override
    public void sort() {
       // Arrays.sort(data, Comparator.reverseOrder());
        int tmp;
        for (int i=0; i<data.length -1; i++) {
            for ( int j = i+1; j <data.length; j++){
                if(data[i] < data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }

            }

            for( int k : data){
                System.out.print(k);
            }
            System.out.println("\n");
        }
    }
}
