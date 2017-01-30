package org.usfirst.frc.team1495.robot.subsystems;

import org.usfirst.frc.team1495.robot.Robot;
import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

	protected RobotDrive driveTrainl = Robot.roboDrive;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void goBack() {
			driveTrainl.drive(RobotMap.RETREAT_RATE * -1, RobotMap.RETREAT_RATE * -1);
	}
	public void stopMoving(){
			driveTrainl.stopMotor();
	}

}