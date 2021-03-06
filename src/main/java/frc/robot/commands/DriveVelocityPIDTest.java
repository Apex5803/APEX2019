package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command to test velocity on drive train, output RPM.
 */

	public class DriveVelocityPIDTest extends Command {

	    public DriveVelocityPIDTest() {
	        // Use requires() here to declare subsystem dependencies
	        requires(Robot.driveTrain);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	Robot.driveTrain.velocityPIDTest();
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return false;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
	
}