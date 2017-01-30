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

	public static final int JOYSTICK_PORT = 1;
	
	public static final int ACTIVATE_ULTRASONIC_BTTN = 1;
	public static final int TEST_ULTRASONIC_RANGE_BTTN = 2;

	public static final int GEAR_RATIO = 1;
	public static final int LEFT_FRONT_MOTOR = 0;
	public static final int LEFT_BACK_MOTOR = 1;
	public static final int RIGHT_FRONT_MOTOR = 2;
	public static final int RIGHT_BACK_MOTOR = 3;

	public static final int ULTRASONIC_PORT = 11;
	public static final double ULTRASONSONIC_VOLTAGE_RATIO = .1156;
	public static final int DIST_RETREAT = 4;		
	public static final double RETREAT_RATE = .25; 

}
