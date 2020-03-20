package Uvsq21923164.exo3_3;



import java.util.ArrayList;
import java.util.List;


public class ListeRobots {
private ArrayList<RobotStatique> listeRobots;
	
	public ListeRobots() {
		listeRobots = new ArrayList<RobotStatique>();
	}
	
	public void addRobot(RobotStatique R) {
		this.listeRobots.add(R);
	}
	
	public void avancerTous(){
		if(!listeRobots.isEmpty()) {
			for(RobotStatique R: listeRobots) {
				R.avance();
			}
		}
	}
}
