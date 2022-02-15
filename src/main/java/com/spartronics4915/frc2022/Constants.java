package com.spartronics4915.frc2022;

import com.spartronics4915.lib.hardware.motors.SensorModel;
import com.spartronics4915.lib.hardware.motors.SpartronicsMax;
import com.spartronics4915.lib.hardware.motors.SpartronicsMotor;
import com.spartronics4915.lib.util.TriFunction;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static).
 * Do not put anything functional in this class.
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants
{
    public static final int kTestMotorId = 1;
    public static final class Drive { // TODO: some is a stand in value
        // hardware IDs
        public static final int kPigeonID = 10;
        public static final int kLeftMotorID = 3;
        public static final int kRightMotorID = 1;
        public static final int kLeftFollowerMotorID = 4;
        public static final int kRightFollowerMotorID = 2;

        // sensor models
        public static final double kWheelDiameter = 0.1524; // in meters
        public static final double kNativeUnitsPerRevolution = 1;

        // constructors
        public static final TriFunction<Integer, SensorModel, Integer, SpartronicsMotor> kMotorConstructor = SpartronicsMax::makeMotor;

        // output inversion
        public static final boolean kLeftOutputInverted = false;
        public static final boolean kRightOutputInverted = true;
        public static final boolean kLeftFollowerOutputInverted = false;
        public static final boolean kRightFollowerOutputInverted = true;

        // PID
        public static final double kP = 1;
        public static final double kD = 0;

        // current limits
        public static final int kMaxStatorCurrent = 30; // poof alakazam

        // controls
        public static final double kSlowModeMultiplier = 0.1;
        public static final double kLinearResponseCurveExponent = 5.0 / 3.0;
        public static final double kJoystickDeadzoneSize = 0.1;
    }
    public static class ExampleSubsystem {
        public static final int kFlywheelMasterId = 2;
        public static final double kHighRPS = 90.0;
        public static final double kLowRPS = 40.0;
    }
    public static class Conveyor {
        public static final int kSparkMaxId = 1;
        public static final int kTopBeamBreakerId = -1;
        public static final int kBottomBeamBreakerId = -1;
        public static final double kP = 1;
        public static final double kD = 1;
    }
    public static class Launcher {
        public static final int kFlywheelMotorId = 1;
        public static final double kFlywheelRPS = 5;
        
        public static class Flywheel {
            public static final double kP = 0.03;
            public static final double kS = 0.0286; // 0.0654;
            public static final double kV = 7.86; // 7.18;
            public static final double kA = 5.16;
        }
        public static final int kSpinMotorId = 3;
        public static final double kSpinMotorSpeed = 0.1;
        // public static class Spin {
        //     public static final double kP = 0.03;
        //     public static final double kS = 0.0286; // 0.0654;
        //     public static final double kV = 7.86; // 7.18;
        //     public static final double kA = 5.16;
        // }
    }
    public static final class Climber
    {
        public static final int kClimberMotorId = 1; // we dk
        public static final double kClimberMotorSpeed = 1.0;
    }

    public static final class OIConstants {
        public static final int kArcadeStickPort = 1;
        
      public static final int kStartConveyorButton = 2;
        public static final int kStopConveyorButton = 3;
        
        public static final int kStartFlywheelButton = 4;
        public static final int kStopFlywheelButton = 5;
        public static final int kStartSpinButton = 6;
        public static final int kStopSpinButton = 7;

        public static final int kJoystickPort = 0;
    }

}