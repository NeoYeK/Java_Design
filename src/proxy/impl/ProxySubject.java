package proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.IProgrammer;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class ProxySubject {
    
	/**
	 * ����һ��������
	 * @param loader
	 * @param clazz
	 * @param handler
	 * @return
	 */
	public IProgrammer getOwnerProxy(ClassLoader loader, Class<?> clazz[],
									 InvocationHandler handler) {
		return (IProgrammer) Proxy.newProxyInstance(loader, clazz, handler);
	}
}
