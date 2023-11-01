package com.felipelabarcacorbalan.tienda.holamundojpa;

import com.felipelabarcacorbalan.tienda.holamundojpa.util.EntityManagerUtil;
import javax.persistence.EntityManager;



public class HolaMundoJPA {

    public static void main(String[] args) {
        EntityManager manager = EntityManagerUtil.getEntityManager();
        System.out.println("EntityManager class ==>" + manager.getClass().getCanonicalName());
    }
}
