// Các xử lý kịch bản cho user.html
		
function generatePermis(){
	//Khai báo mảng quyền thực thi
	var permiss = new Array();
	permiss[0]="----Chọn quyền----";
	permiss[1]="Thành viên";
	permiss[2]="Tác giả";
	permiss[3]="Quản lý";
	permiss[4]="Quản trị";
	permiss[5]="Quản trị cấp cao";
	//Muc tiêu tăng tốc cho hệ thống
	var opt="<select name=\"slcPermiss\" onChange=\"refreshPermiss(this.form)\" >";
	
	for(var i=0;i<permiss.length;i++){
		opt+="<option value="+i+" >";
		opt+=permiss[i];
		opt+="</option>";
	
	}

	opt+="</select>";
	
	//In ra màn hình
	document.write(opt);
	
}

function generateRoles(){
	//Mảng vai trò
	var  roles=new Array();
	roles[0]="Người sử dụng";
	roles[1]="Chuyên mục bài viết";
	roles[2]="Thể loại bài viết";
	roles[3]="Bài viết";
	roles[4]="Hệ sản phẩm";
	roles[5]="Nhóm sản phẩm";
	roles[6]="Loại sản phẩm";
	roles[7]="Sản phẩm";
	roles[8]="Hóa đơn";
	roles[9]="Khách hàng";
	roles[10]="Lịch sử là việc";
	
	var role="<table cellspacing=0 >";
	for(var i=0; i<roles.length; i++){
		if(i%3==0){
			role+="<tr>";
		}
			role+="<td>";
			role+="<input type=\"checkbox\" id=chk"+i+" name=chks disabled />";
			role+="<label for=chk"+i+" >";
			role+=" Quản lý "+roles[i];
			role+="</label>";
			role+="</td>";
		
		if(i%3==2 || i==roles.length-1){
			role+="</tr>";
		}
	}

	role+="</table>";
	
	//In ra màn hình
	document.write(role);
}

function setCheckBox(fn, dis, check){
	
	//Duyệt các phần tử của form
	for(var i=0; i<fn.elements.length; i++){
		if(fn.elements[i].type == "checkbox" &&
			fn.elements[i].name == "chks") {
				
				fn.elements[i].disabled = dis;
				fn.elements[i].checked = check;
				
			}
	}

}
function refreshPermiss(fn){
	//Lấy giá trị quyền thực thi
	var permis= parseInt(fn.slcPermiss.value);
	
	if(permis==4 || permis==5){
		this.setCheckBox(fn, true, true);
	}else if(permis==3){
		this.setCheckBox(fn, false, true);
	}else if(permis==2){
		this.setCheckBox(fn, false, false);
	}else {
		this.setCheckBox(fn, true, false);
	}

}

function setFirstTime(fn){
	this.setCheckBox(fn, true, false);
	fn.reset();
}
function generateGender(fn){
	//Khai báo mảng giới tính
	var gender = new Array();
	gender[0]="------";
	gender[1]="Nam";
	gender[2]="Nữ";
	gender[3]="Nam -> Nữ";
	gender[4]="Nữ -> Nam";
	gender[5]="Nam không xác định";
	gender[6]="Nữ không xác định";
	var opt = "<select name=\"slcGender\">";
	for(var i=0;i<gender.length;i++){
		opt+="<option value="+i+" >";
		opt+=gender[i];
		opt+="</option>";
	}
	opt+="</select>";
	//In ra màn hình
	document.write(opt);
		
}
function checkPhoneNumber(fn){
	var phoneNumber = fn.txtPhone.value;
    var filter = /^[0-9-+]+$/;
    if (filter.test(phoneNumber)) {
        return true;
    }
    else {
        return false;
    }	
}
function checkDate(fn){
	var date = fn.txtBirthDay.value;
	var filter = /^\d{4}\-\d{1,2}\-\d{1,2}$/;
	if (filter.test(date)) {
        return true;
    }
    else {
        return false;
    }
}
function checkValidUser(fn){
	//Bài tập về nhà
	var accname = fn.txtAccName.value;
	var accpass = fn.txtAccPass.value;
	var accemail = fn.txtAccEmail.value;
	var accpermis  = parseInt(fn.slcPermiss.value);
	
	//BIến xác nhận sự hợp lệ
	var validAccName = true;
	var validAccPass = true;
	var validAccEmail = true;
	var validAccPermis = true;
	
	//Biến ghi nhận thông báo
	accname = accname.trim();
	if(accname == ""){
		validAccName = false;
		message = "Thiếu thông tin tên tài khoản";
	}else{
		if(accname.indexOf(" ")!=-1){
			validAccName = false;
			message = "Tên tài khoản yêu cầu không có dấu";
		}else{
			if(accname.length>100){
				validUserName = false;
				message = "Tên tài khoản quá dài.";
			}
		}
	}
	
	//Kiểm tra mật khẩu
	
	accpass = accpass.trim();
	if(accpass == ""){
		validAccPass = false;
		message += "\nThiếu mật khẩu cho tài khoản.";
	}else{
		if(accpass.length<6){
			validAccPass = false;
			message += "\nMật khẩu quá ngắn, cần lớn hơn";
		}
	}
	//Kiểm tra hộp thư
	accemail = accemail.trim();
	if(accemail == ""){
		validAccEmail = false;
		message += "\nThiếu hộp thư cho tài khoản.";
	}else{
		var pattern = /\w+@\w+[.]\w/;
		if(!accemail.match(pattern)){
			validAccEmail = false;
			message += "\nKhông đúng cấu trúc hộp thư.";
		}
	}
	//Kiểm tra với quyền thực thi Author và Manager;
	if(accpermis == 2 || accpermis == 3){
		for(var i = 0; i< fn.elements.length; i++){
			if(fn.elements[i].type == "checkbox" && 
			fn.elements[i].name == "cks"){
				if(fn.elements[i].checked){
					validAccPermis = true;
					break;
				}else{
					validAccPermis = false;
				}
			}
		}
	}
	if(!validAccPermis){
		message += "\nCần ít nhất 1 vai trò cho quyền";
	}
	
	//Xuất thông báo
	if(message != ""){
		window.alert(message);
		if(!validAccName){
			fn.txtAccName.focus();
			fn.txtAccName.select();
		}else if(!validAccPass){
			fn.txtAccPass.focus();
			fn.txtAccPass.select();
		}else if(!validAccEmail){
			fn.txtAccEmail.focus();
			fn.txtAccEmail.select();
		}else if(!validAccPermis){
			fn.slcPermiss.focus();
		}
	}
		return 	validAccName && validAccPass && validAccEmail && validAccPermis;
		
			
	
}



