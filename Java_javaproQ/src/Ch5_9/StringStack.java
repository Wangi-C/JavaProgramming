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
		if (set - 1 < 0) // stack에 아무것도 넣지 않았을 떄
			return null;
		set--; // stack 한칸을 내려줌 (stack[set]은 빈공간을 가리키고 있으니깐)
		String s = stack[set]; // 맨 위의 값
		return s;
	}
	@Override
	public boolean push(String val) {
		if (set < num) {
			stack[set] = val; // 맨 위에 문자열을 넣어줌
			set++; // stack 한칸을 올려줌
			return true;
		} else {
			return false;
		}
	}
}
