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

	// Optinal Settings

	// 0-1 for Head Motor speed 0 being nothing and 1 being full power
	public static double headGearRatio = .25;

	// 0-1
	public static double gearRatio = 1.0;

	// Intiating Drive train motors to PWM port
	public static final int RIGHT_Motor = 0;
	public static final int LEFT_Motor = 1;
	public static final int HEAD_Motor = 2;


	

}
