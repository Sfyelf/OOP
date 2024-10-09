/**
 * Lớp Transaction lưu trữ thông tin về một giao dịch.
 * Gồm có loại giao dịch (nạp tiền, rút tiền), số tiền giao dịch và số dư sau giao dịch.
 */
public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Phương thức khởi tạo lớp Transaction với ba tham số.
     *
     * @param operation Loại giao dịch (nạp tiền hoặc rút tiền).
     * @param amount    Số tiền giao dịch.
     * @param balance   Số dư còn lại sau giao dịch.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Cập nhật loại giao dịch.
     *
     * @param operation Loại giao dịch mới.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Cập nhật số tiền giao dịch.
     *
     * @param amount Số tiền giao dịch mới.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Cập nhật số dư sau giao dịch.
     *
     * @param balance Số dư mới.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Lấy loại giao dịch.
     *
     * @return Loại giao dịch.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Lấy số tiền giao dịch.
     *
     * @return Số tiền giao dịch.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Lấy số dư còn lại sau giao dịch.
     *
     * @return Số dư còn lại.
     */
    public double getBalance() {
        return balance;
    }
}
