/*Implemente um novo método
remoto, através de RPC, para fazer
a conta do número do RA de cada 1
dos integrantes do grupo - 100.

O resultado da conta de cada
”cliente” deve ser impresso no
console de cada respectivo
“cliente”.

O resultado de todas as contas deve
ser impresso no console do
“servidor”.*/

package rpc;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Servidor extends UnicastRemoteObject implements InterfaceRPC {

    List<String> usuarios= new ArrayList<>();

    public static void main(String[] args) throws Exception{
        
            System.out.println("*** SERVIDOR ***");
            
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/obj", new Servidor());
    }

    public Servidor() throws Exception { }

    @Override
    public String adicionaUsuario(String nome) throws Exception {
        usuarios.add(nome);
        return "Usuário " + nome + " adicionado.";
    }

    @Override
    public Long calculaRA(Long RA) throws Exception {
        System.out.println(RA-100);
        return RA-100;
    }
    
}



