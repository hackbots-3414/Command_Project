/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sravani2 extends SubsystemBase {
  /**
   * Creates a new Sravani2.
   */

  public void runLoop(){
    for(int i = 0;i<=10;i++){
      System.out.println("This is the value of i: " + i);
    }
  }

  public Sravani2() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
