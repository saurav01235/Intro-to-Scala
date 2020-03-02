object A {
def filter1(x:List[Int]):List[Int]=x match{
  case Nil=>x
  case x::xy =>x*x::filter1(xy)
}
def main(args:Array[String]){
var a=List(1,2,3,4,0,-1,4)
println(a)
println(filter1(a))

println()
}
}