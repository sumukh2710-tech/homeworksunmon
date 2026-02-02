interface Drawable {

    void draw();
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Triangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class code47 {
    public static void main(String[] args) {

        Drawable d1 = new Circle();
        Drawable d2 = new Triangle();

        d1.draw();
        d2.draw();
    }
}
