package org.usfirst.frc.team1700.robot.commands;

import org.usfirst.frc.team1700.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1700.robot.RobotMap;

/**
 *
 */
public class AutonomousShootHighGoalCommand extends Command {

    public AutonomousShootHighGoalCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Subsystems.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Subsystems.shooter.setHoodPosition(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Subsystems.shooter.shootClose();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Subsystems.shooter.setSpeedToZero();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
