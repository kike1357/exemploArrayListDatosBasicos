package exemploarraylistdatosbasicos;

import java.util.ArrayList;

/**
 *
 * @author epastorizalorenzo
 */
public class ExemploArrayListDatosBasicos {

    
    public static void main(String[] args) {
        Numeros num=new Numeros();
        num.engadirElementos();
        num.amosarLista();
        // engadir 1 elemento
        num.engadirUnElemento(8);
        num.amosarLista();
        num.engadirEnPosicion();
        num.amosarLista();
        num.borrarCuartoElemento();
        num.amosarLista();
        num.ordenar();
        num.amosarLista();
    } 
    }
    