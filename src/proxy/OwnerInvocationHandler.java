package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private IProgrammer programmer;
    
    
	public OwnerInvocationHandler(IProgrammer programmer) {
		this.programmer = programmer;
	}


	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		//programmer��ִ��arg1�����Ķ��󣬷��ظö���

		return arg1.invoke(programmer, arg2);
	}
}
