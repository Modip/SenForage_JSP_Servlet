<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Sen Forage</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.13.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
        <!-- Third party plugin CSS-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="./public/css/styles.css" rel="stylesheet" />
    </head>
    <body id="page-top">
        
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top"> Sen Forage</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto my-2 my-lg-0">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="http://localhost:8080/SenForage/AddClient">Ajouter un Client</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="http://localhost:8080/SenForage/EditClient">Modifier un Client</a></li>
                     </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead">
            <div class="container h-100">
                <div class="row h-100 align-items-center justify-content-center text-center">
                    <div class="col-lg-10 align-self-end">
                        <h2 class="text-uppercase text-white font-weight-bold">Sen Forage vous souhaite la bienvenue</h2>
                        <hr class="divider my-4" />
                    </div>
                    <div class="col-lg-8 align-self-baseline">
                        <p class="text-white-75 font-weight-light mb-5">Vous fournir de l'eau est notre priorite!</p>
                        
		              <section>
		          
						<form method="post" action="AddClient">
							<div class="form-group">
								<select name = "village_id">
									<option> Choisir village </option>
		
									<c:forEach items="${list_village}" var="village">
									<option value="${village.id}">${village.nom}</option>
		 							</c:forEach>
		
								</select>
		
							</div>
							
							<div class="form-group">
								<input type="text" name="prenom" id="prenom" placeholder="prenom">
							</div>
						
							<div class="form-group">
								<input type="text" name="nom" id="nom" placeholder="nom">
							</div>
						
							<div class="form-group">
								<input type="text" name="adresse" id="adresse" placeholder="adresse">
							</div>
		
							<div class="form-group">
								<input type="text" name="telephone" id="telephone" placeholder="telephone">
							</div>

							<div class="btn btn-xl js-scroll-trigger" >
								<button type="submit" name="submit" > Ajouter </button>
							</div>

							</form>
						</section>
                   
                    </div>
                </div>
            </div>
        </header>
            <footer class="bg-light py-5">
            <div class="container">
            <div class="small text-center text-muted">
            Copyright © 2020 -Modip
            </div>
          </div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>  
 
</body>
</html>