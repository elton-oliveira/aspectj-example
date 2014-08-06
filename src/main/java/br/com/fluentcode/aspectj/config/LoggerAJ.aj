package br.com.fluentcode.aspectj.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect LoggerAJ {
	
	private final Logger logger = LoggerFactory.getLogger("aspectj.aj");

	/**
	 * Means the execution of any method on a Calculator class regardless of return or method parameter types.
	 * 
	 * Note: Method names may contain the * wildcard, indicating any number of characters in the method name.
	 * The wildcard .. indicates zero or more parameters
	 * 
	 */
	pointcut allMethodsCalculator() : execution(* br.com.fluentcode.aspectj.business.Calculator.*(..));

	before() : allMethodsCalculator() {
		logger.trace(thisJoinPoint.getSignature().toLongString());
	}
}
