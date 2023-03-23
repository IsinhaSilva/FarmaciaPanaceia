package dao;

import modelo.Cliente;
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


public class ClienteDAO {

    private Connection connection;
    int idCliente;
    String nomeCliente;
    String dataNasc;
    String cpf;
    String cep;
    String telefone;
    String genero;
    boolean convenio;
    String endRua;
    int endNum;
    
    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente(cpf,cep,nomeCliente,genero, telefone, dataNasc, convenio, endRua, endNum) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
      
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString  (1, cliente.getCpf());
            stmt.setString  (2, cliente.getCep());
            stmt.setString  (3, cliente.getNomeCliente());
            stmt.setString  (4, cliente.getGenero());
            stmt.setString  (5, cliente.getTelefone());
            stmt.setString  (6, cliente.getDataNasc());
            stmt.setBoolean (7, cliente.isConvenio());
            stmt.setString  (8, cliente.getEndRua());
            stmt.setInt     (9, cliente.getEndNum());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente SET cpf = ?,cep = ?,nomeCliente = ?,genero = ?, telefone = ?, dataNasc = ?, convenio = ?, endRua = ?, endNum = ? WHERE idCliente=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString  (1, cliente.getCpf());
            stmt.setString  (2, cliente.getCep());
            stmt.setString  (3, cliente.getNomeCliente());
            stmt.setString  (4, cliente.getGenero());
            stmt.setString  (5, cliente.getTelefone());
            stmt.setString  (6, cliente.getDataNasc());
            stmt.setBoolean (7, cliente.isConvenio());
            stmt.setString  (8, cliente.getEndRua());
            stmt.setInt     (9, cliente.getEndNum());
            stmt.setInt     (10, cliente.getIdCliente());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }
    public ResultSet listarCliente(){
        connection = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM cliente ORDER BY nomeCliente;"; //ordem alfabética 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            return stmt.executeQuery();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no listar do cliente DAO.");
            return null;
        }
    }

    public void delete(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);

        }
    }

    public List<Cliente> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDataNasc(rs.getString("dataNasc"));
                cliente.setGenero(rs.getString("genero"));
                cliente.setEndRua(rs.getString("endRua"));
                cliente.setEndNum(rs.getInt("endNum"));
                cliente.setCep(rs.getString("cep"));
                cliente.setConvenio(rs.getBoolean("convenio"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return clientes;
    }
}
