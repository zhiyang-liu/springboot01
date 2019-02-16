package cn.larry.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void test(){
        logger.debug("This is a service debug message");
        logger.info("This is an service info message");
        logger.warn("This is a service warn message");
        logger.error("This is an service error message");
    }
}
