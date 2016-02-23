/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.subsystems.compressor;

import krunch15.CommandBase;

/**
 *
 * @author toaster
 */
public class StopCompressor extends CommandBase {
        
    public StopCompressor() {
        requires(compressor);
    }

    protected void initialize() {
        compressor.stopCompressor();
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {

    }

    protected void interrupted() {

    }
    
}
