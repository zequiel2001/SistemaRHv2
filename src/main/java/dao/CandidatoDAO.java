/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import modelos.Cadidato;
/**
 *
 * @author Ezeks
 */
public class CandidatoDAO {
    public List<Cadidato> consulta(){
        
        List<Cadidato> candidatos = new ArrayList<>();
        
        Cadidato c1 = new Cadidato();
        c1.setNome("Ezequiel");
        c1.setSobrenome("Santos Mota");
        c1.setIdade(20);
        c1.setSexo("Masculino");
        c1.setEmail("ezequiel.infor.motta2020@gmail.com");
        c1.setCursos("Informática");
        c1.setTelefone(982319469);
        c1.setCpf("123.321.654-31");
        c1.setEsperiecia("10 anos como Técnico");
        
        candidatos.add(c1);
        
    
        
        return candidatos;
    }
}
