// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private final CANSparkMax leftFrontMotor = new CANSparkMax(Constants.LEFT_WHEEL_PORT,MotorType.kBrushless);
  private final CANSparkMax rightFrontMotor = new CANSparkMax(Constants.RIGHT_WHEEL_PORT,MotorType.kBrushless);
  private final DifferentialDrive drivetrain;
  public Drivetrain() {
    rightFrontMotor.setInverted(true);
    drivetrain = new DifferentialDrive(leftFrontMotor,rightFrontMotor);
    drivetrain.setMaxOutput(.25);
  }
//SHEEEEESH//
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void drive(double xSpeed, double zRotation){
      drivetrain.arcadeDrive(xSpeed, zRotation);
  }
}
