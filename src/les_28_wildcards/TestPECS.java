package les_28_wildcards;

import les_11_inheritance.Shape;
import les_11_inheritance.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TestPECS {
    public static void main(String[] args) {

        List<Triangle> listTR = new ArrayList<>();
        printShapes(listTR);

        List<Shape> listSH = new ArrayList<>();
        fillMyListWithShapes(listSH);

        List<Object> listOBJ = new ArrayList<>();
        fillMyListWithShapes(listOBJ);
    }
    static void printShapes(List<? extends Shape> list){
        list.forEach(System.out::println);
    }
    static void fillMyListWithShapes(List<? super Shape> list){
        for (int i = 0; i < 5; i++) {
            list.add(new Triangle("d",1,2,3));
        }
    }
}