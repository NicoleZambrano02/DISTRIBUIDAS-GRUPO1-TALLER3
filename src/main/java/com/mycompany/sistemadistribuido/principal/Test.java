/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemadistribuido.principal;

import com.mycompany.sistemadistribuido.entidades.Productos;
import com.mycompany.sistemadistribuido.session.ProductosJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nicole
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
        ProductosJpaController pjc = new ProductosJpaController(emf);
        
        Productos p = new Productos();
        
        p.setCodigo(2);
        p.setNombre("SOFTWARE ERP");
        Double d1 = 4099.50;
        BigDecimal db1 = BigDecimal.valueOf(d1);
        p.setPrecio(db1);
        p.setDetalle("PARA LA ESPE");
        
        try {
            pjc.create(p);
            
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
