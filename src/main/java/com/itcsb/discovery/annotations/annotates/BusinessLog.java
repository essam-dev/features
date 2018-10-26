package com.itcsb.discovery.annotations.annotates;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.itcsb.discovery.annotations.enums.BusinessAction;

@Target({ ElementType.METHOD })
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessLog {
	BusinessAction LogAction();

}