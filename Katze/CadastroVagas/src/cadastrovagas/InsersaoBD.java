package cadastrovagas;

public class InsersaoBD {
    public StringBuffer sb;
    public AcessoBD bd;
    
    public InsersaoBD(AcessoBD a){
        bd=a;
    }
    public void ouvidor(String turno,String estagio,double numVagas,String valeRefeicao,String valeTransporte,String assisMedica,String assisOdonto,String fretamento,String responCadastro,String empresa,String localEmpresa,double salario,String emailContato,String responVaga){
    
    sb = new StringBuffer();
    sb.append("INSERT INTO cadastro VALUES('");
    sb.append(turno);
    sb.append("','");
    sb.append(estagio);
    sb.append("','");
    sb.append(numVagas);
    sb.append("','");
    sb.append(valeRefeicao);
    sb.append("','");
    sb.append(valeTransporte);
    sb.append("','");
    sb.append(assisMedica);
    sb.append("','");
    sb.append(assisOdonto);
    sb.append("','");
    sb.append(fretamento);
    sb.append("','");
    sb.append(responCadastro);
    sb.append("','");
    sb.append(empresa);
    sb.append("','");
    sb.append(localEmpresa);
    sb.append("','");
    sb.append(salario);
    sb.append("','");
    sb.append(emailContato);
    sb.append("','");
    sb.append(responVaga);
    sb.append("');");
    
    bd.executa(sb.toString());
} 

}
