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
public class SendOrder implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        Order order = (Order) execution.getVariable("order");
        try {
            execution.setVariable("send", OrderClient.sendOrder(order));
        } catch (Exception e) {
            execution.setVariable("send", false);
        }

    }
}
