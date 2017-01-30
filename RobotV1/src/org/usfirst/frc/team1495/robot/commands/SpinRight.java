package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpinRight extends Command{
	public SpinRight(){
		requires(Robot.ggSubsystem);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.ggSubsystem.updateSafety(true);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.ggSubsystem.spin(true);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.ggSubsystem.stopSpin();
		Robot.ggSubsystem.updateSafety(false);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
