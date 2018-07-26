package cadastrovagas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    private AcessoBD acessoBD;
    private String consulta;
    private ResultSet resposta;
    private Object[][] dados;
    private TelaDados telaDados;
    private Opcoes op;
    
    public static void main(String[] args) {
        Principal p = new Principal();
    }
    public void loginOk(){
        op= new Opcoes(this); 
        op.setVisible(true);
    }
    public void escolherCadastro(){
        InsersaoBD is= new InsersaoBD(acessoBD);
        InsersaoCadastro ic= new InsersaoCadastro(is);
        ic.setVisible(true);
        
    }
    public Opcoes getOpcoes(){
        return op;
    }
    public void escolherBusca(){
        telaDados= new TelaDados(this);
        telaDados.setVisible(true);
        consulta = "select * from cadastro";
        resposta = acessoBD.consulta(consulta);
        this.converteRespostaEmArray();
        telaDados.carregaDados(dados);
        
    }
    public void atualizarLista(){
        consulta = "select * from cadastro";
        resposta = acessoBD.consulta(consulta);
        this.converteRespostaEmArray();
        telaDados.carregaDados(dados);
    }
    public Principal(){
        System.out.println("Método Construtor de Principal");
        
        Login l= new Login(this);
        l.setVisible(true);
       
        acessoBD = new AcessoBD();
        acessoBD.conecta();
        
        consulta = "select * from cadastro";
        resposta = acessoBD.consulta(consulta);
        
        this.exibeResultado();

  }
    
    private void converteRespostaEmArray(){
        int tamanho, i;
        tamanho = 0;
        i = 0;
        try {
            while(resposta.next()){
                    tamanho = tamanho + 1;
                }
            resposta.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dados = new Object[tamanho][14];
        try {
            while(resposta.next()){
                    dados[i][0] = resposta.getString("turno");
                    dados[i][1] = resposta.getString("estagio");
                    dados[i][2] = resposta.getString("numVagas");
                    dados[i][3] = resposta.getString("valeRefeicao");
                    dados[i][4] = resposta.getString("valeTransporte");
                    dados[i][5] = resposta.getString("assisMedica");
                    dados[i][6] = resposta.getString("assisOdonto");
                    dados[i][7] = resposta.getString("fretamento");
                    dados[i][8] = resposta.getString("responCadastro");
                    dados[i][9] = resposta.getString("empresa");
                    dados[i][10] = resposta.getString("localEmpresa");
                    dados[i][11] = resposta.getString("salario");
                    dados[i][12] = resposta.getString("emailContato");
                    dados[i][13] = resposta.getString("responVaga");
                    i++;
                }
            resposta.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void exibeResultado(){
    
        String turno, estagio, numVagas, valeRefeicao, valeTransporte, assisMedica, assisOdonto, fretamento, responCadastro, empresa, localEmpresa, salario, emailContato,responVaga;
        int tamanho = 0;
        try {
            while(resposta.next()){
                    turno = resposta.getString("turno");
                    estagio = resposta.getString("estagio");
                    numVagas = resposta.getString("numVagas");
                    valeRefeicao = resposta.getString("valeRefeicao");
                    valeTransporte = resposta.getString("valeTransporte");
                    assisMedica = resposta.getString("assisMedica");
                    assisOdonto = resposta.getString("assisOdonto");
                    fretamento = resposta.getString("fretamento");
                    responCadastro = resposta.getString("responCadastro");
                    empresa = resposta.getString("empresa");
                    localEmpresa = resposta.getString("localEmpresa");
                    salario = resposta.getString("salario");
                    emailContato = resposta.getString("emailContato");
                    responVaga = resposta.getString("responVaga");
                    
                    System.out.println("Turno: " + turno);
                    System.out.println("Estágio: " + estagio);
                    System.out.println("Número de Vagas: " + numVagas);
                    System.out.println("Vale Refeição: " + valeRefeicao);
                    System.out.println("Vale Transporte: " + valeTransporte);
                    System.out.println("Assistência Médica: " + assisMedica);
                    System.out.println("Assistência Odontológica : " + assisOdonto);
                    System.out.println("Fretamento: " + fretamento);
                    System.out.println("Responsável pelo Cadastro: " + responCadastro);
                    System.out.println("Empresa: " + empresa);
                    System.out.println("Local da Empresa: " + localEmpresa);
                    System.out.println("Salário: " + salario);
                    System.out.println("Email para Contato: " + emailContato);
                    System.out.println("Responsável pela Vaga: " + responVaga);
                    
                    
                    tamanho = tamanho + 1;
                }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tamanho do ResultSet: " + tamanho);
    }
    
}
