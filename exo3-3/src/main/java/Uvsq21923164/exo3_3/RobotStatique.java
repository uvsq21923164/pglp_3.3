package Uvsq21923164.exo3_3;


public class RobotStatique {
	protected Position position;
	protected Direction direction;
	
	public RobotStatique(Position pos, Direction dir) {
		this.position=pos;
		this.direction=dir;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void avance() {
		;
	}

}
