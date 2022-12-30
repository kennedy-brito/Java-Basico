/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author cliente
 */
public class Aniversario extends CartaoWeb{

    public Aniversario(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário!\n"
                + super.getDestinatario() + " Que Deus te abençoe, te de saúde e muitos anos de vida!");
    }   
}
