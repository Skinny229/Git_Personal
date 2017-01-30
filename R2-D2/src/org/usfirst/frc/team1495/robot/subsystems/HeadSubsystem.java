package org.usfirst.frc.team1495.robot.subsystems;

import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HeadSubsystem extends Subsystem {
	
	
	
	public VictorSP head = new VictorSP(RobotMap.HEAD_Motor);
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		//head.setSafetyEnabled(true);
		
	}
	
	public void moveRight(double speed){
		head.set(speed);
		
	}
	
	public void moveLeft(double speed){

		head.set(speed * -1);
		
	}
	public void updateSafety(boolean bool){
		head.setSafetyEnabled(bool);
	}
	
	
	public void stop(){
		head.set(0);
	}
}
