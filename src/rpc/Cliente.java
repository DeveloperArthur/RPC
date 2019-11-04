package rpc;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {

        System.out.println("*** CLIENTE ***");
        
        InterfaceRPC objetoRemoto = (InterfaceRPC) Naming.lookup("//localhost/obj");
        
        System.out.print("Informe seu RA: ");
        
        System.out.println(objetoRemoto.calculaRA(
                new Scanner(System.in).nextLong())
        );
    }
}


