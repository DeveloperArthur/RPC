package rpc;

import java.rmi.Remote;

public interface InterfaceRPC extends Remote {

    public String adicionaUsuario(String nome) throws Exception;
    
    public Long calculaRA(Long RA) throws Exception;
    
}


