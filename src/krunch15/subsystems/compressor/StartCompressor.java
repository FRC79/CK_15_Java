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
public class StartCompressor extends CommandBase {
    
    public StartCompressor() {
        requires(compressor);
    }

    protected void initialize() {
        compressor.startCompressor();
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
