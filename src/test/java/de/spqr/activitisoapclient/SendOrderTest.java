/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author said
 */
public class SendOrderTest extends TestCase {
    
     public SendOrderTest(String testName) {
        super(testName);
    }
    
    
    
    public void testExecute()throws Exception{
        //try{
            Order o=new Order("Door",10,"Thyssen");
            Assert.assertTrue(OrderClient.sendOrder(o));
        /*} catch (Exception e){
            System.out.println(e);
        }*/
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
