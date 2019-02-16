package cn.larry.spring.controller;

import cn.larry.spring.Bean.LogHelper;
import cn.larry.spring.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/bbb")
    String home(HttpServletRequest request, Model model) {
        logger.debug("This is a controller debug message");
        logger.info("This is an controller info message");
        logger.warn("This is a controller warn message");
        logger.error("This is an controller error message");
        new LogHelper().helpMethod();
        new SampleService().test();
        request.setAttribute("message","hello world!");
        model.addAttribute("name","hello moto");
        return "/welcome.html";//返回页面，只需在resource目录下新建一个static文件，将页面放入。去掉@responseBody。加/与不加/均可以
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
