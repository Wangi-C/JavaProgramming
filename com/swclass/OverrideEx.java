package com.swclass;

public class OverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�丮�� one = new ��ȭ�丮��();
		�丮�� two = new �ϽĿ丮��();
		
		OverrideEx ex = new OverrideEx();
		ex.�ֹ�(one);
		ex.�ֹ�(two);
	}

	public void �ֹ�(�丮�� parent) {
		parent.�丮�ϴ�();
		parent.�����ϴ�();
		parent.�������ϴ�();
		parent.geti();
	}
}
