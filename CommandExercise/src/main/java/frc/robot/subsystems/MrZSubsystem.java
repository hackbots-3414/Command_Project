/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MrZSubsystem extends SubsystemBase {
  
  /**
   * Creates a new MrZSubsystem.
   */
  public MrZSubsystem() {

  }

  public void runLoop() {
    for (int i = 0; i < 10; i ++) {
      System.out.println(this.getClass().getName() + ".runLoop(): i = " + i);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
