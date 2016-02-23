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

public class ManipulateFiring extends CommandBase {
        
    public ManipulateFiring() {
        requires(fire);
    }

    protected void initialize() {

    }

    protected void execute() {

        if(OI.fire.get()) {
            fire.fireMotors();
        } else {
            fire.stopMotors();
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
