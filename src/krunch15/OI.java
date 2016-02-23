
package krunch15;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public static Joystick driverJoystick, shooterGamepad;
    public static JoystickButton shiftButton, lowerRoller, upperRoller, reverseRoller, fire;
    
    public static void init() {
        
//        private static final int BUTTON_A = 2;
//        private static final int BUTTON_B = 3;
//        private static final int BUTTON_X = 1;
//        private static final int BUTTON_Y = 4;
//        private static final int BUTTON_SHOULDER_LEFT = 5;
//        private static final int BUTTON_SHOULDER_RIGHT = 6;
//        private static final int BUTTON_TRIGGER_LEFT = 7;
//        private static final int BUTTON_TRIGGER_RIGHT = 8;
//        private static final int BUTTON_BACK = 9;
//        private static final int BUTTON_START = 10;
//        private static final int BUTTON_LEFT_STICK = 11;
//        private static final int BUTTON_RIGHT_STICK = 12;
        
        // Init Joystick and Gamepad
        driverJoystick = new Joystick(1);
        shooterGamepad = new Joystick(2);
        
        // Init joystick buttons
        shiftButton = new JoystickButton(shooterGamepad, 5); // SHIFT ON LEFT SHOULDER
        
        lowerRoller = new JoystickButton(shooterGamepad, 1); // BUTTON X
        upperRoller = new JoystickButton(shooterGamepad, 4); // BUTTON Y
        reverseRoller = new JoystickButton(shooterGamepad, 2); // BUTTON A
        fire = new JoystickButton(shooterGamepad, 3); // BUTTON B
        
    }
    
    public static double getX() {
        return driverJoystick.getX();
    }
    
    public static double getY() {
        return driverJoystick.getY();
    }
    
}

