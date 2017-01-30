package org.usfirst.frc.team1495.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SingleWheel extends Subsystem{

	VictorSP singleW = new VictorSP(2);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void letsGo(){
		singleW.set(.3);
	}
	public void letsGoTheOtherWay(){
		singleW.set(-.3);
	}
	public void stopSpin(){
		singleW.set(0);
	}
	
}
