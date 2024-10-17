var graph = document.getElementById("graph");
var context = graph.getContext('2d');
var height = graph.height/2*0.9;
var width = graph.width/2*0.9;
var length = height/2;
var r = height/5;
const slider = document.getElementById("data:ch_r_slider");
const inputField = document.getElementById("data:ch_r");
context.translate(height/0.9,height/0.9);
drawCoords();
drawLines();
drawRect();
drawTriangle();
drawQuart();
// $(slider).input(function (){
//     let rad = height/5*(slider.value);
//     console.log(rad);
//     drawRect(rad);
//     drawQuart(rad);
//     drawTriangle(rad);
// })
slider.addEventListener('slide',function (){
    let rad = height/5*(slider.value);
    console.log(rad);
    drawRect(rad);
    drawQuart(rad);
    drawTriangle(rad);
});
function redraw(){
    let rad = height/5*(inputField.value);
    console.log(rad);
    drawCoords();
    drawLines();
    drawRect(rad);
    drawQuart(rad);
    drawTriangle(rad);
}
// var r = document.getElementById("ch_r").value
function drawCoords(){
    context.strokeStyle='black';
    context.lineWidth=2;
    context.beginPath();
    context.moveTo(0,-height);
    context.lineTo(0,height);
    context.stroke();
    context.beginPath();
    context.moveTo(-width,0);
    context.lineTo(width,0);
    context.stroke();
}
function drawLines(){
    context.strokeStyle='black';
    context.beginPath();
    context.fillText("-1",0, height/5);
    context.moveTo(5,height/5);
    context.lineTo(-5,height/5);
    context.stroke();

    context.beginPath();
    context.fillText("-2",0, 2*height/5);
    context.moveTo(5,2*height/5);
    context.lineTo(-5,2*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("-3",0, 3*height/5);
    context.moveTo(5,3*height/5);
    context.lineTo(-5,3*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("-4",0, 4*height/5);
    context.moveTo(5,4*height/5);
    context.lineTo(-5,4*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("-5",0, height);
    context.moveTo(5,height);
    context.lineTo(-5,height);
    context.stroke();

    context.beginPath();
    context.fillText("1",0, -height/5);
    context.moveTo(5,-height/5);
    context.lineTo(-5,-height/5);
    context.stroke();

    context.beginPath();
    context.fillText("2",0, -2*height/5);
    context.moveTo(5,-2*height/5);
    context.lineTo(-5,-2*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("3",0, -3*height/5);
    context.moveTo(5,-3*height/5);
    context.lineTo(-5,-3*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("4",0, -4*height/5);
    context.moveTo(5,-4*height/5);
    context.lineTo(-5,-4*height/5);
    context.stroke();

    context.beginPath();
    context.fillText("5",0, -height);
    context.moveTo(5,-height);
    context.lineTo(-5,-height);
    context.stroke();

    context.beginPath();
    context.fillText("1",height/5, 0);
    context.moveTo(height/5,5)
    context.lineTo(height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("2",2*height/5, 0);
    context.moveTo(2*height/5,5)
    context.lineTo(2*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("3",3*height/5, 0);
    context.moveTo(3*height/5,5)
    context.lineTo(3*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("4",4*height/5, 0);
    context.moveTo(4*height/5,5)
    context.lineTo(4*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("5",height, 0);
    context.moveTo(height,5)
    context.lineTo(height,-5);
    context.stroke();

    context.beginPath();
    context.fillText("-1",-height/5, 0);
    context.moveTo(-height/5,5)
    context.lineTo(-height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("-2",-2*height/5, 0);
    context.moveTo(-2*height/5,5)
    context.lineTo(-2*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("-3",-3*height/5, 0);
    context.moveTo(-3*height/5,5)
    context.lineTo(-3*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("-4",-4*height/5, 0);
    context.moveTo(-4*height/5,5)
    context.lineTo(-4*height/5,-5);
    context.stroke();

    context.beginPath();
    context.fillText("-5",-height, 0);
    context.moveTo(-height,5)
    context.lineTo(-height,-5);
    context.stroke();
}

function drawRect(r){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.strokeRect(-r/2,0,r/2,-r);
    context.fillRect(-r/2,0,r/2,-r);
}
function drawTriangle(r){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.beginPath();
    context.moveTo(0,0);
    context.lineTo(r,0);
    context.lineTo(0,-r/2);
    context.stroke();
    context.fill();
}
function drawQuart(r){
    context.strokeStyle='rgb(20, 50, 150, 0.7)';
    context.fillStyle='rgb(20, 50, 100, 0.4)';
    context.beginPath();
    context.moveTo(0,0);
    context.lineTo(0,r);
    context.bezierCurveTo(0,r,-r,r,-r,0);
    context.moveTo(0,0);
    context.stroke();
    context.fill();
}

