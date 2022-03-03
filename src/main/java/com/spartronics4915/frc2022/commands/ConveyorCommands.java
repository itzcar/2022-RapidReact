package com.spartronics4915.frc2022.commands;

import com.spartronics4915.frc2022.subsystems.Conveyor;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ConveyorCommands {
    private final Conveyor mConveyor;

    public ConveyorCommands(Conveyor conveyor) {
        mConveyor = conveyor;
    }
    /**Both empty/top empty and both running until top beam breaker true*
    Top full and bottom empty, running until bottom beam breaker true*
    Top full/empty and bottom reversing while button held*
    Both reversing while button held*
    Top running to shoot, bottom empty — run for ~ two seconds
    Top running to shoot, bottom full — run top for 2, then run both until top true

 */

    public class BothEmptyBothRunning extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public BothEmptyBothRunning()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {
            mConveyor.startTopConveyor();
            mConveyor.startBottomConveyor();
        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {
            mConveyor.stopBottomConveyor();
        }
    }

    public class TopFullBottomEmpty extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public TopFullBottomEmpty()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {

        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {}
    }

    public class BothReversingButton extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public BothReversingButton()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {

        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {}
    }

    public class TopFullEmptyBottomReversing extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public TopFullEmptyBottomReversing()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {

        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {}
    }

    public class TopRunningShootBottomEmpty extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public TopRunningShootBottomEmpty()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {

        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {}
    }

    public class TopRunningShootBottomFull extends CommandBase
    {
        

        /**
         * Creates a new ExampleCommand.
         *
         * @param subsystem The subsystem used by this command.
         */
        public TopRunningShootBottomFull()
        {
            addRequirements(mConveyor); // Declares subsystem dependencies
        }

        // Called when the command is initially scheduled.
        @Override
        public void initialize() {

        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {

        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished()
        {
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {}
    }

    
    }