package Subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;



/**
 * This class will keep track of all of the robot's subsystems.
 * Rather than accessing subsystems directly, you ask the subsystem
 * factory for each of the subsystems you need, and it will give what
 * you ask for. Beware, the subsystem factory only gives subsystems that
 * are listed in the SubsystemName enum. If you ask for a rocket thruster,
 * the factory will not give you one...too bad for you!
 * 
 * <p>Here is an example of how to access a subsystem: 
 * <i>Drive drive = SubsystemFactory.getSubsystemFactory().getDrive();</i></p>
 * 
 * 
 * <p><font size="4pt"><b>Change Log:</b></font></p>
 * 
 * @version <b>version 1:</b> 
 * 			<p>
 * 				1/16/2016 --Derek Witcpalek --> original class
 * 			</p>
 * 
 * 
 * @version <b>version 2:</b> 
 * 			<p>
 * 				1/17/2016 --Derek Witcpalek --> added methods to get each specific
 * 					   subsystem, changed <i>getSubsystem</i> method to private, changed 
 * 					   SubsystemName enum to private
 * 			</p>
 * 
 * 
 * 
 * 
 * @author Derek Witcpalek
 */
public class SubsystemFactory {
	
	
	//Subsystems
	private Subsystem m_drive; //Drive
	private Subsystem m_shooter; //Shooter
	private Subsystem m_hanger; //Hanger
	private Subsystem m_intake; //Intake
	private Subsystem m_portcullisArm; //portcullis
	private Subsystem m_sallyPortArm; //sally port
	private Subsystem m_drawbridgeArm; //drawbridge
	private Subsystem m_tiltyBridgeDestacoClamp; //tilty bridge
	
	//Factory
	private static SubsystemFactory m_factory = null;
	
	//Enum constants for different subsystem names
	private enum SubsystemName {
		DRIVE_SYSTEM,
		SHOOTER_SYSTEM,
		HANGER_SYSTEM,
		INTAKE_SYSTEM,
		PORTCULLIS_ARM_SYSTEM,
		SALLY_PORT_ARM_SYSTEM,
		DRAWBRIDGE_ARM_SYSTEM,
		TILTY_BRIDGE_DESTACO_CLAMP_SYSTEM
	}
	
	
	
	/**
	 * Creator-->can not be called by you!!!
	 */
	private SubsystemFactory() 
	{
		m_drive = null;
		m_shooter = null;
		m_hanger = null;
		m_intake = null;
		m_portcullisArm = null;
		m_sallyPortArm = null;
		m_drawbridgeArm = null;
		m_tiltyBridgeDestacoClamp = null;
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
		if(m_factory == null) 
		{
			m_factory = new SubsystemFactory();
		}
		
		return m_factory;
	}
	
	
	
	/**
	 * This method is used to get the subsystem that you need to run
	 * commands on.
	 * 
	 * 
	 * @param name 	the enum name for the subsystem that you want to use
	 * @return 		an object of the type of subsystem you requested
	 */
	private Subsystem getSubsystem(SubsystemName name)
	{
		
		Subsystem current = null;
		
		//Which subsystem does the user want to use?
		switch(name) 
		{
		
		case DRIVE_SYSTEM:
			if(m_drive == null) 
			{
				m_drive = new Drive();
			}
			current = m_drive;
			
			break;
			
		case SHOOTER_SYSTEM:
			if(m_shooter == null) 
			{
				m_shooter = new Shooter();
			}
			current = m_shooter;
			
			break;
			
		case HANGER_SYSTEM:
			if(m_hanger == null) 
			{
				m_hanger = new Hanger();
			}
			current = m_hanger;
			
			break;
			
		case INTAKE_SYSTEM:
			if(m_intake == null)
			{
				m_intake = new Intake();
			}
			current = m_intake;
			
			break;
			
		case PORTCULLIS_ARM_SYSTEM:
			if(m_portcullisArm == null)
			{
				m_portcullisArm = new PortcullisArm();
			}
			current = m_portcullisArm;
			
			break;
			
		case SALLY_PORT_ARM_SYSTEM:
			if(m_sallyPortArm == null)
			{
				m_sallyPortArm = new SallyPortArm();
			}
			current = m_sallyPortArm;
			
			break;
			
		case DRAWBRIDGE_ARM_SYSTEM:
			if(m_drawbridgeArm == null)
			{
				m_drawbridgeArm = new DrawbridgeArm();
			}
			current = m_drawbridgeArm;
			
			break;
			
		case TILTY_BRIDGE_DESTACO_CLAMP_SYSTEM:
			if(m_tiltyBridgeDestacoClamp == null)
			{
				m_tiltyBridgeDestacoClamp = new TiltyBridgeDestacoClamp();
			}
			
			current = m_tiltyBridgeDestacoClamp;
			
			break;
			
		default:
			break;
		}
		
		return current;		
	}

	
	
	
	
	/*==============================================================================*/
	//THE FOLLOWING METHODS ARE USED BY OUTSIDE CLASSES TO GAIN ACCESS TO SUBSYSTEMS//
	/*==============================================================================*/
	
	
	
	/**
	 * Call this method to get the drive subsystem object
	 * 
	 * @return	Drive	The robot drive system object
	 */
	public Drive getDrive()
	{
		return (Drive) getSubsystem(SubsystemName.DRIVE_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the shooter subsystem object
	 * 
	 * @return	Shooter	The robot's shooter object
	 */
	public Shooter getShooter()
	{
		return (Shooter) getSubsystem(SubsystemName.SHOOTER_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the hanger subsystem object
	 * 
	 * @return	Hanger	The robot's hanger object
	 */
	public Hanger getHanger()
	{
		return (Hanger) getSubsystem(SubsystemName.HANGER_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the intake subsystem object
	 * 
	 * @return	Intake	The robot's intake object
	 */
	public Intake getIntake()
	{
		return (Intake) getSubsystem(SubsystemName.INTAKE_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the portcullis arm object
	 * 
	 * @return	PortcullisArm	The robot's portcullis arm object
	 */
	public PortcullisArm getPortcullisArm()
	{
		return (PortcullisArm) getSubsystem(SubsystemName.PORTCULLIS_ARM_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the sally port arm object
	 * 
	 * @return	SallyPortArm	The robot's sally port arm object
	 */
	public SallyPortArm getSallyPortArm()
	{
		return (SallyPortArm) getSubsystem(SubsystemName.SALLY_PORT_ARM_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the drawbridge arm object
	 * 
	 * @return	DrawbridgeArm	The robot's drawbridge arm object
	 */
	public DrawbridgeArm getDrawbridgeArm()
	{
		return (DrawbridgeArm) getSubsystem(SubsystemName.DRAWBRIDGE_ARM_SYSTEM);
	}
	
	
	/**
	 * Call this method to get the tilty bridge destaco clamp object
	 * 
	 * @return	TiltyBridgeDestacoClamp	The robot's tilty bridge destaco clamp object
	 */
	public TiltyBridgeDestacoClamp getTiltyBridgeDestacoClamp()
	{
		return (TiltyBridgeDestacoClamp) getSubsystem(SubsystemName.TILTY_BRIDGE_DESTACO_CLAMP_SYSTEM);
	}
	
}
