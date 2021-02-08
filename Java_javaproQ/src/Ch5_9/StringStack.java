package Ch5_9;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Track;

public class StringStack implements Stack{
	int num, set;
	String top;
	String[] stack;
	
	public StringStack(int num) {
		stack = new String[num];
		this.num = num;
		this.set = 0;
	}
	
	@Override
	public int length() {
		return set;
	}
	@Override
	public int capacity() {
		return stack.length;
	}
	@Override
	public String pop() { 
		if (set - 1 < 0) // stack�� �ƹ��͵� ���� �ʾ��� ��
			return null;
		set--; // stack ��ĭ�� ������ (stack[set]�� ������� ����Ű�� �����ϱ�)
		String s = stack[set]; // �� ���� ��
		return s;
	}
	@Override
	public boolean push(String val) {
		if (set < num) {
			stack[set] = val; // �� ���� ���ڿ��� �־���
			set++; // stack ��ĭ�� �÷���
			return true;
		} else {
			return false;
		}
	}
}
