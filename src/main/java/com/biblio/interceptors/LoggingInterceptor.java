package com.biblio.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoggingInterceptor implements Interceptor {

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("Interceptor Pre-procesamiento acción: " + invocation.getAction());

		//Invocando la acción
		String result = invocation.invoke();
 
		System.out.println("Interceptor Post-procesamiento acción" + invocation.getAction());
		
		return result;
	}

}
