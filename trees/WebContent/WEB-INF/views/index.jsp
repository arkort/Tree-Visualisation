<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Epam Trees</title>
<link rel="stylesheet" href="./css/main.css" type="text/css">

<script type="text/javascript">
	window.onload = draw;

	function draw() {
		var canvas = document.getElementById('canvas');
		if (canvas.getContext) {
			var context = canvas.getContext('2d');
			drawFractalTree(context);
			animation(context);
		} else {
			alert("HTML5 Canvas isn't supported by your browser!");
		}
	}

	function drawFractalTree(context) {

		drawTree(context, 800, 800, -90, 11);
	}

	function drawTree(context, x1, y1, angle, depth) {

		var BRANCH_LENGTH = random(0, 20);
		var oldData = [];

		if (depth != 0) {
			var x2 = x1 + (cos(angle) * depth * BRANCH_LENGTH);
			var y2 = y1 + (sin(angle) * depth * BRANCH_LENGTH);

			drawLine(context, x1, y1, x2, y2, depth);
			drawTree(context, x2, y2, angle - random(15, 20), depth - 1);
			drawTree(context, x2, y2, angle + random(15, 20), depth - 1);
		}
	}

	function drawLine(context, x1, y1, x2, y2, thickness) {
		context.fillStyle = '#000';
		if (thickness > 6)
			context.strokeStyle = 'rgb(139,126, 102)'; //Brown		
		else
			context.strokeStyle = 'rgb(34,139,34)'; //Green

		context.lineWidth = thickness * 1.5;
		context.beginPath();

		context.moveTo(x1, y1);
		context.lineTo(x2, y2);

		context.closePath();
		context.stroke();
	}

	function cos(angle) {
		return Math.cos(deg_to_rad(angle));
	}

	function sin(angle) {
		return Math.sin(deg_to_rad(angle));
	}

	function deg_to_rad(angle) {
		return angle * (Math.PI / 180.0);
	}

	function random(min, max) {
		return min + Math.floor(Math.random() * (max + 1 - min));
	}
	function animation(context) {
		// 		setInterval(function(){
		// 			drawTree(context, 800, 800, -90, 11);
		// 		}, 1000);
	};
</script>
<script type="text/javascript">
	function saveProfile(){
		$.ajax({
			type : "POST",
			url : "./saveProfile",
			data : {
				name : "John",
				location : "Boston"
			}
		}).done(function(msg) {
			alert("Profile Saved");
		});
	}
	function getAllProfiles() {
		$.ajax({
			type : "GET",
			url : "./getAllProfiles",
			data : {
				name : "John",
				location : "Boston"
			}
		}).done(function(msg) {
			alert(msg);
		});
	}
</script>
</head>
<body>
	<div id="header">
		<h1>Epam Trees</h1>
		<ul style="list-style: none; float: left;">
			<li style=""><a onclick="saveProfile()" href="javascript:void(0)">Youe Own Tree</a></li>
			<li style=""><a onclick="getAllProfiles()" href="javascript:void(0)">Epam Forest</a></li>
		</ul>
	</div>
	<canvas id="canvas" width="1500" height="800"></canvas>
	<dir id="footer"></dir>
</body>
<script type="text/javascript" src="./js/lib/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="./js/lib/knockout-3.0.0.js"></script>
<script type="text/javascript" src="./js/main.js"></script>
</html>