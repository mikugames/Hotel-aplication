/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
/**
 *
 * @author tgabr
 */
public class Funcionalidades {
    Connection conexao;
    String comando;
    PreparedStatement stmt;
    
    public static String nameUserActive, cpfUserActive;
    public static int nvlUserActive;
    
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
                cpfUserActive = result.getString("cpf");
                nameUserActive = result.getString("nome");
                nvlUserActive = result.getInt("nvlUsuario");
                
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
    
    public boolean CadastrarPessoa(
            String cpf, 
            String nome, 
            String usuario, 
            String telefone,
            String senha,
            int nvlUsuario
    ){
        try{
            if(nvlUsuario == 1){
                comando = "INSERT INTO funcionario VALUES(?,?,?,?,?,?)";
            }else{
                comando = "INSERT INTO cliente VALUES(?,?,?,?,?,?)";
            }
            
            stmt = conexao.prepareStatement(comando);
            stmt.setString(1, cpf);
            stmt.setString(2, nome);
            stmt.setString(3, usuario);
            stmt.setString(4, telefone);
            stmt.setString(5, senha);
            stmt.setInt(6, nvlUsuario);
            
            stmt.execute();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    
    public boolean CadastrarServico(
            String nome,
            String descricao,
            String nomeProficional,
            String preco
    ){
        try{
            comando = "INSERT INTO servico(nome,descricao,nome_proficional,preco) VALUES(?,?,?,?)";
            stmt = conexao.prepareStatement(comando);
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setString(3, nomeProficional);
            stmt.setString(4, preco);
            stmt.execute();
            return true;
        }catch(Exception e){
            
        }
        
        return false;
    }

}
