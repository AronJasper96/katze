package cadastrovagas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AcessoBD {
    

    private Connection con;
    private Statement stm;
    public AcessoBD(){
        con=null;
        stm=null;
    }
   
    public void conecta(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/projetobeta?user=root");
        stm=con.createStatement();
    }
    catch(SQLException se){
        System.out.println("Excessão SQL");
    }
    catch(ClassNotFoundException cnf){
            System.out.println("Classe não encontrada");   
    }        
}
    public void executa(String pedido){
        try{
            stm.executeUpdate(pedido);          
        }
        catch(SQLException e){
            System.out.println("Exceção:"+e.toString());
        }
        catch(NullPointerException np){
            System.out.println("Exceção:"+np.toString());           
        }
    }    
        public ResultSet consulta(String consulta){
            ResultSet rs=null;
            try{
                rs=stm.executeQuery(consulta);
            }
            catch(SQLException e){
                System.out.println("Exceção:"+e.toString());         
            }
            finally{
                return rs;
            }  
        }
        public void fechaConexao(){
            try{
                stm.close();
                con.close();
            }
            catch(SQLException e){
                 System.out.println("Exceção:"+e.toString());         
            }            
    }
}

