/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author cliente
 */
public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados!\n"
                + super.getDestinatario() + " eu te amo!");
    }
    
}
