package org.usfirst.frc.team1495.robot.subsystems;

import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GattlingGunSubsystem extends Subsystem {

	VictorSP spin = new VictorSP(RobotMap.GG_SPIN_PORT);

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void updateSafety(boolean bool) {
		spin.setSafetyEnabled(bool);
	}

	/*
	 * DIRECTION BOOLEAN True = positive, False = Negative input
	 */
	public void spin(boolean bool) {
		double spinDirection = RobotMap.GearRatio_GG;
		if (! bool)
			spinDirection *= -1;
		
		spin.set(spinDirection);
	}
	
	public void stopSpin(){
		spin.set(0);
	}
	
}