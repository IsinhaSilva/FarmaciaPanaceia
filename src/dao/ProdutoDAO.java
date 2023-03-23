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
import modelo.Produto;

public class ProdutoDAO {
    private Connection connection;
    
        int idProduto;
        String nomeProduto;
        int quantidade;
        double valorUnidade;
        String bula;
        
    public ProdutoDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public ResultSet listarProduto(){
        connection = new ConnectionFactory().getConnection();
        String sql = "SELECT * FROM produto ORDER BY nomeProduto;"; //ordem alfabética 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            return stmt.executeQuery();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro produto no DAO.");
            return null;
        }
    }
    
    public void adiciona(Produto produto){
        String sql = "INSERT INTO produto(nomeProduto,valorUnidade, quantidade, bula) "
            + "VALUES (?,?,?,?)";
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString     (1, produto.getNomeProduto());
            stmt.setDouble     (2, produto.getValorUnidade());
            stmt.setInt        (3, produto.getQuantidade());
            stmt.setString     (4, produto.getBula()); 
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void update(Produto produto) {
        String sql = "UPDATE produto SET nomeProduto=?, valorUnidade=?, "
            + "quantidade=?, bula=?, WHERE idProduto=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString     (1, produto.getNomeProduto());
            stmt.setDouble     (2, produto.getValorUnidade());
            stmt.setInt        (3, produto.getQuantidade());
            stmt.setString     (4, produto.getBula());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }
    
    public void delete(Produto produto) {
        String sql = "DELETE FROM produto WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);
    
        }
    }
    
    public List<Produto> leitura() {
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto   (rs.getInt   ("idProduto"));
                produto.setNomeProduto(rs.getString("nomeProduto"));
                produto.setValorUnidade(rs.getDouble("valorUnidade"));
                produto.setQuantidade  (rs.getInt   ("quantidade"));
                produto.setBula        (rs.getString("bula"));
                produtos.add(produto);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return produtos;
    }

//    public void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
