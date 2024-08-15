package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.config.WebConfig;

public class MainApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
