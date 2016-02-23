/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.subsystems.intake;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import krunch15.RobotMap;

/**
 *
 * @author toaster
 */

public class IntakeMechanism extends Subsystem {
    
    Jaguar lowerConveyor;
    Jaguar upperConveyor;
    
    public IntakeMechanism() {

        lowerConveyor = new Jaguar(RobotMap.LOWER_CONVEYOR);
        upperConveyor = new Jaguar(RobotMap.UPPER_CONVEYOR);
        
    }
    
    public void enableUpperRollers() {
        upperConveyor.set(1.0);
    }
    
    public void disableUpperRollers() {
        upperConveyor.set(0);
    }
    
    public void enableLowerRollers() {
        lowerConveyor.set(1.0);
    }
    
    public void disableLowerRollers() {
        lowerConveyor.set(0);
    }
    
    public void reverseRollers() {
        upperConveyor.set(-1.0);
        lowerConveyor.set(-1.0);
    }
 
    protected void initDefaultCommand() {
        
    }
    
}
