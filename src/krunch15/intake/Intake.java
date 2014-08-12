/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krunch15.intake;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import krunch15.RobotMap;

/**
 *
 * @author Sebastian
 */
public class Intake extends Subsystem {

    int ballCount, prevBallCount;
    boolean isReversed, prevUpperState, prevLowerState;
    
    CANJaguar lowerRollers, upperRollers;
    DigitalInput lowerSwitch, upperSwitch;
    
    public Intake(){
        lowerRollers = RobotMap.lowerIntakeMotor;
        upperRollers = RobotMap.upperIntakeMotor;
        lowerSwitch = RobotMap.lowerIntakeSwitch;
        upperSwitch = RobotMap.upperIntakeSwitch;
    }
    
    public void init(){
        ballCount = prevBallCount = 0;
        isReversed = false;
        prevUpperState = prevLowerState = false;
    }
    
    public void enableLowerRollers(){
        try {
            isReversed = false;
            lowerRollers.setX(1.0);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void enableUpperRollers(){
        try {
            isReversed = false;
            upperRollers.setX(1.0);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void enableRollers(){
        enableLowerRollers();
        enableUpperRollers();
    }
    
    public void disableLowerRollers(){
        try {
            isReversed = false;
            lowerRollers.setX(0.0);
        } catch (CANTimeoutException ex){
            ex.printStackTrace();
        }
    }
    
    public void disableUpperRollers(){
        try {
            isReversed = false;
            upperRollers.setX(0.0);
        } catch (CANTimeoutException ex){
            ex.printStackTrace();
        }
    }
    
    public void disableRollers(){
        disableLowerRollers();
        disableUpperRollers();
    }
    
    public void grabBall(){
        // If we don't have ball turn on the rollers
        if(upperSwitch.get()){
            enableRollers();
        } else {
            disableUpperRollers();
            enableLowerRollers();
        }
    }
    
    public void processBallStates(){
        if(!isReversed){
            if(upperSwitch.get() != prevUpperState){
                if(prevUpperState == true){
                    ballCount--;
                } else {
                    ballCount++;
                }
            }
            
            if(lowerSwitch.get() != prevLowerState){
                if(prevLowerState == false){
                    ballCount++;
                }
            }
        } else {
            if(upperSwitch.get() != prevUpperState){
                if(prevUpperState == true){
                    ballCount++;
                } else {
                    ballCount--;
                }
            }
            
            if(lowerSwitch.get() != prevLowerState){
                if(prevLowerState == false){
                    ballCount--;
                }
            }
        }
        
        prevLowerState = lowerSwitch.get();
        prevUpperState = upperSwitch.get();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
