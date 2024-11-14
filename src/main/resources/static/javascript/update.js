"use strict"

function Userupdate(id) {
    let url = "/user/Updatef/" + id;

    axios.get(url)
        .then(response => {
            console.log("** 회원정보 수정 성공 **");
            document.getElementById('resultArea1').innerHTML = response.data;
        })
        .catch(err => {
            alert("** 회원정보 수정 실패 => " + err.message);
        });

    document.getElementById('resultArea1').innerHTML = "";
}