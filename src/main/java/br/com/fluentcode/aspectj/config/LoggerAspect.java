package br.com.fluentcode.aspectj.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggerAspect {

	private final Logger logger = LoggerFactory.getLogger("aspectj.class");

	/**
	 * Means the execution of any method on a Calculator class regardless of return or method parameter types.
	 * 
	 * Note: Method names may contain the * wildcard, indicating any number of characters in the method name.
	 * The wildcard .. indicates zero or more parameters
	 * 
	 */
	@Pointcut("execution(* br.com.fluentcode.aspectj.business.Calculator.*(..))")
	public void allMethodsCalculator() {
	}

	@Before("allMethodsCalculator()")
	public void log(JoinPoint joinPoint) {
		logger.trace(joinPoint.getSignature().toLongString());
	}

}
