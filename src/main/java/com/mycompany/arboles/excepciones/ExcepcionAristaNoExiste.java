/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arboles.excepciones;

/**
 *
 * @author USER
 */
public class ExcepcionAristaNoExiste extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionAristaNoExiste</code> without
     * detail message.
     */
    public ExcepcionAristaNoExiste() {
        super("Arista no existe");
    }

    /**
     * Constructs an instance of <code>ExcepcionAristaNoExiste</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionAristaNoExiste(String msg) {
        super(msg);
    }
}
