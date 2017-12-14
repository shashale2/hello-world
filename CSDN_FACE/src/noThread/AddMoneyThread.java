package noThread;

public class AddMoneyThread implements Runnable {
    private Account account;    // �����˻�
    private double money;       // ������

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    public void run() {
    	synchronized (account) {
            account.deposit(money); 
            System.out.println(account.getBalance());
        }
    }

}
