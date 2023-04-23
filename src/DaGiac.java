public abstract class DaGiac {
    private int[] sides;

    public DaGiac(int[] sides) {
        this.sides = sides;
    }

    public double tinhChuVi(){
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }
    public abstract double tinhDienTich();

    public static void main(String[] args) {
        TamGiac tg = new TamGiac(3,4,5);
        System.out.println("Chu vi tam giác: "+ tg.tinhChuVi());
        System.out.println("Diện tích tam giác: "+ tg.tinhDienTich());

        HinhChuNhat hcn = new HinhChuNhat(5,6);
        System.out.println("Chu vi hình chữ nhật: "+ hcn.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật: "+ hcn.tinhDienTich());
    }
}
