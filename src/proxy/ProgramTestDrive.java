package proxy;

import proxy.impl.ProxySubject;
import proxy.impl.RealSubject;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class ProgramTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��������
		IProgrammer realSubject = new RealSubject();
		
		//��ȡ���������ClassLoader
		Class<?> clazz=realSubject.getClass();
		ClassLoader loader = clazz.getClassLoader();
		
		//��дInvocationHandler��invoke(Object,Method,Object[])����
		OwnerInvocationHandler handler = new OwnerInvocationHandler(realSubject);
		IProgrammer iProgrammer = new ProxySubject().getOwerProxy(loader,
				new Class[] { IProgrammer.class }, handler);
		
		iProgrammer.developeApp();
		iProgrammer.developeWebSite();
		iProgrammer.developeWebSite();
	}

}
