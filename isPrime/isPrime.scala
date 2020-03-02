object A extends App{
//def isPrime(a:Int):Boolean=(2 until a) forall (d=>a%d!=0)

def isPrime(a:Int):Boolean=(2 until a) forall (d=>a%d!=0)
println(isPrime(4))



println(isPrime(4))
var n=7
println((1 to n) flatMap (i=>(1 until n) map (j=>(i,j))) filter (pair=>isPrime(pair._1+pair._2)))
}