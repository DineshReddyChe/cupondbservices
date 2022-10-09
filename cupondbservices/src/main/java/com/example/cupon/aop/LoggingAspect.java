package com.example.cupon.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Component
@Aspect
public class LoggingAspect {
	private static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);
//	@Before(value = "execution(* com.example.cupon..*.*(..))")
	@Before(value = "execution(* cuponPath*(..))")
	public void before(JoinPoint joinPoint) {
		String classname = joinPoint.getSignature().getDeclaringType().getName();
		String methodname = joinPoint.getSignature().getName();
		LOGGER.info("Method start :" + classname + "  method name :" + methodname);
	}
//	@After(value = "execution(* com.example.cupon..*.*(..))")
	@After(value = "execution(* cuponPath*(..))")
	public void After(JoinPoint joinPoint) {
		String classname = joinPoint.getSignature().getDeclaringType().getName();
		String methodname = joinPoint.getSignature().getName();
		LOGGER.info("Method start :" + classname + "  method name :" + methodname);
	}
	

	@Around(value = "execution(* cuponPath*(..))")
	public Object aroundsysout(ProceedingJoinPoint joinPoint) throws Throwable {
		String classname = joinPoint.getSignature().getDeclaringType().getName();
		String methodname = joinPoint.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object result = joinPoint.proceed();
		stopWatch.stop();
		LOGGER.info("Metod Start :" + classname + "  method name :" + methodname + "time taken "
				+ stopWatch.getTotalTimeMillis());
		return result;
	}
}
