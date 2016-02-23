/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.subsystems.compressor;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import krunch15.RobotMap;

/**
 *
 * @author toaster
 */
public class CompressorMechanism extends Subsystem {
    
    Compressor compressor;
    
    public CompressorMechanism() {
        compressor = new Compressor(RobotMap.COMPRESSOR_SWITCH, RobotMap.COMPRESSOR_SPIKE);
    }
    
    public void startCompressor() {
        compressor.start();
    }
    
    public void stopCompressor() {
        compressor.stop();
    }

    protected void initDefaultCommand() {
        
    }
    
}
