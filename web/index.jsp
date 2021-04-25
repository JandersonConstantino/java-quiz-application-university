<%-- 
    Document   : index
    Created on : 04/11/2020, 18:47:46
    Author     : jandersonconstantino
--%>

<%@page import="com.jandersonconstantino.Answer"%>
<%@page import="com.jandersonconstantino.Question"%>
<%@page import="com.jandersonconstantino.Repository"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="css/custom.css" >
        <title>Quiz</title>
    </head>
    <body>
        <form class="container" action="./quiz-result" method="POST">
            <h1 class="text-center">Qual dos vingadores &eacute; voc&ecirc;?</h1>
            <%
                for(int index = 0; index < Repository.questions.size(); index++) {
                    Question question = Repository.questions.get(index);
                    out.println("<div class=\"col-12\">");
                    out.println("<label>" + String.valueOf(index + 1) + " - " + question.getDescription() + "</label>");

                    for(int indexAnswer = 0; indexAnswer < question.getAnswers().size(); indexAnswer++) {
                        Answer answer = question.getAnswers().get(indexAnswer);
                        String IdRadio = String.valueOf(index) + String.valueOf(indexAnswer);
                        out.println("<div class=\"custom-control custom-radio\">");
                        out.println("<input type=\"radio\" id=\"" + IdRadio + "\" value=\"" + indexAnswer + "\" name=\"" + index + "\" class=\"custom-control-input\">");
                        out.println("<label class=\"custom-control-label\" for=\"" + IdRadio + "\">" + answer.getDescription() + "</label>");
                        out.println("</div>");
                    }

                    out.println("</div>");
                }
            %>
            <button type="submit" class="btn btn-info">
                Calcular resultado
            </button>
        </form>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
