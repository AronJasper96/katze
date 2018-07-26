<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <center>
            <img src="StorageWorks.png"></imgsrc>
 
<?php

$tecnico = 'Técnico em Mecânica';
$dbh  = new PDO('mysql:host=localhost;dbname=projetobeta','root','',array(PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"));


foreach($dbh->query("SELECT * FROM cadastro WHERE estagio='$tecnico'")  as $linha){
  echo"<center>";
		echo " <table  border=1 bgcolor=#c4c4c4>";
	echo"<tr>";
                echo"<td>";
                    echo"Empresa: ";
                            echo "{$linha['empresa']}<br />";
                echo"</td>";            
		echo"<td>";
		        echo"TURNO: ";
				echo "{$linha['turno']} <br />";
			echo"</td>";	
			echo"<td>";	
			    echo"Estagio: ";
				echo "{$linha['estagio']} <br />";
			echo"</td>";	
			echo"<td>";	
			    echo "Vagas: ";
				echo "{$linha['numVagas']} <br />";
			echo"</td>";
			echo"<td>";	
			    echo "Bolsa: ";
				echo "{$linha['salario']} <br />";
			echo"</td>";                                                
                        echo"<td>";	
			    echo "Falar com: ";
				echo "{$linha['responCadastro']} <br />";
			echo"</td>";
		echo"</td>";	
	echo"</tr>";		
		echo "</table>";	
 echo"</center>";		
		}
      
?>


    
           <form name="Cadastro" action="index.php" method="post">					
                 Voltar ao inicio: <input type="submit" value="Clique" /> 
       </form>
       </center>
    </body>
</html>