/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import java.util.ArrayList;
import model.Cliente;
import dao.ClienteDao;
/**
 *
 * @author 182120046
 */
public class ClienteServicos {
    
    public void cadastroCliente(Cliente cVO){
        ClienteDao cDao = DAOFactory.getClienteDAO();
        cDao.ClienteDAO(cVO);
    }
    
    public ArrayList<Cliente> getCliente(){
        ClienteDao cDAO = DAOFactory.getClienteDAO();
        return cDAO.getidCliente();
    }
    
    public Cliente getClienteByDoc(String cpf){
        ClienteDao cDAO = DAOFactory.getClienteDAO();
        return cDAO.getPessoaByDoc(cpf);
    }
    
    public void atualizarCliente(Cliente cVO){
        ClienteDao cDao = DAOFactory.getClienteDAO();
        cDao.atualizarClienteDAO(cVO);
    }
    
    public void deletarCliente(String cpf){
        ClienteDao cDao = DAOFactory.getClienteDAO();
        cDao.deletarClienteDAO(cpf);
    }
}