package ui;
import domain.model.*;

public class Test {
    public static void main(String[] args) {
       var shape = new Shape[] {
            
                new Square(15),
                new Rect(10, 20),
                new Square(10)
            };

         var sumArea = 0;

         for (Shape shape2 : shape) {
            sumArea = sumArea + shape2.getarea();
         }
    }
}