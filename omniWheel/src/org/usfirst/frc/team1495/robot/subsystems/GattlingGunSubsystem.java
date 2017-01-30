package org.usfirst.frc.team1495.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GattlingGunSubsystem extends Subsystem{

	VictorSP victor = new VictorSP(4);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void updateSpin(){
		victor.setSafetyEnabled(true);
	}
	public void spin(){
		victor.set(1.0);
	}
	public void stopSpin(){
		victor.set(0);
	}

}
