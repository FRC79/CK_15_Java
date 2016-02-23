package krunch15;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
// 
//    public static CANJaguar leftFrontMotor, rightFrontMotor, leftRearMotor, rightRearMotor, 
//            shooterLeft, shooterRight, lowerConveyor;
//    public static Victor upperConveyor;
//    public static RobotDrive robotDrive;
//    public static Compressor compressor;
//    public static DoubleSolenoid sonicShifter;
//    
//    public static void init(){
//        loadComponents(true); // Used to init CSVs and all components
//    }
//    
//    public static void reload(){
//        loadComponents(false); // Reload CSV values without reiniting CSVReaders.
//    }
//    
//    private static void loadComponents(boolean initCSVs)
//    {
//        // Init Drive Wheels
//        try {
//            leftFrontMotor = new CANJaguar(5);
//            leftRearMotor = new CANJaguar(4);
//            rightFrontMotor = new CANJaguar(2);
//            rightRearMotor = new CANJaguar(3);
//            shooterLeft = new CANJaguar(6);
//            shooterRight = new CANJaguar(7);
//            lowerConveyor = new CANJaguar(10);
//            upperConveyor = new Victor(5);
//        } catch (CANTimeoutException ex) {
//            ex.printStackTrace();
//        }
//        
//        // Init Compressor (pressureSwitchChannel,compressorRelayChannel)
//        compressor = new Compressor(1,8);
//
//        // Init Solenoids
//        sonicShifter = new DoubleSolenoid(8,7);     // (forward ch., reverse ch.)
//        
//    }
    
    public static int LEFT_FRONT_MOTOR = 5;
    public static int RIGHT_FRONT_MOTOR = 2;
    public static int LEFT_REAR_MOTOR = 4;
    public static int REAR_RIGHT_MOTOR = 3;
    
    public static int SHOOTER_LEFT = 6;
    public static int SHOOTER_RIGHT = 7;
    
    public static int LOWER_CONVEYOR = 2;
    public static int UPPER_CONVEYOR = 5;
    
    public static int SONIC_SHIFTER_LOW = 7;
    public static int SONIC_SHIFTER_HIGH = 8;
    
    public static int COMPRESSOR_SWITCH = 1;
    public static int COMPRESSOR_SPIKE = 8;
    
}
