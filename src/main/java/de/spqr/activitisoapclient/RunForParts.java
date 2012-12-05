/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;


/**
 *
 * @author said
 */
public class RunForParts implements JavaDelegate{
    
    @Override
    public void execute(DelegateExecution execution){
        String part=(String) execution.getVariable("part");
        try{
            long amount=EntityClient.getOrder(part);
            execution.setVariable("amount", amount);
        } catch(Exception e){
            execution.setVariable("part", e.getMessage());
            execution.setVariable("amount", null);
        }
        
    }
}
