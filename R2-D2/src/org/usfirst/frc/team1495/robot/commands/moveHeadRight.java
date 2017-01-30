package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;
import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class moveHeadRight extends Command {

	public moveHeadRight() {
		requires(Robot.headsubsystem);
		requires(Robot.limitswitch);
	}

	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.limitswitch.resetCounters();
		//Robot.headsubsystem.updateSafety(true);
	}

	protected void execute() {
		// TODO Auto-generated method stub
		if(! (Robot.limitswitch.getCounter() > 0)){
			Robot.headsubsystem.moveRight(RobotMap.headGearRatio);
		}else{
			Robot.headsubsystem.stop();
		}
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.headsubsystem.stop();
		//Robot.headsubsystem.updateSafety(false);

	}

	protected void interrupted() {

	}

}
