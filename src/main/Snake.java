package main;

public class Snake {

	private Block head;
	private final Block tail;

	public Snake(Block head, Block tail){
		this.head = head;
		this.tail = tail;
	}

	public Block getHead() {
		return head;
	}

	public Block getTail() {
		return tail;
	}
}
