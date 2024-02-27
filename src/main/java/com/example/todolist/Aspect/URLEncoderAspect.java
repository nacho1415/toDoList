package com.example.todolist.Aspect;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class URLEncoderAspect {

    @Before("execution(* com.example.controllers.*.*(..)) && args(url,..)")
    public void encodeURL(String url) throws UnsupportedEncodingException {
        // URL을 UTF-8로 인코딩
        String encodedURL = URLEncoder.encode(url, "UTF-8");
        System.out.println("Encoded URL: " + encodedURL);
    }
}
