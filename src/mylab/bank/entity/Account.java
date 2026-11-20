package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;

public  class Account {

    private String accountNumber;
    private String ownerName;
    private double balance;

    // 생성자
    public Account(String accountNumber, String ownerName,
                   double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // 입금
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "입금액은 0보다 커야 합니다.");
        }

        balance += amount;

        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: "
                + balance + "원");
    }

    // 출금
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "출금액은 0보다 커야 합니다.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "잔액이 부족합니다. 현재 잔액: "
                    + balance + "원");
        }

        balance -= amount;

        System.out.println(amount + "원이 출금되었습니다. 현재 잔액: "
                + balance + "원");
    }

    // 계좌 정보 출력
    @Override
    public String toString() {
        return "계좌번호: " + accountNumber
                + ", 소유자: " + ownerName
                + ", 잔액: " + balance + "원";
    }
}
