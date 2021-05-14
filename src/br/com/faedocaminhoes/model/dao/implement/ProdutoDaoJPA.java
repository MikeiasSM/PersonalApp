/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faedocaminhoes.model.dao.implement;

import br.com.faedocaminhoes.connection.ConnectionFactory;
import br.com.faedocaminhoes.model.Produto;
import br.com.faedocaminhoes.model.Fornecedor;
import java.util.List;
import br.com.faedocaminhoes.uteis.JPaneError;
import javax.persistence.EntityManager;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import br.com.faedocaminhoes.model.dao.ProdutoDao;

/**
 *
 * @author Poison
 */
public class ProdutoDaoJPA implements ProdutoDao{

    private static EntityManager em;
    
    @Override
    public void insert(Produto obj) {
        em = new ConnectionFactory().getConection();
        try{
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Registro adicionado com sucesso!", "FAEDO CAMINHÕES ©", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

    @Override
    public void update(Produto obj) {
        em = new ConnectionFactory().getConection();
        
        try{
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!", "FAEDO CAMINHÕES ©", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
   
    public void updateSemDialog(Produto obj) {
        em = new ConnectionFactory().getConection();
        
        try{
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

    @Override
    public void delete(Produto obj) {
        em = new ConnectionFactory().getConection();
        
        try{
            Produto prod = em.find(Produto.class, obj.getId());
            
            em.getTransaction().begin();
            em.remove(prod);
            em.getTransaction().commit();
            
            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!", "FAEDO CAMINHÕES ©", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(RollbackException ex){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "FAEDO CAMINHÕES ©", ex);
            ex.printStackTrace();
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "FAEDO CAMINHÕES ©", e);
            e.printStackTrace();
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

    @Override
    public List<Produto> findAll() {
        em = new ConnectionFactory().getConection();
        List<Produto> combustivel = null;
        
        try{
            combustivel = em.createQuery("SELECT u FROM Produto u ORDER BY u.id").getResultList();
            
            if(combustivel.isEmpty()){
                JOptionPane.showMessageDialog(null, "Anyone regiter not found!", "FAEDO CAMINHÕES ©", JOptionPane.ERROR_MESSAGE);
                throw new IllegalArgumentException("Date or table not found!");
            }
            
            return combustivel;
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
            return null;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

    @Override
    public Produto findById(Produto obj) {
        em = new ConnectionFactory().getConection();
        Produto combustivel = null;
        
        try{
            combustivel = em.find(Produto.class, obj.getId());
        
            if(combustivel == null){
                JOptionPane.showMessageDialog(null, "Object not found!", "FAEDO CAMINHÕES ©", JOptionPane.ERROR_MESSAGE);
                throw new IllegalAccessError("Register not found!");
            }
            return combustivel;                
        }catch(Exception e){
            em.getTransaction().rollback();
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
            return null;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public List<Produto> findByName(String pName){
        em = new ConnectionFactory().getConection();
        List<Produto> list = null;
        try{
            String query = "SELECT p FROM Produto p WHERE 1 = 1 AND p.nome LIKE '%"+pName+"%' ORDER BY p.id";
           
            list = em.createQuery(query).getResultList();
            if (!list.isEmpty()) {
                return list;
            } else {
                JOptionPane.showMessageDialog(null, "Register not found!", "FAEDO CAMINHÕES ©", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }catch(Exception e){
            JPaneError.showErrorDialog(null, "Erro ao executar ação!", e);
            e.printStackTrace();
            return null;
        }finally{
            if(em != null){
                em.close();
            }
        }
    }

}
