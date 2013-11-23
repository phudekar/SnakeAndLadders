package main;

import static org.junit.Assert.*;
import main.Snake;

import org.junit.Test;

public class SnakeTest {

	@Test
	public void shouldHaveHead(){
		int position = 5;
		Snake snake = new Snake(new Block(position), null);
		Block head = snake.getHead();
		assertNotNull(head);
		assertEquals(position, head.getPosition());
	}
	

	@Test
	public void shouldHaveTail(){
		int headPosition = 25;
		int tailPosition = 2;
		Snake snake = new Snake(new Block(headPosition), new Block(tailPosition));
		Block tail = snake.getTail();
		assertNotNull(tail);
		assertEquals(tailPosition, tail.getPosition());
	}

}
