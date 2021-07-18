object Q3 {
def sum(i: Int) {
  var a=1;
  var b=0;
  while (a<=i){
    b=b+a;
    a=a+1;
  }
  println (b);
}
def main(args: Array[String]) {
println(sum(5));
}
}
