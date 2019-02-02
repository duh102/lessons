public class Lesson2 {
    public static void main(String[] args) {
        byte a = (byte)0xff;
        short b = (short) 0xffff;
        int c = 0xffffffff;
        long d = 0xffffffffffffffffL;

        float x = 0.1f;
        double y = 0.1;

        System.out.printf("byte %d short %d int %d long %d", a, b, c, d);
        System.out.printf("float %f double %f\n", x, y);

        for( int i = 0; i < 10; i++) {
            x = x / (float)10.0;
            System.out.printf("Iter %d %.20f\n", i, x);
        }
        for( int i = 0; i < 10; i++) {
            y = y / 10.0;
            System.out.printf("Iter %d %.20f\n", i, y);
        }

        System.out.printf("%d / %d == %d\n", 1, 1, 1/1);
        System.out.printf("%d / %d == %d\n", 1, 2, 1/2);
        System.out.printf("%d / %d == %d\n", 2, 2, 2/2);
        System.out.printf("%d / %d == %d\n", 5, 4, 5/4);
        System.out.printf("%d / %d == %d\n", 10, 5, 10/5);
        System.out.printf("%d / %d == %d\n", 10, 2, 10/2);

    }
}
