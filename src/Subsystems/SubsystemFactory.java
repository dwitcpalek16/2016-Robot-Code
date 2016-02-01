package subsystems;

/**
 * This class will keep track of all of the robot's subsystems. Rather than
 * accessing subsystems directly, you ask the subsystem factory for each of the
 * subsystems you need, and it will give what you ask for. Beware, the subsystem
 * factory only gives subsystems that are listed in the SubsystemName enum. If
 * you ask for a rocket thruster, the factory will not give you one...too bad
 * for you!
 * 
 * <p>
 * Here is an example of how to access a subsystem: <i>Drive drive =
 * SubsystemFactory.getSubsystemFactory().getDrive();</i>
 * </p>
 * 
 * 
 * <p>
 * <font size="4pt"><b>Change Log:</b></font>
 * </p>
 * 
 * @version <b>version 1:</b>
 *          <p>
 *          1/16/2016 --Derek Witcpalek --> original class
 *          </p>
 * 
 * 
 * @version <b>version 2:</b>
 *          <p>
 *          1/17/2016 --Derek Witcpalek --> added methods to get each specific
 *          subsystem, changed <i>getSubsystem</i> method to private, changed
 *          SubsystemName enum to private
 *          </p>
 * 
 * @version version 3: 1/29/2016 -- Joe Witcpalek
 *          <p>
 *          Refactor Package Name, remove excess subsystems removed getSubsystem
 *          method and enum. Added a sample subsystem.
 *          </p>
 * 
 * 
 * 
 * @author Derek Witcpalek
 */
public class SubsystemFactory
{

	// Subsystems
	private Drive m_drive; // Drive
	private Shooter m_shooter; // Shooter
	private Arm m_arm; // Arm
	private Sample m_sample; // Example

	// Factory
	private static SubsystemFactory m_factory = null;

	/**
	 * Creator-->can not be called by you!!!
	 */
	private SubsystemFactory()
	{
		m_drive = null;
		m_shooter = null;
		m_arm = null;
		m_sample = null;
	}

	/**
	 * This is used to get the subsytem factory so that you can get the subystem
	 * you need. You need to call this before you can call getSubsytem().
	 * 
	 * 
	 * @return SubsystemFactory
	 */
	public static SubsystemFactory getSubsystemFactory()
	{
		if (m_factory == null)
		{
			m_factory = new SubsystemFactory();
		}

		return m_factory;
	}

	/*==============================================================================*/
	//THE FOLLOWING METHODS ARE USED BY OUTSIDE CLASSES TO GAIN ACCESS TO SUBSYSTEMS//
	/*==============================================================================*/

	
	/**
	 * Call this method to get the drive subsystem object
	 * 
	 * @return Drive The robot drive system object
	 */
	public Drive getDrive()
	{
		if (m_drive == null)
		{
			m_drive = new Drive();
		}
		return m_drive;
	}

	/**
	 * Call this method to get the shooter subsystem object
	 * 
	 * @return Shooter The robot's shooter object
	 */
	public Shooter getShooter()
	{
		if (m_shooter == null)
		{
			m_shooter = new Shooter();
		}
		return m_shooter;
	}

	/**
	 * Call this method to get the arm subsystem object
	 * 
	 * @return Arm The robot's arm object
	 */
	public Arm getArm()
	{
		if (m_arm == null)
		{
			m_arm = new Arm();
		}
		return m_arm;
	}

	/**
	 * Call this method to get the sample subsystem object
	 * 
	 * @return Sample The robot's sample Subsystem object
	 */
	public Sample getSample()
	{
		if (m_sample == null)
		{
			m_sample = new Sample();
		}
		return m_sample;
	}

}
