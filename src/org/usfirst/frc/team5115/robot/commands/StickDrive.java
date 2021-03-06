
package org.usfirst.frc.team5115.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5115.robot.Robot;

/**
 *
 */
public class StickDrive extends Command {

    public StickDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.chassis.leftSpeed += Math.signum(Robot.oi.leftSpeed() - Robot.chassis.leftSpeed) * 0.03;
    	Robot.chassis.rightSpeed += Math.signum(Robot.oi.rightSpeed() - Robot.chassis.rightSpeed) * 0.03;
    	if(Robot.oi.leftSpeed() == 0 && Robot.oi.rightSpeed() == 0) {
    		Robot.chassis.leftSpeed = 0;
    		Robot.chassis.rightSpeed = 0;
    	}
    	
    	Robot.chassis.drive();
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
