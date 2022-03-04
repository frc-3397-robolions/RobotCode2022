// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.PWMVictorSPX;

/** Add your docs here. */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
private PWMVictorSPX frontLeftController;
private PWMVictorSPX frontRightController;
private PWMVictorSPX rearLeftController;
private PWMVictorSPX rearRightController;

  public DriveTrain(){
    frontLeftController = new PWMVictorSPX(RobotMap.frontLeftChannel);
  addChild("Front Left Motor Controller",frontLeftController);
  frontLeftController.setInverted(false);

  rearLeftController = new PWMVictorSPX(RobotMap.rearLeftChannel);
  addChild("Rear Left Motor Controller",rearLeftController);
  rearLeftController.setInverted(false);

  frontRightController = new PWMVictorSPX(RobotMap.frontRightChannel);
  addChild("Front Right Motor Controller",frontRightController);
  frontRightController.setInverted(false);

  rearRightController = new PWMVictorSPX(RobotMap.rearRightChannel);
  addChild("Rear Right Motor Controller",rearRightController);
  rearRightController.setInverted(false);
  }

  public void setLeftMotors(double speed){
    frontLeftController.set(speed*RobotMap.baseDriveSpeed);
    rearLeftController.set(speed*RobotMap.baseDriveSpeed);
  }

  public void setRightMotors(double speed){
    frontRightController.set(-speed*RobotMap.baseDriveSpeed);
    rearRightController.set(-speed*RobotMap.baseDriveSpeed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDrive());
  }
}
