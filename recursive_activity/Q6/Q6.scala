object Q6 {
def fibonacii(i: Int) {
  var a=3;
  var b=0;
  var c=1;
  var d=0;
  if (i>=1){
    println (b);
  }
  if (i>=2){
    println (c);
  }
  if (i>2){
    while (a<=i){
      d=b+c;
      println (d);
      b=c;
      c=d;
      a=a+1;
    }
  }
}
def main(args: Array[String]) {
println(fibonacii(10));
}
}
