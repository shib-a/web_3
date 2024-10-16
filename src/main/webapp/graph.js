var graph = document.getElementById("graph");
var context = graph.getContext('2d');
var length = graph.height/2.3;
var height = graph.height;
var width = graph.width;
var r = length/2;
context.translate(length,length);
drawCoords();
drawLines();
drawRect();
drawTriangle();
drawQuart();
// var r = document.getElementById("ch_r").value
function drawCoords(){
    context.strokeStyle='black';
    context.lineWidth=2;
    context.beginPath();
    context.moveTo(0,-length);
    context.lineTo(0,length);
    context.stroke();
    context.beginPath();
    context.moveTo(-length,0);
    context.lineTo(length,0);
    context.stroke();
}
function drawLines(){
    context.strokeStyle='black';
    context.beginPath();
    context.fillText("R/2",0, length/2);
    context.moveTo(5,length/2);
    context.lineTo(-5,length/2);
}

function drawRect(){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.strokeRect(-r/2,0,r/2,-r);
    context.fillRect(-r/2,0,r/2,-r);
}
function drawTriangle(){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.beginPath();
    context.moveTo(0,0);
    context.lineTo(r,0);
    context.lineTo(0,-r/2);
    context.stroke();
    context.fill();
}
function drawQuart(){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.beginPath();
    context.moveTo(0,0);
    context.lineTo(0,r);
    // context.arc(-r/2,-r/2,r/2,-Math.PI/2,-Math.PI,false);
    context.bezierCurveTo(0,r,-r,r,-r,0);
    context.moveTo(0,0);
    context.stroke();
    context.fill();
}