/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Jackson, Taylor, Thomas
 */
public class ToggleLightCommand extends CommandBase {
    
    public ToggleLightCommand() {
        requires(light);
    }
    
    protected void initialize() {
        if (light.isLightOn() == true) {
            light.turnLightOff();
            System.out.println("Light: OFF"); //<<<<<<<<< Debugger message
        }
        else if (light.isLightOn() == false) {
            light.turnLightOn();
            System.out.println("Light: ON"); //<<<<<<<<< Debugger message
        }
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        return true;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
