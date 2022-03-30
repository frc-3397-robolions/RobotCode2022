// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;


  // PWM Channels
	public static final int rearRightChannel = 3;
	public static final int frontRightChannel = 5;
	public static final int rearLeftChannel = 4;
  public static final int frontLeftChannel = 6;
  //#TODO set all channels to real values
  public static final int shooterChannel1 = 0;
  public static final int shooterChannel2 = 1;
  public static final int intakeChannel = 7;
  public static final int climberChannel = 2;
// PWM Channels - end

  public static final int xbControllerPort = 0;
  
  
  public static double baseDriveSpeed = 0.5;
  public static double baseShootSpeed = 0.6;
  public static double baseIntakeSpeed = 0.5;
  public static double baseClimbSpeed = 1;


  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
