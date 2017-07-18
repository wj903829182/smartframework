package org.smart4j.framework.test.threadlocal;

/**
 * Created by jack on 2017/7/18.
 */
public class ClientThread extends Thread {
    private Sequence sequence;
    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i=0; i<3 ;i++){
            System.out.println(Thread.currentThread().getName()+" => "+ sequence.getNumber());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
