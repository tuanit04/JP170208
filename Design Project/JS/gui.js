//Các xử lí kịch bản cho Layout.HTML

var def = "---Từ khóa ----";
var emp = "";

function setFirstTime(fn){
	//Sử dụng thuộc tính Value của đối tượng
	fn.txtKeyword.value = def;
}
function setKeyWord(fn, isClick){
	//Lấy giá trị trong ô text
	var value = fn.txtKeyword.value;
	if(isClick)
	{
		if(value.trim() == def){
			fn.txtKeyword.value = emp;
		}
	}
	else{
		if(value.trim() == emp){
			fn.txtKeyword.value = def;
		}
	}
}
function checkValidKeyWord(fn){
	var value = fn.txtKeyword.value;
	
	if(value.trim() == def  || value.trim() == emp){
		var message = "Hãy nhập từ khóa để tìm kiếm.";
		window.alert(message);
		fn.txtKeyword.focus();
		fn.txtKeyword.select();
	}
}
