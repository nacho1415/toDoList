//package com.example.todolist.Controller.Aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LoggingAspect {
//
//    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
//
//    @Around("execution(* com.example.todolist.Controller..*(..)) && @annotation(org.springframework.web.bind.annotation.PostMapping)")
//    public Object logPostRequest(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        String className = joinPoint.getTarget().getClass().getName();
//        logger.info("POST request received for method {} in class {}", methodName, className);
//
//        // 요청을 처리하고 결과를 반환
//        Object result = joinPoint.proceed();
//
//        // 반환된 결과에 추가 정보를 포함하여 반환
//        String modifiedResult = "{\"data\": \"" + result + "\"}";
//        return modifiedResult;
//    }
//}