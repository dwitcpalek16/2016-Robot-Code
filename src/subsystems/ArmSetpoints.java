package subsystems;

/**
 * This is a class used to get the angles and height and extension of the arm at
 * various different setpoint positions
 * 
 * 
 * 
 * <h1>Change Log:</h1>
 * 
 * @version <b>version 1:</b>
 *          <p>
 *          1/29/2016 --Derek Witcpalek --> Original creation of the setpoints;
 *          they still need to be set
 *          </p>
 * 
 * 
 * @author Derek
 *
 */
public class ArmSetpoints
{

	// Arm setpoints are in the format: {height, extension, first joint angle, second joint angle}

	private static final double[] CHEVAL_DE_FRISE_DOWN_AND_DRAWBRIDGE_END_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] PORTCULLIS_START_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] CHEVAL_DE_FRISE_START_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] SALLY_PORT_END_HOOK_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] DRAWBRIDGE_HOOK_SALLY_PORT_START_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] DRAWBRIDGE_START_PORTCULLIS_END_CLIMB_END_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] EXTENDED_TO_PREPARE_TO_CLIMB_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] CLIMB_HOOK_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] CLIMB_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };
	private static final double[] STARTING_POSITION_SETPOINT = { 0.0, 0.0, 0.0, 0.0 };

	public static enum ArmState
	{
		CHEVAL_DE_FRISE_DOWN_AND_DRAWBRIDGE_END, 
		PORTCULLIS_START, 
		CHEVAL_DE_FRISE_START, 
		SALLY_PORT_END_HOOK, 
		DRAWBRIDGE_HOOK_SALLY_PORT_START, 
		DRAWBRIDGE_START_PORTCULLIS_END_CLIMB_END, 
		EXTENDED_TO_PREPARE_TO_CLIMB, 
		CLIMB_HOOK, 
		CLIMB, 
		STARTING_POSITION
	}

	/**
	 * Call this method to get the description of a position
	 * 
	 * @param state
	 *            this is the state you want to get the position of
	 * 
	 * @return returns a position descriptor array in the form: {height,
	 *         extension, first joint angle, second joint angle}
	 */
	public static double[] getPosition(ArmState state)
	{
		double[] value = null;
		switch (state)
		{
		case CHEVAL_DE_FRISE_DOWN_AND_DRAWBRIDGE_END:
			value = CHEVAL_DE_FRISE_DOWN_AND_DRAWBRIDGE_END_SETPOINT;
			break;
		case PORTCULLIS_START:
			value = PORTCULLIS_START_SETPOINT;
			break;
		case CHEVAL_DE_FRISE_START:
			value = CHEVAL_DE_FRISE_START_SETPOINT;
			break;
		case SALLY_PORT_END_HOOK:
			value = SALLY_PORT_END_HOOK_SETPOINT;
			break;
		case DRAWBRIDGE_HOOK_SALLY_PORT_START:
			value = DRAWBRIDGE_HOOK_SALLY_PORT_START_SETPOINT;
			break;
		case DRAWBRIDGE_START_PORTCULLIS_END_CLIMB_END:
			value = DRAWBRIDGE_START_PORTCULLIS_END_CLIMB_END_SETPOINT;
			break;
		case EXTENDED_TO_PREPARE_TO_CLIMB:
			value = EXTENDED_TO_PREPARE_TO_CLIMB_SETPOINT;
			break;
		case CLIMB_HOOK:
			value = CLIMB_HOOK_SETPOINT;
			break;
		case CLIMB:
			value = CLIMB_SETPOINT;
			break;
		case STARTING_POSITION:
			value = STARTING_POSITION_SETPOINT;
			break;
		default:
			value = null;
			break;
		}

		return value;
	}
}
