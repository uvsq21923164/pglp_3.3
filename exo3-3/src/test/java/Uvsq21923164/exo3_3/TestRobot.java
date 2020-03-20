package Uvsq21923164.exo3_3;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRobot {
	
	@Test
	public void tourneTest() {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Direction expected=Direction.EST;
		R.tourne();
		
		assertEquals(expected,R.getDirection());
	}
	
	@Test
	public void avanceTest() {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Position expected=new Position(2,4);
		R.avance();
		
		assertEquals(expected.getY(),R.getPosition().getY());
		assertEquals(expected.getX(),R.getPosition().getX());
	}
}