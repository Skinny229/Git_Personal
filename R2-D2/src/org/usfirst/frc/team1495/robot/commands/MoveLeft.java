package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class MoveLeft extends Command {
	
	public MoveLeft(){
		requires(Robot.headsubsystem);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.headsubsystem.updateSafety(true);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.headsubsystem.moveLeft(.25);
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
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
