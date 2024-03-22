// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;

public final class Autos {
  //private Drive drive = new Drive();
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(Drive drive) {
    //return Commands.sequence(subsystem.exampleMethodCommand(), new ExampleCommand(subsystem));

    //Hello! This is a basic autonomous command to drive backward at 0.5 speed for 1 second and then stop. You might need to
    //change the speed of the robot or the amount of time it runs but this should run in autonomous.
    return new RunCommand(() -> drive.drive(-0.35, 0), drive).withTimeout(1.5).andThen(new RunCommand(() -> drive.drive(0, 0), drive));
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
