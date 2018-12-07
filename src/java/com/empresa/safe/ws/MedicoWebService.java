package com.empresa.safe.ws;

import com.empresa.safe.service.MedicoService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Ignacio Antillanca
 */
@WebService(serviceName = "MedicoWebService")
public class MedicoWebService {

    MedicoService medicoService = new MedicoService();


    @WebMethod(operationName = "listarMedico")
    public List<String> listarMedico() {
        return medicoService.listarMedicos();
    }
}
