package lambdas;

public class Threads {

    public static void main(String[] args) {

        Runnable trabalho1 = () -> {
          for (int i = 0; i < 10; i++) {
              System.out.println("\u001B[92mTrabalho#01");
              try {
                  Thread.sleep(30);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Runnable trabalho2 = () -> {
          for (int i = 0; i < 20; i++) {
              System.out.println("\u001B[91mTrabalho#02");
              try {
                  Thread.sleep(30);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);

        t1.start();
        t2.start();

    }

}
