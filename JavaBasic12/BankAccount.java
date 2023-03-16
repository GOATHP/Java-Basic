package JavaBasic12;

public class BankAccount {
    private String accountNumber;
    private int balance;
    
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber.trim();
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber.trim();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return balance + "원 (계좌번호=" + accountNumber + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount other = (BankAccount) obj;
            return accountNumber.equals(other.accountNumber);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}