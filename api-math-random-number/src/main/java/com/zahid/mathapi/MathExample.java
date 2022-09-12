public class MathExample {
    public static void main(String[] args) {
        int a=10;
        int b=-19;
        double x=152.3;
        double y=0.349;

        // abs()
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));
        System.out.println();

        // sqrt()
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(3));
        System.out.println(Math.sqrt(64));
        System.out.println();

        // round()
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));
        System.out.println();

        // ceil()
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
        System.out.println();

        // floor()
        System.out.println(Math.floor(x));
        System.out.println(Math.floor(y));
        System.out.println();

        // min()
        System.out.println(Math.min(a, b));
        System.out.println(Math.min(x, y));
        System.out.println();

        // max()
        System.out.println(Math.max(a, b));
        System.out.println(Math.max(x, y));
        System.out.println();

        // PI
        System.out.println(Math.PI);
        System.out.println();

        // E
        System.out.println(Math.E);
        System.out.println();

        // sin(), cos(), tan()
        System.out.println(Math.sin(Math.PI*0.5));
        System.out.println(Math.sin(Math.PI*0.25));
        System.out.println(Math.cos(Math.PI*0.5));
        System.out.println(Math.cos(Math.PI*1.0));
        System.out.println(Math.cos(Math.PI*0.25));
        System.out.println(Math.tan(Math.PI*0.33));
        System.out.println(Math.tan(Math.PI*0.25));

    }
}
