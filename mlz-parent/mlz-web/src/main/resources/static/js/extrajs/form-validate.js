/*  各表单的表单验证 */

$.validator.setDefaults({
    highlight: function (e) {
        $(e).closest(".form-group").removeClass("has-success").addClass("has-error")
    }, success: function (e) {
        e.closest(".form-group").removeClass("has-error").addClass("has-success")
    }, errorElement: "span", errorPlacement: function (e, r) {
        e.appendTo(r.is(":radio") || r.is(":checkbox") ? r.parent().parent().parent() : r.parent())
    }, errorClass: "help-block m-b-none", validClass: "help-block m-b-none"
}), $().ready(function () {
    var e = "<i class='fa fa-times-circle'></i> ";
    $("#adminForm").validate({
        rules: {
            account: {required: !0, minlength: 2},
            password: {required: !0, minlength: 5},
            rePassword: {required: !0, minlength: 5, equalTo: "#password"},
            phone: {required: !0, minlength: 11},
            role_id: {required: !0},
            email: {required: !0, email: !0},
            status: "required"
        },
        messages: {
            account: {required: e + "请输入您的用户名", minlength: e + "用户名必须两个字符以上"},
            password: {required: e + "请输入您的密码", minlength: e + "密码必须5个字符以上"},
            rePassword: {required: e + "请再次输入密码", minlength: e + "密码必须5个字符以上", equalTo: e + "两次输入的密码不一致"},
            phone: {required: e + "请输入手机号码", minlength: e + "手机号码长度有误"},
            role_id: {required: e + "请选择用户角色"},
            email: e + "请输入您的E-mail",
            status: {required: e + "请设置用户状态"}
        }
    }), $("#account").focus(function () {
        var account = $("#account").val();
        var id = $("#id").val();
        if (id == null || id == ""){//添加表单不存在id
            $.ajax({
                type: "GET",
                url: "/admin/check",
                data: {account:account},
                dataType: "json",
                success: function(data){
                    console.log(data);
                }

            });
        }
        // e && r && !this.value && (this.value = e + "." + r)
        //使用ajax校验用户名是否已经存在
    })
});