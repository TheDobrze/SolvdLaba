package buildingCompany.ex;

import buildingCompany.MyLogger;
import org.apache.logging.log4j.Logger;


public class Threds {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        Thread t2 = new Thread(new MyThread2());
        t1.start();

        t2.start();


    }
}

