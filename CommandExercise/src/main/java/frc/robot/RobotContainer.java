/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.GrantsCommand;
import frc.robot.commands.LucasCommand;
import frc.robot.commands.MrZRunLoopCommand;
import frc.robot.commands.SanjanaCommand;
import frc.robot.commands.SravaniCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.GrantsSubsystem;
import frc.robot.subsystems.LucasSubsystem;
import frc.robot.subsystems.MrZSubsystem;
import frc.robot.subsystems.SanjanaSubsystem;
import frc.robot.subsystems.SravaniSubsystem;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final SravaniSubsystem m_sravaniSubsystem = new SravaniSubsystem();
  private final SravaniCommand m_sravaniCommand = new SravaniCommand(m_sravaniSubsystem);
  private final GrantsSubsystem m_grantsSubsystem = new GrantsSubsystem();
  private final GrantsCommand m_grantsCommand = new GrantsCommand(m_grantsSubsystem);

  // Mr. Z's example
  private final MrZSubsystem mrZSubsystem = new MrZSubsystem();
  private final XboxController joystick = new XboxController(0);

  private final SanjanaSubsystem m_sanjana = new SanjanaSubsystem();
  private final SanjanaCommand m_sanjanaCommand = new SanjanaCommand(m_sanjana);

  private final SanjanaClass2 m_sanjanacommand2 = new SanjanaClass2();
  private final LucasSubsystem m_lucasSubsystem = new LucasSubsystem();
  private final LucasCommand m_lucasCommand = new LucasCommand(m_lucasSubsystem);



  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    //CommandScheduler.getInstance().setDefaultCommand(m_sravaniSubsystem, m_sravaniCommand);

 

    CommandScheduler.getInstance().setDefaultCommand(m_sanjana, m_sanjanaCommand);


    CommandScheduler.getInstance().setDefaultCommand(m_sravaniSubsystem, m_sravaniCommand);
    

    CommandScheduler.getInstance().setDefaultCommand(m_grantsSubsystem, m_grantsCommand);


    CommandScheduler.getInstance().setDefaultCommand(m_lucasSubsystem, m_lucasCommand);


   


  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton mrZButton = new JoystickButton(joystick, 6);
    mrZButton.whenPressed(new MrZRunLoopCommand(mrZSubsystem));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_sanjanacommand2;
  }
}
