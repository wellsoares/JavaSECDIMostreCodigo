/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mostreocodigo.main;

import br.com.mostreocodigo.modelo.ClasseParaInjecao;
import java.util.List;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

/**
 *
 * @author well
 */
public class Main {
    
    @Inject
    ClasseParaInjecao classeInjetada;

    public void main(@Observes ContainerInitialized event, @Parameters List<String> params) {
        classeInjetada.testarInjecao();
    }
}
