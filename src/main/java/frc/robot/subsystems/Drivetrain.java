/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.Robot;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  public Drivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void returnMessage(){
    if (Robot.numberOfChange < 3) {
      System.out.println("from returnMessage: The color has been changed" + Robot.numberOfChange + " times from" + Robot.initialColor);
    }else{
      
    }
        
  }
}
