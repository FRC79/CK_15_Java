/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.commands.teleop;

import krunch15.CommandBase;
import krunch15.OI;

/**
 *
 * @author toaster
 */
public class ArcadeDrive extends CommandBase {
    
    boolean shifterToggle = true;
    boolean buttonToggle = false;
    
    public ArcadeDrive() {
        requires(drive);
    }

    protected void initialize() {

    }

    protected void execute() {
        
        drive.arcadeDrive(OI.getY(), OI.getX());
        
        // being lazy, so putting the controll for the shifter inside of the drive command object
        if(!buttonToggle && OI.shiftButton.get()) {
            buttonToggle = true;
        } else if(buttonToggle && !OI.shiftButton.get()) {
            buttonToggle = false;
            drive.shift(shifterToggle ? 1 : 2);
            shifterToggle = !shifterToggle;
        }
        
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {

    }

    protected void interrupted() {

    }
    
}
