
package org.usfirst.frc.team302.robot;

import Subsystems.SubsystemConstants;
import Subsystems.SubsystemFactory;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
    public void robotInit() 
    {
        //create subsystems (don't need if subsystem factory exists)
    		//call each subsystem to create it
    	
    	//init Operator interface
    		//includes dashboard and controllers
    }
    
    
    
    
    public void autonomousInit() 
    {
    	//initialize subsystems
    		//reset encoders...other sensors
    	
    	//read dashboard's auton settings
    	
    }

    
    
    public void autonomousPeriodic() 
    {
    	//run auton
    		//call subsystem commands
    }

    
    
    
    
    public void teleopInit() 
    {
    	//initialize subsystems
			//reset encoders...other sensors
    	
    	//?read drive mode selection?
    	
    	//?read button commands (if changed)?
    }
    
    public void teleopPeriodic() 
    {
        //get commands from operator interface
    	
    	//send commands to subsystems
    	
    	//update dashboard (if there is data to show)
    		//camera feed?
    }
    
    
    
    
    
    
    public void testInit() 
    {
    	//teleopInit();
    }
    
    public void testPeriodic() 
    {
    	//teleopPeriodic();
    }
    
}
