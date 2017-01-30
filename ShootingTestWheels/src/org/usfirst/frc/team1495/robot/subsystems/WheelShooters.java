package org.usfirst.frc.team1495.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WheelShooters extends Subsystem{

	VictorSP left = new VictorSP(0);
	VictorSP right = new VictorSP(1);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void goSpin(){
		left.set(.4);
		right.set(-.4);
	}
	
	public void stopSpin(){
		left.set(0);
		right.set(0);
	}
	
	public void updateSafety(boolean bool){
		left.setSafetyEnabled(bool);
		right.setSafetyEnabled(bool);
	}

}
