<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos</title>
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>


</head>
<body>

<div class="container-sm card" style="max-width: 540px;margin-top: 10%; padding: 10px">
	<h2>Cadastro de Produtos</h2>
    <form>
	  <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">Codigo</label>
	    <input type="number" class="form-control" id="codigo" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">Descrição</label>
	    <input type="text" class="form-control" id="descricao">
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">Valor R$</label>
	    <input type="number" class="form-control" id="valor">
	  </div>
	  
	  <button id="submit" type="button" class="btn btn-primary">Submit</button>
	</form>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function(){
			// Previne o envio do formulário e executa o AJAX ao clicar no botão
			$("#submit").click(function(event){
				// Impede o envio tradicional do formulário
				event.preventDefault();

				// Coleta os dados dos campos
				var codigo = $("#codigo").val();
				var descricao = $("#descricao").val();
				var valor = $("#valor").val();

				// Envia os dados via AJAX
				$.post("/Product_Servlet/product", 
					{
						codigo: codigo,
						descricao: descricao,
						valor: valor
					}, 
					function(data, status){
						// Exibe a resposta
						alert("Produto cadastrado: " + data );
					}
				);
			});
		});
	</script>

</body>
</html>