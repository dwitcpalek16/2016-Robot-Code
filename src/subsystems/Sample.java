package subsystems;

import org.usfirst.frc.team302.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This class is a sample subsystem.
 * 
 * <p>
 * <font size="4pt"><b>Change Log:</b></font>
 * </p>
 * 
 * 
 * @version version 1: 1/29/2016 -- Joe Witcpalek
 *          <p>
 *          Example
 *          </p>
 * 
 * @author Joe Witcpalek
 */

public class Sample extends Subsystem
{

	CANTalon m_talon1;
	CANTalon m_talon2;

	public Sample()
	{
		m_talon1 = new CANTalon(RobotMap.SAMPLE_MOTOR1);
		m_talon2 = new CANTalon(RobotMap.SAMPLE_MOTOR2);
		m_talon2.setInverted(true);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void runMotors(double speed)
	{
		m_talon1.set(speed);
		m_talon2.set(speed);
	}

	public void stopMotors()
	{
		m_talon1.set(0.0);
		m_talon2.set(0.0);
	}
}
