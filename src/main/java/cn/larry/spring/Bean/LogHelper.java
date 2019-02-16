package cn.larry.spring.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogHelper {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void helpMethod(){
        logger.debug("This is a bean debug message");
        logger.info("This is an bean info message");
        logger.warn("This is a bean warn message");
        logger.error("This is bean an error message");
    }
}
