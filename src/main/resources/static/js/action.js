function validateForm() {
    var x = document.forms["searchForm"]["productSearchTxt"].value;
    var letters = /^[A-Za-z]+$/;
    alert("Only letters and white space allowed");
    if(!x.value.match(letters))
        alert("Only letters and white space allowed");
}