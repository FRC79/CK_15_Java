/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.commands.teleop;

import edu.wpi.first.wpilibj.command.CommandGroup;
import krunch15.subsystems.compressor.StartCompressor;

/**
 *
 * @author toaster
 */
public class Teleop extends CommandGroup {
    
    public Teleop() {
        addSequential(new StartCompressor());
        addParallel(new ArcadeDrive());
        addParallel(new ManipulateIntake());
        addParallel(new ManipulateFiring());
    }
    
}
