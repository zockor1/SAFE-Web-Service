//Paquete
package com.empresa.safe.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio Antillanca
 * @version 1.0
 */
public class MedicoService {

    List<String> listaMedicos = new ArrayList<>();

    public MedicoService() {
        listaMedicos.add("182758159");
        listaMedicos.add("201177642");
        listaMedicos.add("168208618");
        listaMedicos.add("179684764");
        listaMedicos.add("125907091");
        listaMedicos.add("21960940k");
        listaMedicos.add("130054927");
        listaMedicos.add("171934842");
        listaMedicos.add("213645765");
        listaMedicos.add("184473380");
    }


    public List<String> listarMedicos() {
        return listaMedicos;
    }
}
