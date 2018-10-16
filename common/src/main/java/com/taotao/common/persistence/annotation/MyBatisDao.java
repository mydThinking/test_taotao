package com.taotao.common.persistence.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 标识MyBatis的Dao,方便{org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。
 *
 * @author myd
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {
    /**
     * The value may indicate a suggestion for a logical component name,
     * to be turned into a Spring bean in case of an autodetected component.
     *
     * @return the suggested component name, if any
     */
    String value() default "";

}
