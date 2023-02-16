
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
import modelo.Caixa;

public class CaixaDAO {
    
    private Connection connection;
    int idCaixa;
    int idCliente;
    int idProduto;
    int quantidade;
    double valorEntrada;
    double valorSaida;
    double valorTotal;
    int idFuncionario;
    
    public CaixaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Caixa caixa) {
        String sql = "INSERT INTO caixa(idCliente,idProduto,quantidade,valorEntrada,valorSaida, "
                + "valorTotal, idFuncionario) VALUES (?,?,?,?,?,?,?,)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt     (1, caixa.getIdCliente());
            stmt.setInt     (2, caixa.getIdProduto());
            stmt.setInt     (3, caixa.getQuantidade());
            stmt.setDouble  (4, caixa.getValorEntrada());
            stmt.setDouble  (5, caixa.getValorSaida());
            stmt.setDouble  (6, caixa.getValorTotal());
            stmt.setInt     (7, caixa.getIdFuncionario());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void update(Caixa caixa) {
        String sql = "UPDATE caixa SET idCliente=?,idProduto=?,quantidade=?, valorEntrada=?,"
                + "valorSaida=?, valorTotal=?, idFuncionario=? WHERE idCaixa=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt     (1, caixa.getIdCaixa());
            stmt.setInt     (2, caixa.getIdCliente());
            stmt.setInt     (3, caixa.getIdProduto());
            stmt.setInt     (4, caixa.getQuantidade());
            stmt.setDouble  (5, caixa.getValorEntrada());
            stmt.setDouble  (6, caixa.getValorSaida());
            stmt.setDouble  (7, caixa.getValorTotal());
            stmt.setInt     (8, caixa.getIdFuncionario());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            throw new RuntimeException(u);
        }
    }
    
    public void delete(Caixa caixa) {
        String sql = "DELETE FROM caixa WHERE idCaixa = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, caixa.getIdCaixa());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!");
            throw new RuntimeException(u);

        }
    }
    
    public List<Caixa> leitura() {
        
        connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Caixa> caixas = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM caixa");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setIdCaixa(rs.getInt("idCaixa"));
                caixa.setIdCliente(rs.getInt("idCliente"));
                caixa.setIdProduto(rs.getInt("idProduto"));
                caixa.setQuantidade(rs.getInt("quantidade"));
                caixa.setValorEntrada(rs.getDouble("valorEntrada"));
                caixa.setValorSaida(rs.getDouble("valorSaida"));
                caixa.setValorTotal(rs.getDouble("valorTotal"));
                caixa.setIdFuncionario(rs.getInt("idFuncionario"));
                caixas.add(caixa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CaixaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return caixas;
    }
}
