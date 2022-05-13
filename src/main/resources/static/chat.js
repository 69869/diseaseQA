window.onload = function (){
    var words = document.getElementById("words")
    var text = document.getElementById("text");
    var put =document.getElementById("put");
    var xhr = new XMLHttpRequest();
    put.onclick = function () {
        var str = "123";
        str = '<div class="atalk"><span>问：' + text.value + '</span></div>'
        words.innerHTML = words.innerHTML + str;
        xhr.open('POST', '/diseaseQA/receive/words', true);
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhr.send("question="+text.value);
        xhr.onreadystatechange=function()
        {
            var answer;
            var respond;
            if (xhr.readyState == 4 && xhr.status == 200) {
                answer = xhr.responseText;
                respond = '<div class="btalk"><span>答：' + answer + '</span></div>';
                words.innerHTML = words.innerHTML +respond;
            }
        }
    }
}