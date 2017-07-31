/**
 * Created by 28223 on 2017/7/31.
 */

function  checkRegister() {

   $.ajax({
       url:"StudentRegister",
       type:"post",
       data:{"regusername":$("#regusername").val()},
       dataType:"json",
       success:function (value) {
         if (value.studentInformation!=null){

             $("#regnamemessage").html("账户已存在")
         }
         else
             $("#regnamemessage").html("可用")
       }
   }) ;
}
function  enterPassword() {
   var regpassword=$("input[name='regpassword']").val();
    var regpasswordenter=$("input[name='regpasswordenter']").val();
    if (regpassword!=regpasswordenter){
        $("#regpasswordmessage").html("<p style='color: red'>前后不一致</p>")
    }
    else
        $("#regpasswordmessage").html("<p style='color: green'>可用</p>")
}
/*$(function () {
    if ($("#reguser").text().length>0){
        if($("#regresult").text().length>0){
            $("#registerForm").modal();
            $("#regnamemessage").html("账户已存在")
            $("input[name='regusername']").val("")
            $("input[name='regpassword']").val("")
            $("input[name='regpasswordenter']").val("")
        }

    }

})*/
