package singleton;

/**
 * Created by http://teachcourse.cn on 2018/03/22.
 */
public class ChocolateBoiler {
	private volatile ChocolateBoiler instance;
	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// �ڹ�¯�������ɿ�����ţ�̵Ļ����
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// �ų���е��ɿ�����ţ��
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// ��¯�������
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
