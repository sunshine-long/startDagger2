package com.example.marlon.startdaggar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 测试自定义注解范围
 *
 * @author Marlon
 * @date 2017/12/1
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RedCloth {
}
