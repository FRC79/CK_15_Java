
package krunch15;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import krunch15.drivetrain.ArcadeDrive;
import krunch15.drivetrain.DriveStraight;
import krunch15.drivetrain.ShiftToHighGear;
import krunch15.drivetrain.ShiftToInverted;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class CK_15 extends IterativeRobot {

    Command autonomousCommand, arcadeDriveCommand, initialShiftCommand,
            toggleShiftCommand, collectCommand, reverseCollectorCommand,
            conveyerCommand;

    public void robotInit() {
        // Initialize all subsystems
        RobotMap.init();
        CommandBase.init();
        
        // instantiate commands
//        autonomousCommand = new DriveStraight();
        arcadeDriveCommand = new ArcadeDrive();
        initialShiftCommand = new ShiftToHighGear();
        toggleShiftCommand = new ShiftToInverted();
        
        // Map commands to buttons
        CommandBase.oi.shiftButton.whenPressed(toggleShiftCommand);
        
        CommandBase.oi.collectButton.whileHeld(collectCommand);
        CommandBase.oi.reverseCollectorButton.whileHeld(reverseCollectorCommand);
        
        System.out.println("--------------------------------------");
        System.out.println("  robotInit() COMPLETE ");
        System.out.println("--------------------------------------");
    }

    public void autonomousInit() {
//        RobotMap.compressor.start(); // Start compressor
        initialShiftCommand.start();
//        autonomousCommand.start(); // schedule the autonomous command
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
//        autonomousCommand.cancel(); // Make sure auton is finished
        RobotMap.compressor.start(); // Start compressor
        initialShiftCommand.start(); // Gear shift toggle
        arcadeDriveCommand.start(); // Start teleop arcade drive
        conveyerCommand.start(); // Ball conveyer manipulation
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    
    public void disabledInit() {
        Scheduler.getInstance().removeAll(); // Stop all commands
        RobotMap.compressor.stop(); // Stop compressor
    }

    public void testInit() {
//        RobotMap.compressor.start();  // Start compressor
    }
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
