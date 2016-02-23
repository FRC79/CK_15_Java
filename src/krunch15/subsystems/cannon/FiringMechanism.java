/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.subsystems.cannon;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import krunch15.RobotMap;

/**
 *
 * @author toaster
 */
public class FiringMechanism extends Subsystem {
    
    CANJaguar shooterLeft, shooterRight;
    
    public FiringMechanism() {
        try {
            shooterLeft = new CANJaguar(RobotMap.SHOOTER_LEFT);
            shooterRight = new CANJaguar(RobotMap.SHOOTER_RIGHT);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void fireMotors() {
        shooterLeft.set(1.0);
        shooterRight.set(1.0);
    }
    
    public void stopMotors() {
        shooterLeft.set(0);
        shooterRight.set(0);
    }

    protected void initDefaultCommand() {

    }
    
}
