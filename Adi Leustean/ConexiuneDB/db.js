function jsGetMessages(){

$.get("http://localhost:8085/v1/getlist",{},function(response){

var mesaje = "";
for(var i = 0; i<response.length;i++){

mesaje = mesaje + '<div class="mesaj">'+response[i].text+'</div>'

}
document.getElementById("camera").innerHTML=mesaje;

console.log(response);
});




}


function jsPalindrom(){
    
    var number = document.getElementById("palindrom").value;
    $.get("http://localhost:8085/v1/checkPalindrom",{
        "number":number
        
    },
          function(jsPalindrom){
  
        if(jsPalindrom==true){
        document.getElementById("raspunsP").innerHTML="Palindrom";
    }
    else
         document.getElementById("raspunsP").innerHTML="Not Palindrom";
   
  console.log(jsPalindrom);  
});
    
}

function jsPrime(){
    
    var number = document.getElementById("prime").value;
    $.get("http://localhost:8085/v1/checkPrime",{
        "number":number
        
    },
          function(jsPrime){
     var mesaj= "";
        for(var i = 0; i<jsPrime.length;i++){

mesaj = mesaj +jsPrime[i]+'<br>';

}
  document.getElementById("primeR").innerHTML=mesaj;
   
  console.log(jsPrime);  
});
    
}



function jsEven(){
    
    var x = document.getElementById("x").value;
   var y = document.getElementById("y").value; $.get("http://localhost:8085/v1/checkEven",{
        "x":x,
       "y":y
        
    },
          function(jsEven){
     var mesaj= "";
        for(var i = 0; i<jsEven.length;i++){

mesaj = mesaj +jsEven[i]+'<br>';

}
  document.getElementById("numPare").innerHTML=mesaj;
   
  console.log(jsEven);  
});
    
}

function jsSort(){
    
    var vector = document.getElementById("vector").value;
   $.post("http://localhost:8085/v1/checkSort",{
        "vector":vector,
       
        
    },
          function(jsSort){
     
  document.getElementById("sortResponse").innerHTML=jsSort;
   
  console.log(jsSort);  
});
    
}