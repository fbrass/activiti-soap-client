/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

/**
 *
 * @author said
 */
public class OrderClient {
    
    
    public static boolean sendOrder(Order order) throws Exception{
		
        OrderServerImplService orderService = new OrderServerImplService();
        OrderServer os= orderService.getOrderServerImplPort();
		
		
		return os.sendOrder(order);
		
	}
}
