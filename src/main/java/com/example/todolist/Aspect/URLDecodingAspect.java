//package com.example.todolist.Aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestParam;
//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
//import java.util.Arrays;
//
//@Aspect
//@Component
//public class URLDecodingAspect {
//
//    @Pointcut("execution(* com.example.todolist.Controller.*.*(..)) && args(.., @RequestParam(*), ..)")
//    public void controllerMethods() {}
//
//    @Before("execution(* com.example.todolist.*.*(..))")
//    public void decodeURLParameters(Object param) {
//        if (param instanceof String) {
//            try {
//                String decodedParam = URLDecoder.decode((String) param, "UTF-8");
//                // 디코딩된 파라미터를 적용
//                System.out.println("Decoded parameter: " + decodedParam);
//            } catch (UnsupportedEncodingException e) {
//                // 처리할 수 없는 인코딩인 경우에 대한 예외 처리
//                e.printStackTrace();
//            }
//        }
//    }
//}
