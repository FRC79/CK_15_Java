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

    CANJaguar collector, lowerRollers, upperRollers;
    DigitalInput lowerSwitch, upperSwitch;
    
    public Intake(){
        collector = RobotMap.collectorMotor;
        lowerRollers = RobotMap.lowerConveyerMotor;
        upperRollers = RobotMap.upperConveyerMotor;
        lowerSwitch = RobotMap.lowerIntakeSwitch;
        upperSwitch = RobotMap.upperIntakeSwitch;
    }

    public void setCollector(double power){
        try {
            collector.setX(-power);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setLowerRollers(double power){
        try {
            lowerRollers.setX(power);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setUpperRollers(double power){
        try {
            upperRollers.setX(power);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
    public void stopCollector(){
        setCollector(0.0);
    }
    
    public void stopLowerRollers(){
        setLowerRollers(0.0);
    }
    
    public void stopUpperRollers(){
        setUpperRollers(0.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
