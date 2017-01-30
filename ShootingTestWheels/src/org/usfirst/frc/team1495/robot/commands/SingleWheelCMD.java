package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SingleWheelCMD extends Command{

	
		
	  public SingleWheelCMD() {
	        // Use requires() here to declare subsystem dependencies
		  	requires(Robot.singleSub);
		  	
	  }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	
	    		Robot.singleSub.letsGo();
	   
	    	
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return false;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	Robot.singleSub.stopSpin();
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    	Robot.singleSub.stopSpin();
	    }

}
