package StackQueue;

import java.util.EmptyStackException;

public class FixedMultiStacks {
	private int numOfStacks = 3; //stack�� ���� 3
	private int stackSize; //�� stack�� ������ ����
	private int[] values; //���� data
	private int[] sizes; //�� satck�� data������ ������ ����
	
	public FixedMultiStacks (int satackSize) {
		this.stackSize = stackSize;
		this.sizes = new int[numOfStacks];
		this.values = new int[numOfStacks * stackSize];
	}
	
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackSize;
	}
	
	public int getTopIndex(int stackNum) { //�� ���� �ִ� �迭�� ��ȣ
		int offset = stackSize * stackNum;//�����Ϳ� ������ �� (�� ������ ��ȣ * ������ ũ��)=�� ������ ������
		int size = sizes[stackNum]; //���� ���ÿ� �����Ͱ� �󸶳� �ִ��� �˾ƿ´�.
		return offset + size -1; // ������ ������ + (�� ������ ������ �ִ� �������� ũ��) = �� ������ ������ ����
	}
	
	public void push(int stackNum, int data) throws FullStackException{
		if(isFull(stackNum)) {
			throw new FullStackException();
		}
		values[getTopIndex(stackNum)+1] = data;
		sizes[stackNum]++;
	}
	
	public int pop(int stackNum) {
		if(isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		int top = getTopIndex(stackNum); //�� �� �濡�� �����͸� �����;ߵǴ��� ���ȣ�� ȹ��
		int data = values[top]; //�� ��ȣ�� �����͸� �����ɴϴ�.
		values[top]= 0;
		sizes[stackNum]--;
		return data;
	}
	
	public int peek(int stackNum) {
		if(isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		return values[getTopIndex(stackNum)];
	}
}
