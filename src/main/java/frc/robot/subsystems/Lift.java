package main.java.frc.robot.subsystems; 
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import  edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Lift extends Subsystem{
    public TalonSRX Lift1 = RobotMap.Lift1;
    public void lift(ControlMode controlmode, double position){
    Lift1.set(controlmode, position);
    
    public DoubleSolenoid LiftSolenoid1 = RobotMap.LiftSolenoid1;
    public DoubleSolenoid LiftSolenoid2 = RobotMap.LiftSolenoid2;
   }


   public void end(){
    
   }
    public void initDefaultCommand(){

    }
}