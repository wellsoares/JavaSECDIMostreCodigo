package br.com.mostreocodigo.modelo;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author well
 */

public class ClasseParaInjecao implements Serializable {

    public void testarInjecao() {
        System.out.println("Injeção funcionado !!!");
    }

}
