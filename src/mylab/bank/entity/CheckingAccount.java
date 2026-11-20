package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

public class CheckingAccount extends Account {

    private double withdrawalLimit;

    // 생성자
    public CheckingAccount(String accountNumber,
                           String ownerName,
                           double balance,
                           double withdrawalLimit) {

        super(accountNumber, ownerName, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    // 출금 한도를 검사한 후 부모 클래스의 출금 기능 사용
    @Override
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > withdrawalLimit) {
            throw new WithdrawalLimitExceededException(
                    "출금 한도를 초과했습니다. 한도: "
                    + withdrawalLimit + "원");
        }

        super.withdraw(amount);
    }

    // 계좌 정보 출력
    @Override
    public String toString() {
        return super.toString()
                + ", 출금 한도: "
                + withdrawalLimit + "원";
    }
}
