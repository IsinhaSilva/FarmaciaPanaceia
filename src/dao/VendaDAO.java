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
import modelo.Venda;

public class VendaDAO {
    
    private Connection connection;
    
        int idVenda;
        int idCliente;
        int idProduto;
        String nomeCliente;
        String nomeProduto;
        int quantidade;
        double valorUnidade;
        String dataVenda;
        String horaVenda;
        String formaPagamento;
        double valorTotal;
        
    public VendaDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Venda venda){
        String sql = "INSERT INTO venda(idCliente, idProduto, nomeCliente, nomeProduto, quantidade," +
        "valorUnidade, dataVenda, horaVenda, formaPagamento, valorTotal;) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt     (1, venda.getIdCliente());
            stmt.setInt     (2, venda.getIdProduto());
            stmt.setString  (3, venda.getNomeCliente());
            stmt.setString  (4, venda.getNomeProduto()); 
            stmt.setInt     (5, venda.getQuantidade());
            stmt.setDouble  (6, venda.getValorUnidade());
            stmt.setString  (7, venda.getDataVenda());
            stmt.setString  (8, venda.getHoraVenda());
            stmt.setString  (9, venda.getFormaPagamento());
            stmt.setDouble  (10, venda.getValorTotal());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void update(Venda venda) {
        String sql = "UPDATE venda SET idCliente=?, idProduto=?, "
            + "nomeCliente=?, nomeProduto=?, quantidade=?, valorUnidade=?, "
            + "dataVenda=?, horaVenda=?, formaPagammento=?, valorTotal=?, WHERE idVenda=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt     (1, venda.getIdCliente());
            stmt.setInt     (2, venda.getIdProduto());
            stmt.setString  (3, venda.getNomeCliente());
            stmt.setString  (4, venda.getNomeProduto()); 
            stmt.setInt     (5, venda.getQuantidade());
            stmt.setDouble  (6, venda.getValorUnidade());
            stmt.setString  (7, venda.getDataVenda());
            stmt.setString  (8, venda.getHoraVenda());
            stmt.setString  (9, venda.getFormaPagamento());
            stmt.setDouble  (10, venda.getValorTotal());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }
    
    public void delete(Venda venda) {
        String sql = "DELETE FROM venda WHERE idVenda = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venda.getIdVenda());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
    
        }
    }
    
    public List<Venda> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM venda");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setIdVenda        (rs.getInt   ("idVenda"));
                venda.setIdCliente      (rs.getInt   ("idCliente"));
                venda.setIdProduto      (rs.getInt   ("idProduto"));
                venda.setNomeCliente    (rs.getString("nomeCliente"));
                venda.setNomeProduto    (rs.getString("nomeProduto"));
                venda.setQuantidade     (rs.getInt   ("quantidade"));
                venda.setValorUnidade   (rs.getDouble("valorUnidade"));
                venda.setDataVenda      (rs.getString("dataVenda"));
                venda.setHoraVenda      (rs.getString("horaVenda"));
                venda.setFormaPagamento (rs.getString ("formaPagamento"));
                venda.setValorTotal   (rs.getDouble("valorTotal"));
                vendas.add(venda);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return vendas;
    }
}
