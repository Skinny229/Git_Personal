package org.usfirst.frc.team1495.robot.commands;

import org.usfirst.frc.team1495.robot.Robot;
import org.usfirst.frc.team1495.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Designed to activate and deactivate response for when ultra sonic sensors detects it's too close to an object.
 */
public class ItLives extends Command {

    public ItLives() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    	requires(Robot.ultrasonicl);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(Robot.ultrasonicl.getDist() <= RobotMap.DIST_RETREAT){
    		Robot.driveTrain.goBack();
    	}else{
    		Robot.driveTrain.stopMoving();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
