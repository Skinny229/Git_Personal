package org.usfirst.frc.team1495.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//Initializing Robot Drive Motor PWM ports
	public static final int RD_LEFT_F = 0;
	public static final int RD_LEFT_B = 1;
	public static final int RD_RIGHT_F = 2;
	public static final int RD_RIGHT_B = 3;
	
	//Initializing Gattling Gun motors
	public static final int GG_SPIN_PORT = 4;
	
	public static final int JOYSTICK_PORT = 1;
	
	public static final double GearRatio_GG = .5;
	
}
