$(document).ready(function() {

	$("form").om("submit", function(event){
		event.preventDefault();
		event.stopPropagation();
		
		var searchTerm = $("input[name = 'search']").val();


	$("form").on("submit", function(event) {
		event.preventDefault();
		event.stopPropagation();
		
		var searchTerm = $("input[name='search']").val();

		
		$.ajax({
			url: "api/films",
			data: {
				search: searchTerm
			},
			type: "GET",
			dataType: "json"
		}).done(function(data){
			updateFilmList(data);

		}).fail(xhr,status,error){

		}).fail(function(xhr, status, error) {

			console.log(error);
		});
		
		
	});

});
function updateFilmList(films){
	var container = $("nav").next();
	container.empty();
	
	for(var i = 0; i < films.length; i++){
		var title = $("<h4>").text(films[i].title);
		var img = $("<img>").addClass("img-responsive").attr("src", "img/dvd_placeholder.png");
		var filmDiv = $("<div>").addClass("col-sm-4").addClass("col-md-3").addClass("film");
		filmDiv.appen(img).append(title);
	}


	
});

function updateFilmList(films) {
	var container = $("nav").next();
	container.empty();
	
	for (var i = 0; i < films.length; i++) {
		var title = $("<h4>").text(films[i].title);
		var img = $("<img>").addClass("img-responsive").attr("src", "img/dvd_placeholder.png");
		var filmDiv = $("<div>").addClass("col-sm-4").addClass("col-md-3").addClass("film");
		
		filmDiv.append(img).append(title);
		container.append(filmDiv);
	
	}

}



