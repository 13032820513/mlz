/**
 * 将对象自动映射到表单中
 * @param jsonStr
 */
function loadData(jsonStr){
    var obj = eval("("+jsonStr+")");
    var key,value,tagName,type,arr;
    for(var x in obj){
        key = x;
        value = obj[x];
        var a = "[name='"+key+"'],[name='"+key+"[]']";
        $("[name='"+key+"'],[name='"+key+"[]']").each(function(){
            tagName = $(this)[0].tagName;
            type = $(this).attr('type');
            if(tagName=='INPUT'){
                if(type=='radio'){
                    $(this).attr('checked',$(this).val()==value);
                }else if(type=='checkbox'){
                    arr = value.split(',');
                    for(var i =0;i<arr.length;i++){
                        if($(this).val()==arr[i]){
                            $(this).attr('checked',true);
                            break;
                        }
                    }
                }else{
                    $(this).val(value);
                }
            }else if(tagName=='SELECT' || tagName=='TEXTAREA'){
                $(this).val(value);
            }

        });
    }
}