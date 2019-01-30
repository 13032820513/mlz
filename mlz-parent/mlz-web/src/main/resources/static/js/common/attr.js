var attr = {
    rootNode: {}
};

//图片参数压缩
function formAddFile(fileList, listIndex, formData, callback) {
    if (fileList.length == 0) {
        return callback();
    }
    //图片压缩
    Feng.compressImage(fileList[listIndex], false, function (file) {
        formData.append("attrImg", file);
        listIndex++;
        if (listIndex >= fileList.length) {
            return callback();
        } else {
            // formAddFile(listIndex,callback);
            formAddFile(fileList, listIndex, formData, callback);
        }
    });
}

var addAttr = function (obj, attr) {
    var item = $('<div class="form-group col-sm-12 attr_data_item">\n' +
        '                                <div class="form-group col-sm-4 attr-margin-top">\n' +
        '                                    <label>新增' + attr + '</label>\n' +
        '                                    <input  name="attrName" type="text" class="attr_name form-control" placeholder="请输入' + attr + '名称">\n' +
        '                                </div>\n' +
        '                                <div class="form-group col-sm-4 attr-margin-top attr-margin-left">\n' +
        '                                    <div class="attr_img_div">\n' +
        '                                       <img class="attr-img" src="' + Feng.ctxPath + '/static/img/timg.png" onclick="imgClick(this)"><i></i>\n' +
        '                                    </div>\n' +
        '                                    <input name="attrImg" type="file" class="attr_img_file" onchange="fileChange(this)" accept="image/*"/>\n' +
        '                                </div>\n' +
        '                                <button type="button"  class="btn btn-outline btn-danger attr-button-position" onclick="delAttr(this)">删除</button>\n' +
        '                            </div>\n' +
        '                            <div class="hr-line-dashed"></div>');
    $(obj).parent().before(item);
    $(item).find(".attr_img_div i").hide();
}
var delAttr = function (obj) {
    var box = $(obj).parents('.attr_box_div');
    var rootNode = $(obj).parents(".attr_list");
    var attrId = $(obj).parents(".attr_list").attr("attr_id");
    var parent = $(obj).parent();
    var next = $(obj).parent().next();
    $(next).remove();
    $(parent).remove();
    var length = $(rootNode).find(".attr_data_item").length;
    if (length == 0) {
        $(rootNode).remove();
        $(box).find(".checkbox_list").find("label").each(function () {
            var input = $(this).find("input");
            if ($(input).attr("attr_id") == attrId) {
                $(input).attr("checked", false);
                $(input).parent().removeClass("checked");
            }
        });
    }
    ;
}
var fileChange = function (obj) {
    if (obj.files.length == 0) {
        layer.msg("请选择图片");
        $(obj).prev().find("img").attr("src", Feng.ctxPath + '/static/img/timg.png');
        $(obj).attr("name", "attrImg");
        removeMagnifyClickEvent($(obj).parent().find(".attr_img_div i"));
        return false;
    }
    var reg_img = /image+\/(jpg|jpeg|gif|bmp|png)$/;
    if (!reg_img.test(obj.files[0].type)) {
        layer.msg("请选择有效的图片文件");
        $(obj).prev().find("img").attr("src", Feng.ctxPath + '/static/img/timg.png');
        $(obj).attr("name", "attrImg");
        removeMagnifyClickEvent($(obj).parent().find(".attr_img_div i"));
        return false;
    }
    var fileSize = 0;
    fileSize = obj.files[0].size;
    var size = fileSize / 1024 / 1024;
    if (size > Feng.imgFileSize) {
        obj.value = null;
        layer.msg("图片不能大于" + Feng.imgFileSize + "M");
        $(obj).prev().find("img").attr("src", Feng.ctxPath + '/static/img/timg.png');
        $(obj).attr("name", "attrImg");
        removeMagnifyClickEvent($(obj).parent().find(".attr_img_div i"));
        return false;
    } else {
        //图片预览
        var file = obj.files[0];
        var reader = new FileReader();
        reader.onload = function (e) {
            $(obj).parent().find("img").attr("src", e.target.result);
            // $(obj).parent().find(".attr_img_div i").show();
            addMagnifyClickEvent($(obj).parent().find(".attr_img_div i"));
        }
        reader.readAsDataURL(file)
    }
}
var imgClick = function (obj) {
    $(obj).parent().next().click();
}
var magnifyClick = function (obj) {
    Feng.imagePreview($(obj).prev());
    // var nImg = new Image();
    // nImg.onload = function () {
    //     var w = nImg.width;
    //     var h = nImg.height;
    //     parent.layer.open({
    //         type: 1
    //         , title: false
    //         , closeBtn: 0
    //         , offset: 'auto'
    //         , area: [w + 'px', h + 'px']
    //         , shadeClose: true
    //         , content: '<img src="' + src + '" >'
    //         , scrollbar: false
    //         , fixed: false
    //     });
    // }
    // nImg.src = src;
}
var addMagnifyClickEvent = function (obj) {
    $.each(obj, function () {
        $(this).show();
        $(this).bind("click", function () {
            magnifyClick(this);
        });
    })
}
var removeMagnifyClickEvent = function (obj) {
    $.each(obj, function () {
        $(this).hide();
        $(this).unbind();
    })
}
attr.InitAttr = function (rootNode, selectNode) {
    this.rootNode = rootNode;
    addMagnifyClickEvent($(".attr_img_div i"))
    $(rootNode).find(".attr_check").on("click", function () {
        var $this = $(this).find("input");
        var attr = $($this).attr("attr");
        var attr_id = $($this).attr("attr_id");
        var isChecked = $($this).is(':checked');
        //${ctxPath}/static/img/1543827771689_1.png
        var item = $('\n' +
            '                    <div class="col-sm-12 attr_list" attr_id="' + attr_id + '" attr="' + attr + '">\n' +
            '                        <div class="form-group col-sm-2"></div>\n' +
            '                        <div class="form-group col-sm-10 attr-box-div">\n' +
            '                            <div class="form-group col-sm-12 attr_data_item">\n' +
            '                                <div class="form-group col-sm-4 attr-margin-top">\n' +
            '                                    <label>新增' + attr + '</label>\n' +
            '                                    <input name="attrName" type="text" class="attr_name form-control" placeholder="请输入' + attr + '名称">\n' +
            '                                </div>\n' +
            '                                <div class="form-group col-sm-4 attr-margin-top attr-margin-left">\n' +
            '                                    <div class="attr_img_div">\n' +
            '                                       <img class="attr-img" src="' + Feng.ctxPath + '/static/img/timg.png" onclick="imgClick(this)"><i></i>\n' +
            '                                    </div>\n' +
            '                                    <input name="attrImg" type="file" class="attr_img_file" onchange="fileChange(this)" accept="image/*"/>\n' +
            '                                </div>\n' +
            '                                <button type="button" class="btn btn-outline btn-danger attr-button-position" onclick="delAttr(this)">删除</button>\n' +
            '                            </div>\n' +
            '                            <div class="hr-line-dashed"></div>\n' +
            '                            <div>\n' +
            '                                <label>操作</label>\n' +
            '                                <button type="button" class="btn btn-outline btn-primary pull-right" onclick="addAttr(this,\'' + attr + '\')">新增一条</button>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>');
        if (!isChecked) {
            $(rootNode).append(item);
            $(item).find(".attr_img_div i").hide();
        } else {
            $(rootNode).find(".attr_list").each(function () {
                var a = $(this).attr("attr");
                if (attr == a) {
                    $(this).remove();
                    return;
                }
            });
        }
    });
    this.AttrClick(selectNode, rootNode);
    return this;
}
attr.AttrClick = function (selectNode, attrNode) {
    $(selectNode).on("change", function () {
        var productId = $(this).val();
        if (productId != 0) {
            $(attrNode).show();
            $(attrNode).find(".checkbox_list").find("label").each(function () {
                var attrPid = $(this).attr("productId");
                var attrId = $(this).find("input").attr("attr_id");
                if (productId == attrPid) {
                    $(this).show();
                    $(attrNode).find(".attr_list").each(function () {
                        var attr_id = $(this).attr("attr_id");
                        if (attr_id == attrId) {
                            $(this).show();
                        }
                    });
                } else {
                    $(this).hide();
                    $(attrNode).find(".attr_list").each(function () {
                        var attr_id = $(this).attr("attr_id");
                        if (attr_id == attrId) {
                            $(this).hide();
                        }
                    });
                }
            });
        } else {
            $(attrNode).hide();
        }
    });
}

var attrMgr = {
    Init: function (rootNode, selectNode) {
        var t = {};
        $.extend(t, attr);
        return t.InitAttr(rootNode, selectNode);
    }
};