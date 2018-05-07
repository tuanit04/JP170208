//Các xử lí kịch bản cho login.html

function checkValidLogin(fn){
	//Lấy thông tin đăng nhập
	var username = fn.txtUserName.value;
	var userpass = fn.txtUserPass.value;
	
	//Biến xác nhận sự hợp lệ cho giá trị
	
	var validUserName = true;
	var validUserPass = true;
	
	//Biến lưu trữ thông báo
	
	var message = "";
	
	//Kiểm tra tên đăng nhập
	
	if(username.trim() == "")
	{
		validUserName = false;
		message = "Thiếu tên đăng nhập vào hệ thống.";
	}
	else{
		username = username.trim();
		if(username.indexOf(" ") != -1){
			validUserName = false;
			message = "Tên đăng nhập không có dấu cách.";
		}
		else if(username.length > 50){
			validUserName = false;
			message = "Tên đăng nhập quá dài.";
		}
	//Kiểm tra mật khẩu
	
	if(userpass.trim() == ""){
		validUserPass = false;
		message += "\nThiếu mật khẩu đăng nhập.";
	}else{
		if(userpass.length<5){
			validUserPass = false;
			message += "\nMật khẩu không hợp lệ.";
		}
	}
	//Xuất thông báo nếu có
	if(message != ""){
		window.alert(message);
		if(!validUserName){
			fn.txtUserName.focus();
			fn.txtUserName.select();
		}else if(!validUserPass){
			fn.txtUserPass.focus();
			fn.txtUserPass.select();
		}
	}
	//Trả về kết quả kiểm tra
	
	return validUserName && validUserPass;
	

}