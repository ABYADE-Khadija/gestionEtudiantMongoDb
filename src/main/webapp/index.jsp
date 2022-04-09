<%@page import="java.util.ArrayList"%>
<%@page import="metier.SelectServices"%>
<%@page import="metier.Etudiant"%>
<%@page import="metier.Note"%>
<%ArrayList<Etudiant> etudiants = new ArrayList();
etudiants = SelectServices.AllStudents();%>
<!DOCTYPE html>
<head>
	<title>test</title>
	
	<link rel="stylesheet" type="text/css" href="tableau.css"  > 
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">	
	<script src="https://kit.fontawesome.com/dc70a27419.js" crossorigin="anonymous"></script>

</head>

<body  class="body" >
	<div id="tabDiv">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-10 offset-md-1 col-sm-10 offset-sm-1" >	
	<table class="table table-striped table-bordered table-hover table-sm table-responsive " >
		<thead class="thead-dark">
			<tr >
				<th><input type="checkbox" id="check"></th>
				<th>Code etudiant</th>
				<th>Nom complet</th>
				<th>Adresse</th>
				<th>date de naissance</th>
				<th>Notes</th>
				<th class="bg-danger">operations</th>
			</tr>
		</thead>
<%for (Etudiant e : etudiants) { %>
		<tbody class="">
			<tr class="trow">
				<td><input type="checkbox" class="check"></td>	
				<td class="code"><%=e.getNo_etud() %></td>
				<td class="nom"><%=e.getNom() %></td>
				<td class="adresse"><%=e.getAdresse()%></td>
				<td class="dat_nais"><%=e.getDat_nais()%></td>
				<td class="notes"><%=e.getNotes().toString()%></td>
				<td class="bg-danger"><i class="fas fa-user-edit mod"></i><i class="fas fa-trash supp"></i><i class="fas fa-eye afficherUser"></i></td>	
			</tr>	
		</tbody>
<%} %>
		</table>
		</div>
		</div>
		</div>
		</div>
		</body>
			