import java.util.ArrayList;

/**
 * Lớp Account mô phỏng tài khoản ngân hàng, chứa các giao dịch nạp/rút tiền và số dư tài khoản.
 */
public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Phương thức khởi tạo mặc định.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Phương thức nạp tiền vào tài khoản (private).
     * Nếu số tiền nạp hợp lệ (lớn hơn 0), số dư sẽ được cập nhật và ghi lại giao dịch.
     * Nếu không hợp lệ, in ra thông báo lỗi.
     *
     * @param amount Số tiền nạp vào tài khoản.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Phương thức rút tiền từ tài khoản (private).
     * Nếu số tiền rút hợp lệ sẽ được cập nhật và ghi lại giao dịch.
     * Nếu số tiền rút không hợp lệ hoặc lớn hơn số dư, in ra thông báo lỗi.
     *
     * @param amount Số tiền rút từ tài khoản.
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * Thêm một giao dịch vào tài khoản.
     * Nếu loại giao dịch hợp lệ (nạp tiền hoặc rút tiền), sẽ thực hiện giao dịch tương ứng.
     * Nếu loại giao dịch không hợp lệ, in ra thông báo lỗi.
     *
     * @param amount    Số tiền giao dịch.
     * @param operation Loại giao dịch (nạp tiền hoặc rút tiền).
     */
    public  void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In lịch sử tất cả các giao dịch của tài khoản.
     * Mỗi giao dịch sẽ được in ra.
     * Số tiền và số dư được làm tròn đến hai chữ số thập phân.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            String operation = transaction.getOperation().equals(Transaction.DEPOSIT)
                    ? "Nap tien" : "Rut tien";
            System.out.println("Giao dich " + (i + 1) + ": " + operation + " $"
                    + String.format("%.2f", transaction.getAmount())
                    + ". So du luc nay: $" + String.format("%.2f", transaction.getBalance()) + ".");
        }
    }
}
