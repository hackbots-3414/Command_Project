/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MaxSub extends SubsystemBase {
  /**
   * Creates a new MaxSub.
   */

  public void runLoop(){
    for(int i = 0;i<=10;i++){
      System.out.println("This is the value of i; " + i);
      }
    }
    
  public void div(){
    for(float i =0;i<=15;i++){
      System.out.println("This is halt the value of i" + i /2);
    }
  }

  public MaxSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
