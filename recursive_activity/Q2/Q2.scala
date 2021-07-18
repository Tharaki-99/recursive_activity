object  Q2 {
  def primeseq(i: Int){
    var a=3;
    var b=2;
    var d=0;
    if ( i<= 1){
      println (" no primes ");
    }
    else if (i >= 2){
      println (2);
    }
    if (i>2) {
        while (a<=i){
          while (d==0 && b<a-1){
            if (a%b == 0){
              d=1;
            }
            b=b+1;
          }
          if (d==0){
            println (a);
          }
          d=0;
          b=2;
          a=a+1;
        }
    }
  }

  def main(args: Array[String]) {
  println(primeseq(2));
  }
}
