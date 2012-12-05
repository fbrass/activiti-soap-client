package de.spqr.activitisoapclient;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import org.activiti.engine.delegate.DelegateExecution;

/**
 *
 * @author said
 */
public class RunforPartsTest extends TestCase {
    
    public RunforPartsTest(String testName) {
        super(testName);
    }
    
    
    
    public void testExecute(){
        try{
            
            System.out.println(EntityClient.getOrder("Door"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
