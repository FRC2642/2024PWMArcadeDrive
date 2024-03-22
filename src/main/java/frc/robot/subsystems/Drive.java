// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  DifferentialDrive diffDrive;
  public Drive() {
    PWMSparkMax left1 = new PWMSparkMax(0);
    PWMSparkMax left2 = new PWMSparkMax(1);

    left1.addFollower(left2);
    PWMSparkMax right1 = new PWMSparkMax(2);
    PWMSparkMax right2 = new PWMSparkMax(3);

    right1.addFollower(right2);
    //MotorControllerGroup right = new MotorControllerGroup(right1, right2);

    diffDrive = new DifferentialDrive(left1, right1);

    //If you find that one side of motors is going in the wrong direction, you can uncomment one or both of the lines below to invert your motors

    // left1.setInverted(true);
    // right1.setInverted(true);
  }

  public void drive(double speed, double rotation) {
    diffDrive.arcadeDrive(speed, rotation);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
