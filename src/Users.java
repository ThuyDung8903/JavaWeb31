import java.util.Scanner;

public class Users {
    private String username;
    private String password;
    private double amount;

    public static Users[] users = {
            new Users("user1", "123456789", 5000),
            new Users("user2", "987654321", 1000),
            new Users("user3", "11112222", 28000),
            new Users("user4", "12341234", 1000000),
            new Users("user5", "56785678", 123354),
            new Users("user6", "99999999", 4345),
            new Users("user7", "khongnhopass", 34),
            new Users("user8", "quenroi", 435534),
            new Users("user9", "000000000", 76867),
            new Users("user10", "898989898", 789678),
    };

    public Users() {
    }

    public Users(String username, String password, double amount) {
        this.username = username;
        this.password = password;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getAmount() {
        return amount;
    }

    public static Users[] getUsers() {
        return users;
    }

    public static Users login(Scanner scanner) {
        System.out.print("Vui lòng nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Vui lòng nhập mật khẩu: ");
        String password = scanner.nextLine();
        for (Users user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.printf("Chào mừng %s trở lại!\n", username);
                return user;
            }
        }
        System.out.println("Tên đăng nhập hoặc mật khẩu không chính xác. Vui lòng thử lại.");
        return null;
    }

    public static void withdrawals(Scanner sc, Users user) {
        System.out.print("Nhập số tiền muốn rút: ");
        double amount = sc.nextDouble();

        if (amount > user.amount) {
            System.out.println("Số dư không đủ để rút tiền.");
        }else{
            user.amount -= amount;
            System.out.printf("Bạn đã rút %.0f thành công.\n", amount);
        }
    }

    public static void checkBalance(Users user) {
        System.out.printf("Số dư trong tài khoản của bạn là %.0f.\n", user.amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users user = null;

        while (true){
            user = login(scanner);
            if(user != null){
                break;
            }
        }

        while (true) {
            System.out.println("Vui lòng chọn một trong các tùy chọn sau:");
            System.out.println("1. Rút tiền");
            System.out.println("2. Xem số dư");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng chọn chức năng: ");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    withdrawals(scanner, user);
                    break;
                case 2:
                    checkBalance(user);
                    break;
                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.");
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}

