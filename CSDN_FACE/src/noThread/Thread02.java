package noThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread02 {



    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(10);
       
        
        for(int i = 1; i <= 100; i++) {
        	service.execute(new AddMoneyThread(account, 10));
        }

        service.shutdown();

        while(!service.isTerminated()) {}

        System.out.println("�˻����: " + account.getBalance());

       
    

}
}
