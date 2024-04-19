<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil - Sunset Paradise Hotel</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: Violet;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background-color: #0056b3;
            
            
        }
        ///////////////////////////////////////////
        
        * {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	text-decoration: none;
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

:root {
	/* COLORS */
	--light-color: #FFFFFF;
	--dark-color: #121E3D;
	--bleu-color: pink;
	--red-color: #E23229;
	--grenn-color: #21ADC5;
	--gry-color: #C3BFBC;
	--lightless-color: #EBF2F4;
}

body {
	width: 100%;
	height: auto;
	background-color: var(--lightless-color);
	color: var(--dark-color);
}

/* HEADER */
header {
	background-color: var(--bleu-color);
	color: var(--light-color);
	padding: 15px 20px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

header img {
	max-width: 100px;
	height: auto;
}

.navbar-nav {
	display: flex;
	flex-direction: row;
	color: var(--bleu-color);
	gap: 50px;
	text-align: center;
}

.navbar-nav .nav-item .nav-link {
	text-decoration: none;
	color: var(--light-color);
}

.navbar-nav .nav-item .nav-link:hover {
	color: var(--gry-color);
}

.search-container {
	display: flex;
}

.search-container input[type="text"] {
	padding: 8px;
	border-radius: 5px;
	border: 1px solid #ccc;
	margin-right: 10px;
	width: 250px;
}

.btn-search {
	max-width: 200px;
	padding: 7px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	color: var(--light-color);
	background-color: var(--bleu-color);
	transition: background-color 0.3s;
}

.btn-search:hover {
	background-color: var(--grenn-color);
}

header .logo {
	display: flex;
	align-items: center;
}

/* HOME */
.container-fluid-one {
	background-image:
		url(https://bp-prod.cloudimg.io/_images_/app/uploads/sites/5/2023/07/12183503/herodesktop-professionnels-bp-dossier-creation-entreprise.jpg?func=crop&w=1920&h=720&gravity=auto&optipress=2);
	background-position: center;
	background-size: cover;
	background-repeat: no-repeat;
	width: 100%;
	min-height: 590px;
	padding: 40px;
	background-color: #fff;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
	text-align: start;
}

p {
	color: var(--light-color);
	width: 42%;
	font-size: 16px;
	line-height: 1.5;
}

.button-container {
	margin-top: 30px; max-width : 300px;
	padding: 15px 25px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	color: var(--light-color);
	background-color: var(--red-color);
	transition: background-color 0.3s;
	max-width: 300px;
}

.button-container a {
	text-decoration: none;
	color: var(--light-color);
}

.button-container:hover {
	background-color: var(--grenn-color);
}

/* DISPLAY */
.container-fluid-two {
	width: 100%;
	min-height: 580px;
	background-color: var(--light-color);
	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
	padding: 20px;
	border-radius: 8px;
}

h1, h2 {
	text-align: center;
	 color: #333;
	margin-bottom: 20px;
}

table {
	max-width: 90%;
	border: 1px solid var(--dark-color);
	margin-bottom: 20px;
}

td {
	padding: 12px;
	text-align: left;
	border: 1px solid var(--dark-color);
}

th {
	background-color: var(--lightless-color);
	color: var(--dark-color);
	text-align: centre;
	padding: 20px;
	border: 1px solid var(--dark-color);
}

.button-containerr {
	display: flex;
	justify-content: space-evenly;
	align-items: centre;
	gap: 10px;
}

input[type="text"], input[type="email"] {
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ddd;
	border-radius: 4px;
	box-sizing: border-box;
	width: 100%;
}

.btn-line {
	border: none;
	color: var(--light-color);
	background-color: none;
}

.btn-search, .btn-delete, .btn-update, .btn-add, .btn-save {
	max-width: 200px;
	padding: 7px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	color: var(--light-color);
	background-color: var(--bleu-color);
	transition: background-color 0.3s;
}

.btn-delete:hover {
	background-color: var(--red-color);
}

.btn-search:hover, .btn-add:hover, .btn-save:hover, .btn-update:hover {
	background-color: var(--grenn-color);
}

.form-container {
	min-width: 50%;
	padding: 20px;
	background-color: #f8f9fa;
	border-radius: 10px;
}

.form-container label {
	font-weight: bold;
}

/* FOOTER */
footer {
	background-color: var(--bleu-color);
	color: var(--light-color);
	text-align: center;
        
    </style>
</head>
<body>

<header>
		<div class="logo">
			<img src="https://cdn.pixabay.com/photo/2017/03/19/20/19/ball-2157465_1280.png" alt="hotel Logo" width="70px">
			<h4>Sunset Hotel</h4>
		</div>
		<nav>
			<ul class="navbar-nav mb-0 d-flex">
				<li class="nav-item"><a class="nav-link" href="/Home"><i
						class="fas fa-home me-2"></i>Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="employees?action=display"><i class="fas fa-users me-2"></i>Search Rooms</a></li>
				<li class="nav-item"><a class="nav-link"
					onclick="showAddForm()"><i class="fas fa-user-plus me-2"></i>Make Reservation
						</a></li>
			</ul>
		</nav>
		<div class="search-container">
			<form action="Home" method="get">
				<input type="hidden" name="action" value="search"> 
				<input type="text" name="searchValue" placeholder="Search...">
				<button class="btn-search" type="submit">
					<i class="fas fa-search me-2 tw-4"></i>
				</button>
			</form>
		</div>
	</header>
    <div class="container">
        <h1>Welcome to Sunset Paradise Hotel</h1>
        <p>Find the perfect room for your next vacation.</p>
        <div style="text-align: center;">
        
            <a href="Rooms.jsp" class="btn">Search Rooms</a>
            <a href="Reserverroom.jsp" class="btn">Make Reservation</a>
            <a href="view-reservations.jsp" class="btn">View Reservations</a>
        </div>
    </div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Type</th>
            <th>Prix</th>
             <th>Equipement</th>
             <th>Disponibilite</th>

        </tr>
        <c:forEach var="room" items="${rooms}">
            <tr>
                <td>${room.getIdroom()}</td>
                <td>${room.getroomtype()}</td>
                <td>${room.getprice()}</td>
                <td>${room.getdispo()}</td>
                <td>${room.getEquipement()}</td>

            </tr>
        </c:forEach>
    </table>
    
    
    <footer>
		<section class="p-1">
			<div class="d-flex gap-5 align-items-center">
				<div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
					<h6 class="text-uppercase  fw-bold fs-5">
						<img src="https://cdn.pixabay.com/photo/2017/03/19/20/19/ball-2157465_1280.png"
							width="70px" alt="logo" />
							Sunset Hotel
					</h6>

				</div>
				<div class="col-md-4 col-lg-4 text-center text-md-centre">
					<div class="p-2">
						&copy; 2024 Copyright: <a class="text-white" href="/Home">C
							Company.</a> All Rights Reserved.
					</div>
				</div>
				<div class="col-md-3 col-lg-3 ml-lg-3 text-center text-md-centre">
					<a class="btn btn-outline-light btn-floating m-1" href="#"
						role="button"><i class="fab fa-facebook-f"></i></a> <a
						class="btn btn-outline-light btn-floating m-1" href="#"
						role="button"><i class="fab fa-twitter"></i></a> <a
						class="btn btn-outline-light btn-floating m-1" href="#"
						role="button"><i class="fab fa-google"></i></a> <a
						class="btn btn-outline-light btn-floating m-1" href="#"
						role="button"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</section>
	</footer>
    <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
