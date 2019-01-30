//
// var BASE_URL = 'js/plugins/webuploader';
// var n;
var upload_image = {
    BASE_URL: 'js/plugins/webuploader',
    singleLimit: Feng.imgFileSize,
    fileNum: Feng.imgFileNum,
    server: "",
    id: "",
    filePicker: "",
    filePicker2: "",
    dndArea: "",
    node: {},
    finishAllCallback: {},
};
upload_image.delete = function (upload, file) {
    //如果不是已经存在的图片则直接删除
    if (typeof file.imgId == "undefined") {
        return void upload.removeFile(file.id, true);
    }
    $.ajax({
        url: Feng.ctxPath + "/upload/remove/" + file.imgId,
        type: "POST",
        contentType: false,
        processData: false,
        cache: false,
        success: function (rs) {
            if (rs.code == 200) {
                return void upload.removeFile(file);
            }
            return void layer.alert("删除失败" + rs.message);
        },
        error: function (err) {
            console.error(err);
            return void layer.alert("删除失败");
        }
    });
}
upload_image.uploadSuccess = function (upload, file) {
    if (typeof this.finishAllCallback == "undefined") {
        console.log("图片上传成功");
        return;
    }
    this.finishAllCallback(upload, file);
}
upload_image.compress = function (file) {
    Feng.compressImage(file, true);
}
upload_image.create = function () {
    var $this = this;

    function e(e) {
        var a = o('<li id="' + e.id + '"><p class="title">' + e.name + '</p><p class="imgWrap"></p><p class="progress"><span></span></p></li>'),
            s = o('<div class="file-panel"><span class="cancel">删除</span><span class="rotateRight">向右旋转</span><span class="rotateLeft">向左旋转</span></div>').appendTo(a),
            i = a.find("p.progress span"), t = a.find("p.imgWrap"), r = o('<p class="error"></p>'),
            d = function (e) {
                switch (e) {
                    case"exceed_size":
                        text = "文件大小超出";
                        break;
                    case"interrupt":
                        text = "上传暂停";
                        break;
                    default:
                        text = "上传失败，请重试"
                }
                r.text(text).appendTo(a)
            };
        "invalid" === e.getStatus() ? d(e.statusText) : (t.text("预览中"), n.makeThumb(e, function (e, a) {
            if (e) return void t.text("不能预览");
            var s = o('<img src="' + a + '">');
            t.empty().append(s)
        }, v, b), w[e.id] = [e.size, 0], e.rotation = 0), e.on("statuschange", function (t, n) {
            "progress" === n ? i.hide().width(0) : "queued" === n && (a.off("mouseenter mouseleave"), s.remove()), "error" === t || "invalid" === t ? (console.log(e.statusText), d(e.statusText), w[e.id][1] = 1) : "interrupt" === t ? d("interrupt") : "queued" === t ? w[e.id][1] = 0 : "progress" === t ? (r.remove(), i.css("display", "block")) : "complete" === t && a.append('<span class="success"></span>'), a.removeClass("state-" + n).addClass("state-" + t)
        }), a.on("mouseenter", function () {
            s.stop().animate({height: 30})
        }), a.on("mouseleave", function () {
            s.stop().animate({height: 0})
        }), a.find(".imgWrap").on("click", function () {
            // var src = $(this).find("img").attr("src");
            Feng.imagePreview($(this).find("img"));
        }), s.on("click", "span", function () {
            var a, s = o(this).index();
            switch (s) {
                case 0:
                    return $this.delete(n, e);
                case 1:
                    e.rotation += 90;
                    break;
                case 2:
                    e.rotation -= 90
            }
            x ? (a = "rotate(" + e.rotation + "deg)", t.css({
                "-webkit-transform": a,
                "-mos-transform": a,
                "-o-transform": a,
                transform: a
            })) : t.css("filter", "progid:DXImageTransform.Microsoft.BasicImage(rotation=" + ~~(e.rotation / 90 % 4 + 4) % 4 + ")")
        }), a.appendTo(l)
    }

    function a(e) {
        var a = o("#" + e.id);
        delete w[e.id], s(), a.off().find(".file-panel").off().end().remove()
    }

    function s() {
        var e, a = 0, s = 0, t = f.children();
        o.each(w, function (e, i) {
            s += i[0], a += i[0] * i[1]
        }), e = s ? a / s : 0, t.eq(0).text(Math.round(100 * e) + "%"), t.eq(1).css("width", Math.round(100 * e) + "%"), i()
    }

    function i() {
        var e, a = "";
        "ready" === k ? a = "选中" + m + "张图片，共" + WebUploader.formatSize(h) + "。" : "confirm" === k ? (e = n.getStats(), e.uploadFailNum && (a = "已成功上传" + e.successNum + "张照片，" + e.uploadFailNum + '张照片上传失败，<a class="retry" href="#">重新上传</a>失败图片或<a class="ignore" href="#">忽略</a>')) : (e = n.getStats(), a = "共" + m + "张（" + WebUploader.formatSize(h) + "），已上传" + e.successNum + "张", e.uploadFailNum && (a += "，失败" + e.uploadFailNum + "张")), p.html(a)
    }

    function t(e) {
        var a;
        if (e !== k) {
            switch (c.removeClass("state-" + k), c.addClass("state-" + e), k = e) {
                case"pedding":
                    u.removeClass("element-invisible"), l.parent().removeClass("filled"), l.hide(), d.addClass("element-invisible"), n.refresh();
                    break;
                case"ready":
                    u.addClass("element-invisible"), o("#" + $this.filePicker2).removeClass("element-invisible"), l.parent().addClass("filled"), l.show(), d.removeClass("element-invisible"), n.refresh();
                    break;
                case"uploading":
                    o("#" + $this.filePicker2).addClass("element-invisible"), f.show(), c.text("暂停上传");
                    break;
                case"paused":
                    f.show(), c.text("继续上传");
                    break;
                case"confirm":
                    if (f.hide(), c.text("开始上传").addClass("disabled"), a = n.getStats(), a.successNum && !a.uploadFailNum) return void t("finish");
                    break;
                case"finish":
                    // a = n.getStats(), a.successNum ? alert("上传成功") : (k = "done", location.reload())
                    // a = n.getStats(), a.successNum ? $this.finishAllCallback(n,e) : (k = "done", location.reload());
                    a = n.getStats(), a.successNum ? $this.uploadSuccess(n, e) : (k = "done", location.reload());
            }
            i()
        }
    }

    var n, o = jQuery, r = o("#" + $this.id), l = o('<ul class="filelist"></ul>').appendTo(r.find(".queueList")),
        d = r.find(".statusBar"), p = d.find(".info"), c = r.find(".uploadBtn"), u = r.find(".placeholder"),
        f = d.find(".progress").hide(), m = 0, h = 0, g = window.devicePixelRatio || 1, v = 1, b = 1, // v = 110 * g,b = 110 * g,
        k = "pedding", w = {}, x = function () {
            var e = document.createElement("p").style,
                a = "transition" in e || "WebkitTransition" in e || "MozTransition" in e || "msTransition" in e || "OTransition" in e;
            return e = null, a
        }();
    if (!WebUploader.Uploader.support()) throw alert("Web Uploader 不支持您的浏览器！如果你使用的是IE浏览器，请尝试升级 flash 播放器"), new Error("WebUploader does not support the browser you are using.");
    n = WebUploader.create({
        pick: {id: "#" + $this.filePicker, label: "点击选择图片"},
        dnd: "#" + $this.id + " .queueList",
        paste: document.body,
        formData: {},
        fileVal: "file",
        accept: {title: "Images", extensions: "gif,jpg,jpeg,bmp,png", mimeTypes: "image/*"},
        swf: $this + "/Uploader.swf",
        disableGlobalDnd: !0,
        chunked: !0,
        compress: false,
        server: Feng.ctxPath + $this.server,
        fileNumLimit: $this.fileNum,
        fileSizeLimit: $this.singleLimit * 1024 * 1024 * $this.fileNum,
        fileSingleSizeLimit: $this.singleLimit * 1024 * 1024
    }), n.addButton({id: "#" + $this.filePicker2, label: "继续添加"}), n.onUploadProgress = function (e, a) {
        var i = o("#" + e.id), t = i.find(".progress span");
        t.css("width", 100 * a + "%"), w[e.id][1] = a, s()
    }, n.onFileQueued = function (a) {
        m++, h += a.size, 1 === m && (u.addClass("element-invisible"), d.show()), e(a), t("ready"), s()
    }, n.onFileDequeued = function (e) {
        m--, h -= e.size, m || t("pedding"), a(e), s()
    }, n.on("all", function (e) {
        switch (e) {
            case"uploadFinished":
                t("confirm");
                break;
            case"startUpload":
                t("uploading");
                break;
            case"stopUpload":
                t("paused");
                break;
            case "beforeFileQueued":
                return true;
        }
    }), n.on("beforeFileQueued", function (file) {
        // console.log(file)
        $this.compress(file);
        return true;
    }), n.on("uploadBeforeSend", function (file, data, headers) {

    }), n.on("uploadSuccess", function (file, response) {
        // console.log("图片上传成功");
    }), n.on('uploadError', function (file) {
        // console.log(file);
    }), n.onError = function (e) {
        if (e == "Q_TYPE_DENIED") {
            layer.msg("请上传JPG、PNG、GIF、BMP格式文件");
        } else if (e == "F_DUPLICATE") {
            layer.msg("图片已经存在");
        } else if (e == "F_EXCEED_SIZE") {
            layer.msg("图片大小不能超过" + $this.singleLimit + "M");
        } else if (e == "Q_EXCEED_NUM_LIMIT") {
            layer.msg("图片数量不能超过" + $this.fileNum + "张");
        } else {
            layer.msg("上传出错！请检查后重新上传！错误代码" + e);
        }
    }, c.on("click", function () {
        return o(this).hasClass("disabled") ? !1 : void("ready" === k ? n.upload() : "paused" === k ? n.upload() : "uploading" === k && n.stop());
    }), p.on("click", ".retry", function () {
        n.retry()
    }), p.on("click", ".ignore", function () {
        alert("todo")
    }), c.addClass("state-" + k), s();
    return n;
}
upload_image.init = function (rootNode, id, server, finishAllCallback) {
    this.id = id;
    this.server = server;
    this.filePicker = id + "Picker";
    this.filePicker2 = id + "Picker2";
    this.dndArea = id + "dndArea";
    this.finishAllCallback = finishAllCallback;
    var node = '<div id="' + this.id + '" class="wu-example">\n' +
        '                            <div class="queueList">\n' +
        '                                <div id="' + this.dndArea + '" class="placeholder">\n' +
        '                                    <div id="' + this.filePicker + '"></div>\n' +
        // '                                    <p>或将照片拖到这里</p>\n' +
        '                                </div>\n' +
        '                            </div>\n' +
        '                            <div class="statusBar" style="display:none;">\n' +
        '                                <div class="progress">\n' +
        '                                    <span class="text">0%</span>\n' +
        '                                    <span class="percentage"></span>\n' +
        '                                </div>\n' +
        '                                <div class="info"></div>\n' +
        '                                <div class="btns">\n' +
        '                                    <div id="' + this.filePicker2 + '" class="picker2"></div>\n' +
        '                                    <!--<div class="uploadBtn">开始上传</div>-->\n' +
        '                                </div>\n' +
        '                            </div>\n' +
        '                        </div>';

    // $(rootNode).append(node);
    this.node = $(node).appendTo(rootNode);
    return this.create();
}