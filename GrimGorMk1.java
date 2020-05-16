package Waagh;
import robocode.*;
import java.awt.Color;

//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * GrimGorMk1 - a robot by (your name here)
 */
public class GrimGorMk1 extends AdvancedRobot
{
	/**
	 * run: GrimGorMk1's default behavior
	 */
	public void run() {
	setColors(Color.BLACK, Color.GREEN, Color.WHITE, Color.RED, Color.YELLOW);
	while (true) {
		
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
			// Replace the next 4 lines with any behavior you would like
			setTurnGunRight(360);
			setAhead(199);
			setTurnRight(100);
			execute();
			turnLeft(180);
			
		}	
	}		

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
	double x = getHeading() - getRadarHeading() + e.getBearing();
	setTurnGunLeft(x);
	fire(3);
	execute();
	
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		
	}	
}
