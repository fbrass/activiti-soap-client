/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

/**
 * client class of the order web service
 * @author said
 */
public class OrderClient {
    
    /**
     * Method is used to send a order
     * @param order order to send
     * @return correctness of order
     * @throws Exception 
     */
    public static boolean sendOrder(Order order) throws Exception{
		
        OrderServerImplService orderService = new OrderServerImplService();
        OrderServer os= orderService.getOrderServerImplPort();
		
		
		return os.sendOrder(order);
		
	}
}
