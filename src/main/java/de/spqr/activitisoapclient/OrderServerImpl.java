/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.activitisoapclient;

import javax.jws.WebService;

/**
 *
 * @author said
 */

@WebService(endpointInterface = "de.spqr.activitiderbysoapservice.OrderServer")
public class OrderServerImpl implements OrderServer{

    @Override
    public boolean sendOrder(Order order) {
        return order.isCoorect();
    }
    
}
