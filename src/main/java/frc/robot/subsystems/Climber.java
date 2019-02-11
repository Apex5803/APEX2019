package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Climber extends Subsystem{

    public DoubleSolenoid ClimberPneu = RobotMap.ClimberPneu1;
    public TalonSRX Climber1 = RobotMap.Climber1;
   
    public void ExtendClimber(){
        ClimberPneu.set(Value.kForward);
    }

    public void RetractClimber(){
        ClimberPneu.set(Value.kReverse);
    }

    public void ClimberForward(){
        Climber1.set(ControlMode.PercentOutput, 0.7);
    }

    public void ClimberReverse(){
        Climber1.set(ControlMode.PercentOutput, -0.7);
    }

    public void ClimberStop(){
        Climber1.set(ControlMode.PercentOutput, 0.0);
    }

    @Override
    public void initDefaultCommand(){

    
    }
}
