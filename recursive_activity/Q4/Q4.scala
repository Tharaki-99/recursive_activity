object Q4 {
def even_or_odd(i: Int) {
  var a=1;
  while (a<=i){
    if (a%2 == 0){
      println (a + " is even");
    }
    else {
      println (a + " is odd");
    }
    a=a+1;
  }
}
def main(args: Array[String]) {
println(even_or_odd(5));
}
}
