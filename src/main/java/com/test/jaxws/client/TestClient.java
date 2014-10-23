/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.jaxws.client;

import com.test.jaxws.server.CalculatorImplService;

/**
 *
 * @author cgx1844568
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorImplService c = new CalculatorImplService();
        int s = c.getCalculatorImplPort().add(1, 3);
        System.out.println("sssssssss: " + s);
    }
    
}
