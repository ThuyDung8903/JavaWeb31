public class Calculator {
    public float add(float a, float b){
        return a+b;
    }

    public float sub(float a, float b){
        return a-b;
    }

    public float multiply(float a, float b){
        return a*b;
    }

    public float divide(float a, float b){
        return (a/b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        float a = 20;
        float b = 30;
        System.out.println("Cộng: "+ calc.add(a, b));
        System.out.println("Trừ: "+ calc.sub(a, b));
        System.out.println("Nhân: "+ calc.multiply(a, b));
        System.out.println("Chia: "+ calc.divide(a, b));
    }
}
