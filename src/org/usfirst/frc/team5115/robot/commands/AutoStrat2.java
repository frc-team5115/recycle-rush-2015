package org.usfirst.frc.team5115.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoStrat2 extends CommandGroup {
    
    public  AutoStrat2() {
    	
    	//addSequential(new AutoDriveToTote());
    	//addSequential(new AutoLift(14));
    	addSequential(new AutoDrive(22));
    	//addSequential(new AutoDrop(0));
    	addSequential(new AutoDrive(-3));
    	//addSequential(new AutoDrop(-14));
    	//addSequential(new AutoDriveToTote());
    	//addSequential(new AutoLift(4));
    	addSequential(new AutoTurn(90));
    	addSequential(new AutoDrive(120));
    	addSequential(new AutoTurn(-90));	// if on left side, -90; if on right side, 90
    	addSequential(new AutoDrive(72));
    	//addSequential(new AutoDrop(-3));
    	addSequential(new AutoDrive(-36));
    	addSequential(new AutoTurn(90));    //if on left, 90; if on right, -90
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
