public class HinhChuNhat extends DaGiac{
    private int width;
    private int height;

    public HinhChuNhat(int width, int height) {
        super(new int[]{width, height, width, height});
        this.width = width;
        this.height = height;
    }

    @Override
    public double tinhDienTich(){
        return width*height;
    }
}
