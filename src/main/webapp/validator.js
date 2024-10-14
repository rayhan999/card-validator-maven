document.getElementById("cardForm").addEventListener("submit", function (event) {
    event.preventDefault();  // Prevent form from submitting normally

    let cardNumber = document.getElementById("cardNumber").value;
    let expDate = document.getElementById("expDate").value;
    let query = "cardNumber=" + encodeURIComponent(cardNumber) + "&expDate=" + encodeURIComponent(expDate);

    // Define the callback function
    function handleResponse(responseText) {
        let jsonResponse = JSON.parse(responseText);
        document.getElementById("result").innerHTML = jsonResponse.message;
    }

    // Call the doAjax function from your library
    doAjax("validateCard", query, "handleResponse", "post");
});


function cardValidator()
{
	let cardNumber = document.getElementById("cardNumber").value;
	let expDate = document.getElementById("expDate").value;
	
	var q_str ="cardNumber=" + cardNumber + "&expDate=" + expDate;
	let query = "cardNumber=" + encodeURIComponent(cardNumber) + "&expDate=" + encodeURIComponent(expDate);
	doAjax('CreditCardValidationServlet',q_str,'convertNumber_back','post',0);
	
}

function convertNumber_back(result)
{
	console.log('result', result)
	window.document.getElementById('result').innerHTML=""+result;
	
}