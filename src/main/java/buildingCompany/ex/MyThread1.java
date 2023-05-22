package buildingCompany.ex;

import buildingCompany.MyLogger;
import org.apache.logging.log4j.Logger;

public class MyThread1 extends Thread {

    final Logger LOGGER = MyLogger.getLogger();

    public void run() {
        LOGGER.info("Thread1 is running");
        int t =10;
        try {
            for(int i=0;i<=t;i++){
                LOGGER.info(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
