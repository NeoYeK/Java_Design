package proxy.impl;

import proxy.IProgrammer;

/**
 * Created by http://teachcourse.cn on 2018-3-30.
 */
public class RealSubject implements IProgrammer {

	@Override
	public void developeApp() {
		System.out.println("�ͻ���Ҫ����һ������Android�ͻ��ˡ�iPhone�ͻ��˵�APP");

	}

	@Override
	public void developeWebSite() {
		System.out.println("�ͻ���Ҫ����һ��PC����վ");

	}

	@Override
	public void developeServer() {
		System.out.println("�ͻ���Ҫ����һ��������APP��PC��վ�ĺ�̨");

	}

}
