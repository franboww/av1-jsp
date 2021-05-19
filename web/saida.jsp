<%@page import="java.util.List"%>
<%@page import="utils.calculadora"%>
<% 
    calculadora c= new calculadora();
    
    c.setValor1(request.getParameter("valor1"));
    c.setOperacao(request.getParameter("operacao"));
    String op =c.getOperacao();
    if(!op.contains("tabuada")){
        c.setValor2(request.getParameter("valor2"));
    }
    

    if (c.validar()){
        out.print(c.getErro());
    }else {
        if(!op.contains("tabuada")){
            out.print("Resultado : " + c.calcular());
        } else{
            out.print("Resultado : " + c.tabuada());
          }  
    }
%>

<br><br> <a href="index.html">Voltar ao início</a>


