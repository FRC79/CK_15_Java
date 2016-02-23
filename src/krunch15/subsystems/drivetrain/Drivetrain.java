/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.subsystems.drivetrain;

import krunch15.RobotMap;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author sebastian
 */
public class Drivetrain extends Subsystem {

    public static final int TICS_PER_REV = 250;
    
    private boolean shiftState;
    
    CANJaguar leftF, rightF, leftR, rightR;
    RobotDrive robotDrive;
    DoubleSolenoid shifter;
    
    public Drivetrain(){
        
        try {
            leftF = new CANJaguar(RobotMap.LEFT_FRONT_MOTOR);
            rightF = new CANJaguar(RobotMap.RIGHT_FRONT_MOTOR);
            leftR = new CANJaguar(RobotMap.LEFT_REAR_MOTOR);
            rightR = new CANJaguar(RobotMap.REAR_RIGHT_MOTOR );
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        
        // Init RobotDrive
        robotDrive = new RobotDrive(leftF, leftR, rightF, rightR);
        
        // Init shifter
        shifter = new DoubleSolenoid(RobotMap.SONIC_SHIFTER_HIGH, RobotMap.SONIC_SHIFTER_LOW);
        
    }
    
    public void arcadeDrive(double moveVal, double rotVal){
        robotDrive.arcadeDrive(moveVal, rotVal);
    }

    public void shift(int setting) {
        
        switch(setting) {
            case 1:
                shifter.set(DoubleSolenoid.Value.kForward);
            case 2:
                shifter.set(DoubleSolenoid.Value.kReverse);
        }
            
    }
    
    public void initDefaultCommand() {

    }

}
