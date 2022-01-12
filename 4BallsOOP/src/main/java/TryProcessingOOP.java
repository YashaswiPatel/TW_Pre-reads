
import processing.core.PApplet;
public class TryProcessingOOP extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int STARTPOINT = 0;
    Circle circle1, circle2, circle3, circle4;

    public static void main(String[] args) {
        PApplet.main("TryProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        super.setup();
        background(255);
        circle1 = new Circle(STARTPOINT, 1 * HEIGHT / 5, 50,1);
        circle2 = new Circle(STARTPOINT, 2 * HEIGHT / 5, 50, 2);
        circle3 = new Circle(STARTPOINT, 3 * HEIGHT / 5, 50, 3);
        circle4 = new Circle(STARTPOINT, 4 * HEIGHT / 5, 50, 4);
    }


    @Override
    public void draw() {
        circle1.draw();
        circle2.draw();
        circle3.draw();
        circle4.draw();
    }

    public class Circle {
        int start;
        int diameter;
        int speed;
        int height;

        public Circle(int start, int height, int diameter, int speed) {
            this.start = start;
            this.diameter = diameter;
            this.speed = speed;
            this.height = height;
        }

        void draw() {
            ellipse(start, height, diameter, diameter);
            start += speed;
        }
    }
}