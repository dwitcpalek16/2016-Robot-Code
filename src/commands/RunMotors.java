package commands;

import subsystems.Sample;
import subsystems.SubsystemFactory;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is a sample command to run 2 motors with one inverted.
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
public class RunMotors extends Command
{

	private Sample m_subsys;

	public RunMotors()
	{
		m_subsys = SubsystemFactory.getSubsystemFactory().getSample();
		requires(m_subsys);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
	}

	public void start()
	{
		m_subsys.runMotors(1.0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		m_subsys.runMotors(1.0);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	protected void end()
	{
		m_subsys.stopMotors();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{

	}
}
