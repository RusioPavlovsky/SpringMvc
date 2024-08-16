package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.config.AppInit;
import web.config.WebConfig;
import web.service.UserService;

public class MainApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, WebConfig.class, AppInit.class);
    }
}
