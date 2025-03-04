package oop.encap.Quiz;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    // 객체 생성 시 필요한 값을 모두 전달받음. (mian을 보고 판단)
    public BankAccount(String accountNumber, String accountHolder, long initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;

    }



    //잔액 조회 메서드
    public long getBalance() {
        return balance;
    }

    //입금 메서드
    public void deposit(long money) {
        if (money > 0) {
            this.balance += money;
            System.out.println(money + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("0보다 큰 금액을 입금해주세요");

        }
    }

    // 출금
    public void withdraw(long money) {
        if (money > 0 && balance >= money) {
            balance -= money;
            System.out.println(money + "원이 출금되었습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액이 부족하거나 잘못된 금액입니다.");
        }
    }


}
