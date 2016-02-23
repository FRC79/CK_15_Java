
package krunch15;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import krunch15.commands.teleop.Teleop;
import krunch15.subsystems.compressor.StopCompressor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class CK_15 extends IterativeRobot {

    Command teleop, stopCompressor;

    public void robotInit() {
        
        // initialize OI befor the creation of subsystems
        OI.init();
        CommandBase.init();
        
        // instantiate commands
        teleop = new Teleop();
        stopCompressor = new StopCompressor();
        stopCompressor.setRunWhenDisabled(true);
        
        System.out.println("--------------------------------------");
        System.out.println("  robotInit() COMPLETE ");
        System.out.println("--------------------------------------");
        
    }

    public void autonomousInit() {
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    public void teleopInit() {
        new Teleop().start();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    
    public void disabledInit() {
        Scheduler.getInstance().removeAll(); // Stop all commands
    }

    public void testInit() {

    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
