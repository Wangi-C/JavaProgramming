package StackQueue;

import java.util.EmptyStackException;

public class FixedMultiStacks {
	private int numOfStacks = 3; //stack의 갯수 3
	private int stackSize; //각 stack의 사이즈 저장
	private int[] values; //실제 data
	private int[] sizes; //각 satck에 data사이즈 저장할 공간
	
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
	
	public int getTopIndex(int stackNum) { //맨 위에 있는 배열방 번호
		int offset = stackSize * stackNum;//데이터에 접근할 때 (각 스택의 번호 * 스택의 크기)=각 스택의 시작점
		int size = sizes[stackNum]; //현재 스택에 데이터가 얼마나 있는지 알아온다.
		return offset + size -1; // 스택의 시작점 + (각 스택이 가지고 있는 데이터의 크기) = 맨 마지막 데이터 접근
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
		int top = getTopIndex(stackNum); //몇 번 방에서 데이터를 가져와야되는지 방번호를 획득
		int data = values[top]; //그 번호로 데이터를 가져옵니다.
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
