public class TamGiac extends DaGiac {
    private int a;
    private int b;
    private int c;

    public TamGiac(int a, int b, int c) {
        super(new int[]{3, 4, 5});
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhDienTich() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
