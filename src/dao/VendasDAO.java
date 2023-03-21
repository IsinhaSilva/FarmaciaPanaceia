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
import modelo.Vendas;

public class VendasDAO {
    
    private Connection connection;
    
        int idVendas;
        int idCliente;
        int idProduto;
        String nomeCliente;
        String nomeProduto;
        int quantidade;
        double valorUnitario;
        String dataVendas;
        boolean formaPagamento;
        double valorTotal;
        
    public VendasDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Vendas vendas){
        String sql = "INSERT INTO vendas(idCliente, idProduto, nomeCliente, nomeProduto, quantidade," +
        "valorUnitario, dataVendas, formaPagamento, valorTotal;) "
            + "VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt     (1, vendas.getIdCliente());
            stmt.setInt     (2, vendas.getIdProduto());
            stmt.setString  (3, vendas.getNomeCliente());
            stmt.setString  (4, vendas.getNomeProduto()); 
            stmt.setInt     (5, vendas.getQuantidade());
            stmt.setDouble  (6, vendas.getValorUnitario());
            stmt.setString  (7, vendas.getDataVendas());
            stmt.setBoolean (8, vendas.isFormaPagamento());
            stmt.setDouble  (9, vendas.getValorTotal());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
