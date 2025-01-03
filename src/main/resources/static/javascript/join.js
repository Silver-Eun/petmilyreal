"use strict"

function Joinf() {
	let url = "user/Joinf";
	axios.get(url
	).then(response => {
		document.getElementById('resultArea1').innerHTML = response.data;
	}).catch(err => {
		alert("회원가입 페이지 불러오기 실패 => " + err.message);
	});

	document.getElementById('resultArea1').innerHTML = "";
}


function Join() {
    event.preventDefault();

    let formData = new FormData(document.getElementById('joinform'));

    let firstPart = document.getElementsByName("user_phone1")[0].value;
    let secondPart = document.getElementsByName("user_phone2")[0].value;
    let thirdPart = document.getElementsByName("user_phone3")[0].value;

    let formattedPhoneNumber = `${firstPart}-${secondPart}-${thirdPart}`;

    formData.append('user_phone', formattedPhoneNumber);


    let url = "/api/user/join";
    axios.post(url, formData, {
        headers: { "Content-Type": "multipart/form-data" }
    }).then(response => {
        alert(`response.data : ${response.data}`);
        userForm();
    }).catch(err => {
        if (err.response.status === 502) alert("입력 오류");
        else alert("시스템 오류 => " + err.message);
    });

    document.getElementById('newPage').innerHTML = "";
}