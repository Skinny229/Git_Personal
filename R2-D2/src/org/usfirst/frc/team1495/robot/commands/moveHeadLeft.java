package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;
import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class moveHeadLeft extends Command{

	public moveHeadLeft(){
		requires(Robot.headsubsystem);
		requires(Robot.limitswitch);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.limitswitch.resetCounters();
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(! (Robot.limitswitch.getCounter2() > 0)){
			Robot.headsubsystem.moveRight(RobotMap.headGearRatio * -1);
		}else{
			Robot.headsubsystem.stop();
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.headsubsystem.stop();
		//Robot.headsubsystem.updateSafety(false);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
