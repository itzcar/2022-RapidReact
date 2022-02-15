package com.spartronics4915.frc2022.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import static com.spartronics4915.frc2022.Constants.Conveyor.*;
import com.spartronics4915.lib.subsystems.SpartronicsSubsystem;

import edu.wpi.first.wpilibj.DigitalInput;



/**
 * Detailed description of Conveyor.
 */
public class Conveyor extends SpartronicsSubsystem

{
    // The subsystem's hardware is defined here...
    private CANSparkMax mMotor;
    private DigitalInput mTopBeamBreaker; 
    private DigitalInput mBottomBeamBreaker; 

    /** Creates a new Conveyer. */
    public Conveyor()
    {
        boolean success = true;
        try
        {
            // ...and constructed here.
            mMotor = new CANSparkMax(kSparkMaxId, MotorType.kBrushless);
            mTopBeamBreaker = new DigitalInput(kTopBeamBreakerId);
            mBottomBeamBreaker = new DigitalInput(kBottomBeamBreakerId);
        }
        catch (Exception exception)
        {
            logException("Could not construct hardware: ", exception);
            success = false;
        }
        logInitialized(success);
    }

    // Subsystem methods - actions the robot can take - should be placed here.
public void setSpeed(double speed) {
        mMotor.set(speed);
        logInfo("running");
    }

    public void startConveyor(){
        mMotor.set(0.3);
        logInfo("running");
    }

    public void stopConveyor() {
        mMotor.set(0);
        logInfo("stopped");}
    /** This method will be called once per scheduler run. */
    @Override
    public void periodic() {}

    /** This method will be called once per scheduler run during simulation. */
    @Override
    public void simulationPeriodic() {}

    public void outputTelemetry() {}
}
