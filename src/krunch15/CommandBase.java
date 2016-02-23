package krunch15;

import edu.wpi.first.wpilibj.command.Command;
import krunch15.subsystems.cannon.FiringMechanism;
import krunch15.subsystems.drivetrain.Drivetrain;
import krunch15.subsystems.compressor.CompressorMechanism;
import krunch15.subsystems.intake.IntakeMechanism;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    
    // Create a single static instance of all of your subsystems
    public static Drivetrain drive;
    public static CompressorMechanism compressor;
    public static IntakeMechanism intake;
    public static FiringMechanism fire;
    
    public static void init() {

        drive = new Drivetrain();
        compressor = new CompressorMechanism();
        intake = new IntakeMechanism();
        fire = new FiringMechanism();
        
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
