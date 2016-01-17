package Subsystems;

/**
 * This class stores and returns constants relating to the motors and sensors
 * <p></p>
 * @version version 1: 1/16/2016 -- Zach Zweber
 * 			<p>
 * 				Initial class creation, motor and sensor constants with getter methods
 * 			</p>
 * 
 * @version version 2: 1/17/2016 -- Derek Witcpalek
 * 			<p>
 * 				Minimal clean up
 * 			</p>
 * 
 * 
 * @author Zach Zweber
 *
 */
public class SubsystemConstants
{
	//Motor IDs
	//Drive	
	private static final int m_DRIVE_MOTOR_FL = 0;//Front left drive motor
	private static final int m_DRIVE_MOTOR_FR = 0;//Front right drive motor
	private static final int m_DRIVE_MOTOR_BL = 0;//Back left drive motor
	private static final int m_DRIVE_MOTOR_BR = 0;//Back right drive motor
	private static final int m_SPEED_SENSOR_FR = 0;//Front right
	private static final int m_SPEED_SENSOR_FL = 0;//Front left
	private static final int m_SPEED_SENSOR_BR = 0;//Back right
	private static final int m_SPEED_SENSOR_BL = 0;//Back left
	
	//Arm: Climbing mechanism, sally port, drawbridge
	private static final int m_ARM_MOTOR1 = 0;
	private static final int m_ARM_MOTOR2 = 0;
	private static final int m_ARM_SENSOR1 = 0;
	private static final int m_ARM_SENSOR2 = 0;
	
	//Shooter Motors
	private static final int m_BALL_INTAKE = 0;
	private static final int m_BALL_INTAKE_ELEVATION = 0;
	private static final int m_ELEVATION_MOTOR = 0;
	private static final int m_SHOOTER_MOTOR = 0;
	private static final int m_ELEVATION_SENSOR = 0;
	private static final int m_BALL_INTAKE_ELEVATION_SENSOR = 0;
	private static final int m_SHOOTER_SPEED = 0;
	
	//Winch
	private static final int m_WHINCH_MOTOR = 0;
	
	
	
	/**
	 * 
	 * @return an array of drive motor constants in order of left front to right back
	 */
	public static int[] getDriveMotors()//Gives drive motors constants
	{
		int[] a = {m_DRIVE_MOTOR_FL, m_DRIVE_MOTOR_FR, m_DRIVE_MOTOR_BL, m_DRIVE_MOTOR_BR};
		return a; 
	}
	
	
	/**
	 * 
	 * @return an array of arm motor constants in order of 1 to 2
	 */
	public static int[] getArmMotors()//Gives arm motors constants
	{
		int[] a = {m_ARM_MOTOR1, m_ARM_MOTOR2};
		return a;
	}
	
	
	/**
	 * 
	 * @return The shooter motors in order of ball in take to ball in take elevation to elevation motor to shoot motor
	 */
	public static int[] getShooterMotors()
	{
		int[] a = {m_BALL_INTAKE, m_BALL_INTAKE_ELEVATION, m_ELEVATION_MOTOR, m_SHOOTER_MOTOR};
		return a;
	}
	
	
	/**
	 * 
	 * @return Gives winch motor constant
	 */
	public static int getWinch()//Gives winch constant
	{
		return m_WHINCH_MOTOR;
	}
	
	
	/**
	 * 
	 * @return The drive speed sensors from left to right and front back
	 */
	public static int[] getSpeedSensors()
	{
		int[] a = {m_SPEED_SENSOR_FL, m_SPEED_SENSOR_FR, m_SPEED_SENSOR_BL, m_SPEED_SENSOR_BR};
		return a;
	}
	
	
	/**
	 * 
	 * @return The arm sensors in order of 1 to 2
	 */
	public static int[] getArmSensors(){
		int[] a = {m_ARM_SENSOR1, m_ARM_SENSOR2};
		return a;
	}
	
	
	/**
	 * 
	 * @return The shooting mechanism sensors from the elevation sensor to ball in take elevation sensor to shoot speed
	 */
	public static int[] getShooterSensors(){
		int[] a = {m_ELEVATION_SENSOR, m_BALL_INTAKE_ELEVATION_SENSOR, m_SHOOTER_SPEED};
		return a;
	}
	 
}