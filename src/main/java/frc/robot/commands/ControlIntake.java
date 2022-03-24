// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class ControlIntake extends Command {
  
  //Adam code start 
  static boolean pressed = false;
  //Adam code end

  public ControlIntake() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.intake);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.oi.getBButton())
    Robot.intake.setIntake(-RobotMap.baseIntakeSpeed);
    else
    Robot.intake.setIntake(0);

    //Adam's code (hello Declan)
    //Yes, it's stupid, but the if statements have to be in this order to work
    // if (!(Robot.oi.getYButton()) && !(Robot.oi.getAButton())) {
    //   pressed = false;
    // } else if (Robot.oi.getYButton() && !pressed) {
    //   pressed = true;
    //   if (RobotMap.baseIntakeSpeed < 1)
    //     RobotMap.baseIntakeSpeed += 0.05;
    //   System.out.println("Intake speed: " + Math.round(100*RobotMap.baseIntakeSpeed) + "%");
    // } else if (Robot.oi.getAButton() && !pressed) {
    //   pressed = true;
    //   if (RobotMap.baseIntakeSpeed > 0.01)
    //     RobotMap.baseIntakeSpeed -= 0.05;
    //   System.out.println("Intake speed: " + Math.round(100*RobotMap.baseIntakeSpeed) + "%");
    // }
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {}

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {}
}
