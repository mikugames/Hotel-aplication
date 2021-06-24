/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import tabelas.Recepcao;
/**
 *
 * @author tgabr
 */
public class Funcionalidades {
    Connection conexao;
    String comando;
    PreparedStatement stmt;
    
    public Funcionalidades(Connection conexao){
        this.conexao = conexao;
    }
    
    public boolean Login(String usuario, String senha, int nvlUsuario){
        try {
            switch (nvlUsuario) {
                case 3:
                    comando = "SELECT * FROM admin WHERE usuario = ?";
                    break;
                case 2:
                    comando = "SELECT * FROM gerente WHERE usuario = ?";
                    break;
                case 1:
                    comando = "SELECT * FROM funcionario WHERE usuario = ?";
                    break;
                default:
                    comando = "SELECT * FROM cliente WHERE usuario = ?";
                    break;
            }
            
            stmt = conexao.prepareStatement(comando);
            stmt.setString(1, usuario);
            ResultSet result = stmt.executeQuery();
            
            if(result.next()){
                //Se passar ele vai estar na posicao 1 , já pronto para usar os getters
                String senhaUser = result.getString("senha");
                
                if(senha.equals(senhaUser)){
                    return true;
                }
                
            }
            
            stmt.close();
            conexao.close();
            
            return false;
        } catch (Exception e) {
           return false;
        }
        
    }
 

}
