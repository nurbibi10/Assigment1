import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("C:\\\\Users\\\\User\\\\IdeaProjects\\\\untitled\\\\src\\\\source.txt");
            Shape shape = readShapeFromFile(file);
            System.out.println("The perimeter: " + shape.calculatePerimeter());
            System.out.println("The longest side: " + shape.getLongestSide());
            System.out.println("The average side: " + shape.getAvgSide());
        }

