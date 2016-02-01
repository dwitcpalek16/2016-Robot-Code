package org.usfirst.frc.team302.robot;

/**
 * This class stores and returns constants relating to the motors and sensors
 * <p>
 * </p>
 * 
 * @version version 1: 1/16/2016 -- Zach Zweber
 *          <p>
 *          Initial class creation, motor and sensor constants with getter
 *          methods
 *          </p>
 * 
 * @version version 2: 1/17/2016 -- Derek Witcpalek
 *          <p>
 *          Minimal clean up
 *          </p>
 * 
 * @version version 3: 1/29/2016 -- Joe Witcpalek
 *          <p>
 *          Refactor Package Name, make public static final and remove accessors
 *          Rename to RobotMap
 *          </p>
 * 
 * @author Zach Zweber
 *
 */
public class RobotMap
{
	// Motor IDs
	// Drive
	public static final int DRIVE_MOTOR_FRONT_LEFT = 0;// Front left drive motor
	public static final int DRIVE_MOTOR_FRONT_RIGHT = 0;// Front right drive
														// motor
	public static final int DRIVE_MOTOR_REAR_LEFT = 0;// Back left drive motor
	public static final int DRIVE_MOTOR_REAR_RIGHT = 0;// Back right drive motor
	public static final int SPEED_SENSOR_FRONT_RIGHT = 0;// Front right
	public static final int SPEED_SENSOR_FRONT_LEFT = 0;// Front left
	public static final int SPEED_SENSOR_REAR_RIGHT = 0;// Back right
	public static final int SPEED_SENSOR_REAR_LEFT = 0;// Back left

	// Arm: Climbing mechanism, sally port, drawbridge
	public static final int ARM_MOTOR1 = 0;
	public static final int ARM_MOTOR2 = 0;
	public static final int ARM_SENSOR1 = 0;
	public static final int ARM_SENSOR2 = 0;

	// Shooter Motors
	public static final int SHOOTER_MOTOR1 = 0;
	public static final int SHOOTER_MOTOR2 = 0;
	public static final int SHOOTER_ELEVATION_MOTOR = 0;
	public static final int SHOOTER_ELEVATION_SENSOR = 0;
	public static final int SHOOTER_SPEED_SENSOR1 = 0;
	public static final int SHOOTER_SPEED_SENSOR2 = 0;

	public static final int SAMPLE_MOTOR1 = 1;
	public static final int SAMPLE_MOTOR2 = 2;

}