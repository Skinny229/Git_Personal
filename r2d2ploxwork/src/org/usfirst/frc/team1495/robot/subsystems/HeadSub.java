package org.usfirst.frc.team1495.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HeadSub extends Subsystem{

	VictorSP head = new VictorSP(2);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void MoveGo(){
		head.set(.25);
	}
	public void MoveGoL(){
		head.set(-.25);
	}
	public void stopHead(){
		head.set(0);
	}

}
