let loginBtn = document.querySelector("#loginBtn");
loginBtn.onclick = (e) => {
	 e.preventDefault();
	 loginCheck();
}
function loginCheck() {
	fetch('/user/login', {
	       //option
	       method : 'POST',
	       headers: {
	           'Content-Type': 'application/json;charset=utf-8'
	       },
	       body: JSON.stringify({
	    	   "uid" : uid.value,
	    	   "pwd" : pwd.value
	       })
	    })
	    .then(response => response.json())
	    .then(Json => {
	       //처리후 메시지 출력
    	   alert(Json.message);
    	   location.href = Json.url;


	    });

}



