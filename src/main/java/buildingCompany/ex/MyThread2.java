package buildingCompany.ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread2 implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void run() {
        LOGGER.info("My thread2 is running");
        int t =10;
        for(int i=0;i<=t;i++){
            LOGGER.info(i);
        }
    }
}
