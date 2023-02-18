<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>Football Score Board</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/estilos.css' />" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link
	href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css"
	rel="stylesheet" />


<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<script
	src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container">
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
			data-target="#myModal">Start match</button>

		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog modal-lg">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">New match</h5>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<form method="post"
						action="${pageContext.request.contextPath}/addMatch">
						<div class="modal-body">
							<div class="form-group row">
								<div class="form-group col-md-4" style="text-align: right;">
									<label for="homeTeamSelect" class="col-form-label w-100">Select
										home team</label> <select class="form-control select2"
										id="homeTeamSelect" name="homeTeam">
										<c:forEach items="${countries}" var="option">
											<option value="${option}">${option}</option>
										</c:forEach>
									</select>
								</div>
								<div class="form-group col-md-3" style="text-align: center;">
									<label for="groupScoreSelect" class="col-form-label">Score</label>
									<div class="input-group" id="">
										<input type="text" readonly="true" 
											style="min-width: 28px; text-align: center;"
											class="form-control" name="homeTeamScore" id="homeTeamScoreSelect" value="0" /> <input
											type="text" readonly="true"
											style="min-width: 28px; text-align: center;"
											class="form-control"name="awayTeamScore" id="awayTeamScoreSelect" value="0" />
									</div>
								</div>
								<div class="form-group col-md-4">
									<label for="awayTeamSelect" class="col-form-label w-100">Select
										away team</label> <select name="awayTeam" class="form-control select2"
										id="awayTeamSelect">
										<c:forEach items="${countries}" var="option">
											<option value="${option}">${option}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<button type="submit" class="btn btn-primary">End match</button>
					</form>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
	</div>
	<div class="container" style="margin-top: 30px;">
		<h2>Score board summary</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Home team</th>
					<th>Home team score</th>
					<th>Away team score</th>
					<th>Away team</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${matches}" var="matchSummary">
				<tr>
					<td>${matchSummary.homeTeam}</td>
					<td>${matchSummary.homeTeamScore}</td>
					<td>${matchSummary.awayTeamScore}</td>
					<td>${matchSummary.awayTeam}</td>
				</tr>
			</c:forEach>
		
			</tbody>
		</table>

	</div>

</body>

<script>
	$(document).ready(function() {
		$('.select2').select2({
			width : '70%',
		});
	});
</script>
</html>