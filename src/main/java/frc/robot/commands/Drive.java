package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.OI;
import frc.robot.models.DriveSignal;
import frc.robot.utils.*;

public class Drive extends Command{
    public Drive(){
        requires(Robot.driveTrain);
    }

    protected void initialize(){

    }

    protected void execute(){
        double move = OI.xbox1.getY(Hand.kLeft);
        double rotate = OI.xbox2.getX(Hand.kRight);
        boolean quickTurn = Robot.driveTrain.quickTurnController();
        DriveSignal driveSignal = helper.cheesyDrive(1.0 * move, 1.0 * -rotate, quickTurn, false);
        Robot.driveTrain.drive(ControlMode.PercentOutput, driveSignal);
    }

    protected boolean isFinished(){
        return false;
    }

    protected void end(){

    }

    protected void interrupted(){

    }
}

