$.ajax({
    url: "https://www.datos.gov.co/resource/gt2j-8ykr.json",
    type: "GET",
    data: {
      "$limit" : 5000,
      "$$app_token" : "8MN5cWUibeUxx05DogJXXTTiV"
    }
}).done(function(data) {
  alert("Retrieved " + data.length + " records from the dataset!");
  console.log(data);
});