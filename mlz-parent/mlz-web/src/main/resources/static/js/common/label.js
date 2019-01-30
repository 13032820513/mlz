var label = {
    node: {},
    data: {},
    //已存在标签列表节点
    curLabelRootNode: {},
    //选中显示节点
    tagLabelRootNode: {}
};
var labelMgr = {};//生产类
label.labelIsExist = function (name) {
    var data = this.data;
    for (var i = 0; i < data.length; i++) {
        var t = data[i].name;
        if (t == name) {
            return false;
        }
    }
    return true;
}
label.delSelect = function (value) {
    $(this.curLabelRootNode).find("a").each(function () {
        var $this = $(this);
        var curValue = $($this).attr("value");
        if (value == curValue) {
            $($this).removeClass("selected");
            return;
        }
    });
}
label.delTarSelect = function (value) {
    $(this.tagLabelRootNode).find("a").each(function () {
        var $this = $(this);
        var curValue = $($this).attr("value");
        if (value == curValue) {
            $($this).remove();
        }
    });
}
label.labelClick = function (event, label) {
    var $this = label;
    var $thisEvent = $(event).parent(),
        name = $thisEvent.attr('title'),
        id = $thisEvent.attr('value');
    if (id == -1) {
        layer.prompt({
            value: '',
            title: '新增一个标签',
            maxlength: 10,
        }, function (value, index, elem) {
            if (value.length < 2) {
                layer.alert("长度不能小于2");
                return;
            }
            if (!$this.labelIsExist(value)) {
                layer.alert("标签已存在");
                return;
            }
            $.ajax({
                url: Feng.ctxPath + "/label/add",
                data: {"name": value},
                success: function (result) {
                    if (result.code == 200) {
                        var str = '<a value="' + result.data + '" title="' + value + '" href="javascript:void(0);"><span>' + value + '</span><em></em></a>';
                        var item = $(str);
                        $($this.curLabelRootNode).find(".addLabel").before(item);
                        $(item).addClass("selected");
                        // item.on("click",function () {
                        //     $this.labelClick(this,label)
                        // });
                        item.find("span").on("click", function () {
                            $this.labelClick(this, label)
                        });
                        item.find("em").on('click', function () {
                            $this.deleteLabel(this);
                        });
                        var tagItem = $(item).clone();
                        $(tagItem).appendTo($this.tagLabelRootNode);
                        tagItem.on("click", function () {
                            $this.delSelect(result.data);
                            $(this).remove();
                        });
                        $this.data.push({"name": value, "id": result.data});
                        layer.close(index);
                    } else {
                        layer.alert(result.message);
                    }
                }
                , error: function (err) {
                    console.log(err)
                    layer.alert(err.responseJSON.message);
                }
            });
        });
    } else {
        if ($($thisEvent).is('.selected')) {
            return;
        }
        var item = '<a value="' + id + '" title="' + name + '" href="javascript:void(0);"><span>' + name + '</span><em></em></a>';
        var tag = $(item).appendTo($this.tagLabelRootNode);
        $($thisEvent).addClass("selected");
        tag.on("click", function () {
            $this.delSelect(id);
            $(this).remove();
        });
    }
}
label.select = function (data) {
    var $this = this;
    var isExist = function (id) {
        var exist = false;
        for (var i = 0; i < data.length; i++) {
            if (id == data[i].id + "") {
                exist = true;
            }
        }
        return exist;
    }
    $($this.curLabelRootNode).find("a").each(function () {
        var id = $(this).attr("value");
        var name = $(this).attr("title");
        if (isExist(id)) {
            var item = '<a value="' + id + '" title="' + name + '" href="javascript:void(0);"><span>' + name + '</span><em></em></a>';
            var tag = $(item).appendTo($this.tagLabelRootNode);
            $(this).addClass("selected");
            tag.on("click", function () {
                $this.delSelect(id);
                $(this).remove();
            });
        }
    });
}
label.deleteLabelData = function (id) {
    for (var i = 0; i < this.data.length; i++) {
        if (parseInt(id) == this.data[i].id) {
            this.data.splice(i, 1);
            return;
        }
    }
}
label.deleteLabel = function (event) {
    var $this = this;
    layer.confirm('确认删除这个标签？', {
        btn: ['确定', '取消'],
        shade: false //不显示遮罩
    }, function (index) {
        var a = $(event).parent();
        var id = $(a).attr("value");
        // var title = $(a).attr("title");
        if (id <= 0) {
            layer.alert("删除标签失败");
            return;
        }
        $.ajax({
            url: Feng.ctxPath + "/label/delete",
            data: {"id": id},
            success: function (result) {
                if (result.code == 200) {
                    if ($(a).is('.selected')) {
                        $this.delTarSelect(id);
                    }
                    $(a).remove();
                    $this.deleteLabelData(id);
                    layer.close(index);
                } else {
                    layer.alert(result.message);
                }
            },
            error: function (err) {
                console.log(err)
                layer.alert(err.responseJSON.message);
            }
        });
    });
}
label.Init = function (node, data) {
    var $this = this;
    this.node = node;
    this.data = data;
    var tagNode = $('<div class="form-group"><label class="col-sm-1 control-label">请选择标签:</label><div class="plus-tag tagbtn clearfix col-sm-10"></div></div>').appendTo(node);
    var curNode = $('<div class="form-group"><label class="col-sm-1 control-label">已有的标签:</label><div class="default-tag tagbtn col-sm-10"><div class="clearfix nowtips"></div></div></div>').appendTo(node);
    this.curLabelRootNode = $(curNode).find(".nowtips");
    this.tagLabelRootNode = $(tagNode).find(".plus-tag");
    for (var i = 0; i < data.length; i++) {
        $($this.curLabelRootNode).append('<a value="' + data[i].id + '" title="' + data[i].name + '" href="javascript:void(0);"><span>' + data[i].name + '</span><em></em></a>');
    }
    $($this.curLabelRootNode).append('<a class="addLabel" value="-1" title="新增标签" href="javascript:void(0);"><span class="label" style="color: #1a7bb9">新增标签</span></a>');
    // $($this.curLabelRootNode).find("a").on('click', function () {
    //     $this.labelClick(this,$this);
    // });
    $($this.curLabelRootNode).find("span").on('click', function () {
        $this.labelClick(this, $this);
    });
    $($this.curLabelRootNode).find("em").on('click', function () {
        $this.deleteLabel(this);
    });
    return this;
};

labelMgr.Init = function (node, data) {
    var t = {};
    $.extend(t, label);
    return t.Init(node, data);
}