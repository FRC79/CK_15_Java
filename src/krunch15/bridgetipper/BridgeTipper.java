/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.bridgetipper;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import krunch15.RobotMap;

/**
 *
 * @author Sebastian
 */
public class BridgeTipper extends Subsystem {

    DoubleSolenoid pistons;
    
    public BridgeTipper(){
        pistons = RobotMap.bridgeTipperPistons;
    }
    
    public void set(boolean state){
        pistons.set((state) ? DoubleSolenoid.Value.kForward : DoubleSolenoid.Value.kReverse);
    }
    
    public boolean getState(){
        return (pistons.get() == DoubleSolenoid.Value.kForward);
    }
    
    public void retract(){
        set(false);
    }
    
    public void extend(){
        set(true);
    }
    
    public void setInverted(){
        set(!getState());
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
