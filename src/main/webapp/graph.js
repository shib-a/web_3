var graph = document.getElementById("graph");
var context = graph.getContext();
var length = graph.height/2;
context.translate(length,length);
drawCoords(context)
var r = document.getElementById("ch_r").value
function drawCoords(context){
    context.moveTo(0,-length);
    // context.beginPath();
    context.lineTo(0,length);
    // context.stroke();
    context.moveTo(-length,0);
    context.lineTo(length,0);
}