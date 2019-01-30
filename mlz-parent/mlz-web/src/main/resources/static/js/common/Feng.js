var Feng = {
    ctxPath: "",
    imgFileSize: 10,//文件大小限制 单位 MB
    imgFileNum: 10,//商品能够上传几张图片
    addCtx: function (ctx) {
        if (this.ctxPath == "") {
            this.ctxPath = ctx;
        }
    },
    confirm: function (tip, ensure) {//询问框
        parent.layer.confirm(tip, {
            btn: ['确定', '取消']
        }, function (index) {
            ensure();
            parent.layer.close(index);
        }, function (index) {
            parent.layer.close(index);
        });
    },
    log: function (info) {
        console.log(info);
    },
    alert: function (info, iconIndex) {
        parent.layer.msg(info, {
            icon: iconIndex
        });
    },
    info: function (info) {
        Feng.alert(info, 0);
    },
    success: function (info) {
        Feng.alert(info, 1);
    },
    error: function (info) {
        Feng.alert(info, 2);
    },
    infoDetail: function (title, info) {
        var display = "";
        if (typeof info == "string") {
            display = info;
        } else {
            if (info instanceof Array) {
                for (var x in info) {
                    display = display + info[x] + "<br/>";
                }
            } else {
                display = info;
            }
        }
        parent.layer.open({
            title: title,
            type: 1,
            skin: 'layui-layer-rim', //加上边框
            area: ['950px', '600px'], //宽高
            content: '<div style="padding: 20px;">' + display + '</div>'
        });
    },
    writeObj: function (obj) {
        var description = "";
        for (var i in obj) {
            var property = obj[i];
            description += i + " = " + property + ",";
        }
        layer.alert(description, {
            skin: 'layui-layer-molv',
            closeBtn: 0
        });
    },
    showInputTree: function (inputId, inputTreeContentId, leftOffset, rightOffset) {
        var onBodyDown = function (event) {
            if (!(event.target.id == "menuBtn" || event.target.id == inputTreeContentId || $(event.target).parents("#" + inputTreeContentId).length > 0)) {
                $("#" + inputTreeContentId).fadeOut("fast");
                $("body").unbind("mousedown", onBodyDown);// mousedown当鼠标按下就可以触发，不用弹起
            }
        };

        if (leftOffset == undefined && rightOffset == undefined) {
            var inputDiv = $("#" + inputId);
            var inputDivOffset = $("#" + inputId).offset();
            $("#" + inputTreeContentId).css({
                left: inputDivOffset.left + "px",
                top: inputDivOffset.top + inputDiv.outerHeight() + "px"
            }).slideDown("fast");
        } else {
            $("#" + inputTreeContentId).css({
                left: leftOffset + "px",
                top: rightOffset + "px"
            }).slideDown("fast");
        }

        $("body").bind("mousedown", onBodyDown);
    },
    baseAjax: function (url, tip) {
        var ajax = new $ax(Feng.ctxPath + url, function (data) {
            Feng.success(tip + "成功!");
        }, function (data) {
            Feng.error(tip + "失败!" + data.responseJSON.message + "!");
        });
        return ajax;
    },
    changeAjax: function (url) {
        return Feng.baseAjax(url, "修改");
    },
    zTreeCheckedNodes: function (zTreeId) {
        var zTree = $.fn.zTree.getZTreeObj(zTreeId);
        var nodes = zTree.getCheckedNodes();
        var ids = "";
        for (var i = 0, l = nodes.length; i < l; i++) {
            ids += "," + nodes[i].id;
        }
        return ids.substring(1);
    },
    eventParseObject: function (event) {//获取点击事件的源对象
        event = event ? event : window.event;
        var obj = event.srcElement ? event.srcElement : event.target;
        return $(obj);
    },
    sessionTimeoutRegistry: function () {
        $.ajaxSetup({
            contentType: "application/x-www-form-urlencoded;charset=utf-8",
            complete: function (XMLHttpRequest, textStatus) {
                //通过XMLHttpRequest取得响应头，sessionstatus，
                var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus");
                if (sessionstatus == "timeout") {
                    //如果超时就处理 ，指定要跳转的页面
                    window.location = Feng.ctxPath + "/global/sessionError";
                }
            }
        });
    },
    initValidator: function (formId, fields) {
        $('#' + formId).bootstrapValidator({
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: fields,
            live: 'enabled',
            message: '该字段不能为空'
        });
    },
    underLineToCamel: function (str) {
        var strArr = str.split('_');
        for (var i = 1; i < strArr.length; i++) {
            strArr[i] = strArr[i].charAt(0).toUpperCase() + strArr[i].substring(1);
        }
        var result = strArr.join('');
        return result.charAt(0).toUpperCase() + result.substring(1);
    },
    dataURLtoFile: function (dataurl, filename) {//将base64转换为文件
        var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
            bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
        while (n--) {
            u8arr[n] = bstr.charCodeAt(n);
        }
        return new File([u8arr], filename, {type: mime});
    },
    imagePreview:function (img) {
        var w = $(img)[0].naturalWidth;
        var h = $(img)[0].naturalHeight;
        var src = $(img).attr("src");
        parent.layer.open({
            type:1
            ,title:false
            ,closeBtn:0
            ,offset:'auto'
            ,area:[w + 'px', h + 'px']
            ,shadeClose:true
            ,content:'<img src="'+src+'" >'
            ,scrollbar:false
            ,fixed:false
        });
    },
    compressImage: function (file, isWebupload,callback) {
        var reader = new FileReader();
        var maxWidth = 2000;
        var fileName = file.name.substring(0, file.name.lastIndexOf("."));
        reader.onload = function (ev) {
            var img = new Image();
            img.onload = function () {
                // 不要超出最大宽度
                var w = Math.min(maxWidth, img.width);
                // 高度按比例计算
                var h = img.height * (w / img.width);
                var canvas = document.createElement('canvas');
                var ctx = canvas.getContext('2d');
                // 设置 canvas 的宽度和高度
                canvas.width = w;
                canvas.height = h;
                ctx.fillStyle = "#fff";
                ctx.fillRect(0, 0, canvas.width, canvas.height);
                ctx.drawImage(img, 0, 0, w, h);
                var fileSize = file.size;
                //设置图片压缩比例
                var qualify = 1;
                if (fileSize < 50) {
                    qualify = 1;
                } else if (fileSize > 1024) {
                    qualify = 0.5;
                } else {
                    qualify = 0.6
                }
                // var base64 = canvas.toDataURL(fileType, qualify);
                var base64 = canvas.toDataURL("image/jpeg", qualify);
                var toFile = Feng.dataURLtoFile(base64, fileName + ".jpeg");
                // file = new WebUploader.File(toFile);
                file.name = toFile.name;
                file.size = toFile.size;
                if (isWebupload === true) {
                    file.source.name = toFile.name;
                    file.source.size = toFile.size;
                    file.source.source = toFile;
                }else{
                    callback(toFile);
                }
                // var strLen = base64.length;
                // console.log(toFile)
                // console.log("图片类型为" + file.type + "图片的初始size=" + fileSize + "压缩比例为=" + qualify + "压缩后的大小为=" + (strLen - (strLen / 8) * 2));
                // img.remove();
            };
            img.src = ev.target.result;
        };
        if (isWebupload === true) {
            reader.readAsDataURL(file.source.source);
        }else{
            reader.readAsDataURL(file);
        }
    }
};
