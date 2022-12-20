/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.modelo;

import lombok.Data;

/**
 *
 * @author Hp
 */
@Data
public class VentaTO {
    public int idventa;
    public String dniruc;
    public double preciobase, igv, preciototal;
}
