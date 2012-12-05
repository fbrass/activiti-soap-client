/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

/**
 *
 * @author said
 */
public class EntityClient {
    
    /**
     * Method used to get the need of an order
     * @param part part to check
     * @return number of parts to order
     * @throws Exception 
     */
	public static long getOrder(String part) throws Exception{
		
		EntityServerService entityService = new EntityServerService();
		EntityServer es = entityService.getEntityServerImplPort();
		
		
		return es.orderParts(part);
		
	}
}
