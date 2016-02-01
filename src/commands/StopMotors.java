package commands;

import subsystems.Sample;
import subsystems.SubsystemFactory;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This is a sample command for an example
 * <p>
 * </p>
 * 
 * @version version 1: 1/29/2016 -- Joe Witcpalek
 *          <p>
 *          Sample
 *          </p>
 * 
 * @author Joe Witcpalek
 *
 */
public class StopMotors extends Command
{
	private Sample m_subsys;

	public StopMotors()
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
		m_subsys.stopMotors();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		m_subsys.stopMotors();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return true;
	}

	// Called once after isFinished returns true
	protected void end()
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}
