object Q1 {
def isPrime(i: Int) {
  var a = 0;
  var b = 2;
  if ( i<= 1){
    println (" false ");
  }
  else if (i == 2){
    println (" true ");
  }
  else {
    while( a == 0 && b<i ){
     if (i%b == 0 ){
       println (" false ");
       a=1;
     }
     else {
       b=b+1;
     }
}
  if (a== 0){
    println (" true ");
  }
}
}
def main(args: Array[String]) {
println(isPrime(1));
}
}
