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
public class ManipulateIntake extends CommandBase {
    
    public ManipulateIntake() {
        requires(intake);
    }
    
    protected void initialize() {

    }

    protected void execute() {
        
        if(!OI.reverseRoller.get()) {
            if(OI.lowerRoller.get()) {
                intake.enableLowerRollers();
            } else {
                intake.disableLowerRollers();
            }

            if(OI.upperRoller.get()) {
                intake.enableUpperRollers();
            } else {
                intake.disableUpperRollers();
            }   
        } else {
            intake.reverseRollers();
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
