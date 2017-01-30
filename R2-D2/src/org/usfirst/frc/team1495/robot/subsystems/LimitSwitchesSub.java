package org.usfirst.frc.team1495.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LimitSwitchesSub extends Subsystem{

	DigitalInput limit = new DigitalInput(0); // RIGHT
	DigitalInput limit2 = new DigitalInput(1); //LEFT
	Counter counter = new Counter(limit);
	Counter counter2 = new Counter(limit2);
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isSwitchOnR(){
		boolean returned;
		if(counter.get() > 0)
			returned = true;
		else
			returned = false;
		return returned;	
	}
	public boolean isSwitchOnL(){
		boolean returned;
		if(counter2.get() > 0)
			returned = true;
		else
			returned = false;
		return returned;
	}
	public  int getCounter(){
		
		return counter.get();
	}
	public int getCounter2(){
		return counter2.get();
	}
	public void resetCounters(){
		counter.reset();
		counter2.reset();
		
	}
	
	

	
}
