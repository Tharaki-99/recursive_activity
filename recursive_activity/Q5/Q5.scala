object Q5 {
def sum_of_even(i: Int) {
  var a=1;
  var b=0;
  while (a<=i){
    if (a%2 == 0){
      b=b+a;
    }
    a=a+1;
  }
  println ("sum = " + b);
}
def main(args: Array[String]) {
println(sum_of_even(5));
}
}
