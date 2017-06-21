package com.mtdp.log4j;

import org.apache.log4j.Logger;

/**
 * Created by zhenchai on 2017/6/16.
 */
public class Log_test {

    final static Logger logger = Logger.getLogger(Log_test.class);

    public static void main(String[] args) {

        Log_test obj = new Log_test();
        obj.runMe("mkyong");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}
