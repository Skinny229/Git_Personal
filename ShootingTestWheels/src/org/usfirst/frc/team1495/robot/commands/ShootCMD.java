package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootCMD extends Command{

	public ShootCMD(){
		requires(Robot.shooterSub);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.shooterSub.goSpin();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.shooterSub.stopSpin();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.shooterSub.stopSpin();
	}

}
