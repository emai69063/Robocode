package EM;
import robocode.*;
import java.awt.Color;
import java.Math;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * TestRobot2 - a robot by (your name here)
 */
public class TestRobot2 extends Robot
{
	/**
	 * run: TestRobot2's default behavior
	 */
 	public boolean strafeStyle = true;
  public double whereTheHecc = 0;
  public double xPrevE = 0;
  public double yPrevE = 0;
  public double xCurrE = 200;
  public double yCurrE = 200;

	public void run() {
		// Initialization of the robot should be put here
			//boolean targetLock = false;
			setAdjustGunForRobotTurn(true);
			setAdjustRadarForGunTurn(true);
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnRadarRight(360);
			turnRadarLeft(360);
      //movement
      turnLeft(Math.random()*360);
      back(50);
      ahead(50);
      turnRight(Math.random()*360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		//turnGunLeft(90);
		//turnGunRight(e.getHeading());
    whereTheHecc = e.getBearing() + this.getHeading() - getGunHeading();

    if ( whereTheHecc <= 180){
      turnGunRight(whereTheHecc);
    } else {
      turnGunLeft(whereTheHecc);
    }

  //if xPrevE ==  && yPrevE == && &&

    fire(1);

    //xPrevE = e.getDistance()*Math.cos(Math.toRadians(e.getBearing() + this.getHeading()));
    //yPrevE = e.getDistance()*Math.sin(Math.toRadians(e.getBearing() + this.getHeading()));
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
		switchStrafe(2);
	}

	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}

	public void switchStrafe(int e) {
		switch (e){
			case 0:
				strafeStyle = true;
				break;
			case 1:
				strafeStyle = false;
				break;
			case 2:
				if(strafeStyle){
					strafeStyle = false;
				}else{
					strafeStyle = true;
				}
				break;
		}


	}

}
