/**
 * 
 */


	 document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("joinBt").disabled = true; // 회원가입 버튼 비활성화
    document.getElementById("email").focus();

    document.querySelectorAll(".inputField input").forEach(input => {
        input.addEventListener("focus", function () {
            this.classList.add("active");
            if (this.nextElementSibling) {
                this.nextElementSibling.classList.add("focus");
            }
        });

        input.addEventListener("blur", function () {
            if (this.value === '') {
                this.classList.remove("active");
                if (this.nextElementSibling) {
                    this.nextElementSibling.classList.remove("focus");
                }
            }
        });
    });

    let birthYear = document.getElementById("birthYear");
    let birthMonth = document.getElementById("birthMonth");

    birthYear.innerHTML = ""; // select 태그 안 비우기
    birthMonth.innerHTML = ""; // select 태그 안 비우기

    for (let i = 2024; i >= 1924; i--) {
        let option = document.createElement("option");
        option.value = i;
        option.textContent = i;
        if (i === 2005) {
            option.selected = true;
        }
        birthYear.appendChild(option);
    }

    let today = new Date();
    let month = today.getMonth() + 1; // 현재 월 가져오기
    for (let i = 1; i <= 12; i++) {
        let option = document.createElement("option");
        option.value = i;
        option.textContent = i;
        if (i === month) {
            option.selected = true;
        }
        birthMonth.appendChild(option);
    }

    function checkPasswordMatch() {
        let password = document.getElementById("password").value;
        let confirmPassword = document.getElementById("chk").value;
        let pwRes = document.getElementById("pwRes");
        let joinBt = document.getElementById("joinBt");

        if (password !== confirmPassword) {
            pwRes.textContent = "비밀번호가 일치 하지 않습니다.";
            pwRes.style.color = "red";
            joinBt.disabled = true;
        } else {
            pwRes.textContent = "비밀번호가 일치 합니다.";
            pwRes.style.color = "green";
            joinBt.disabled = false;
        }
    }

    document.querySelectorAll(".pwChk").forEach(input => {
        input.addEventListener("keyup", checkPasswordMatch);
        input.addEventListener("blur", function () {
            if (document.getElementById("password").value === '' && document.getElementById("chk").value === '') {
                document.getElementById("joinBt").disabled = true;
                document.getElementById("pwRes").textContent = '';
            }
        });
    });
});
