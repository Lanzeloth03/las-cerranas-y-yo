/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.CategoriaTO;

/**
 *
 * @author HP
 */
public interface CategoriaDaoI {

    public int create(CategoriaTO d);

    public int update(CategoriaTO d);

    public int delete(String id) throws Exception;

    public List<CategoriaTO> listCmb(String filter);

    public List<CategoriaTO> listarClientes();

    public CategoriaTO buscarClientes(String nombre);

    public void reportarCliente();
}
