/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import java.util.ArrayList;
import model.Fornecedor;


/**
 *
 * @author 182120046
 */
public class FornecedorServicos {

    private FornecedorDAO fDAO;

    public FornecedorServicos() {
        fDAO = DAOFactory.getFornecedorDAO();
    }

    public void cadastroFornecedor(Fornecedor fVO) {
        fDAO.cadastrarCarroDAO(fVO);
    }

    public ArrayList<Fornecedor> getFornecedor() {
        return fDAO.getFornecedor();
    }

    public Fornecedor getFornecedorByDoc(String cnpj) {
        return fDAO.getFornecedorByDoc(cnpj);
    }

    public void atualizarFornecedor(Fornecedor fVO) {
        fDAO.atualizarFornecedor(fVO);
    }