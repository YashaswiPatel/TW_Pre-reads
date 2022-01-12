import processing.core.PApplet;

public class TryProcessing extends PApplet {
        public static final int WIDTH = 640;
        public static final int HEIGHT = 640;
        int start=0;
        int start2=0;
        int start3=0;
        int start4=0;
        int i2=50;

        public static void main(String[] args)
        {
            PApplet.main("TryProcessing", args);
        }

        @Override
        public void settings() {
            super.settings();
            size(WIDTH, HEIGHT);
        }


        @Override
        public void draw() {
            ellipse(start, HEIGHT*1/5, 50, 50);
            start+=1;
            ellipse(start2, HEIGHT*2/5, 50, 50);
            start2+=2;
            ellipse(start3, HEIGHT*3/5, 50, 50);
            start3+=3;
            ellipse(start4, HEIGHT*4/5, 50, 50);
            start4+=4;

        }
    }

