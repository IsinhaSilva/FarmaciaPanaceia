package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Funcionario;

public class FuncionarioDAO {
    
    private Connection connection;
    int idFuncionario;
    int idCliente;
    String nomeFuncionario;
    String cpf;
    String email;
    int enderecoNumero;
    String enderecoRua;

    public FuncionarioDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(idCliente, nomeFuncionario, cpf, email, enderecoNumero, enderecoRua) "
            + "VALUES (?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt        (1, funcionario.getIdCliente());
            stmt.setString     (2, funcionario.getNomeFuncionario());
            stmt.setString     (3, funcionario.getCpf());
            stmt.setString     (4, funcionario.getEmail());
            stmt.setInt        (5, funcionario.getEnderecoNumero());
            stmt.setString     (6, funcionario.getEnderecoRua());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void update(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET idCliente=?, nomeFuncionario=?, cpf=?, email=?, "
            + "enderecoNumero=? enderecoRua=? WHERE idFuncionario=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt        (1, funcionario.getIdFuncionario());
            stmt.setInt        (2, funcionario.getIdCliente());
            stmt.setString     (3, funcionario.getNomeFuncionario());
            stmt.setString     (4, funcionario.getCpf());
            stmt.setString     (5, funcionario.getEmail());
            stmt.setInt        (6, funcionario.getEnderecoNumero());
            stmt.setString     (7, funcionario.getEnderecoRua());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }
    
    public void delete(Funcionario funcionario) {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getIdFuncionario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
    
        }
    }
    
    public List<Funcionario> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setIdCliente(rs.getInt("idCliente"));
                funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setEnderecoNumero(rs.getInt("enderecoNumero"));
                funcionario.setEnderecoRua(rs.getString("enderecoRua"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return funcionarios;
    }
    
}
