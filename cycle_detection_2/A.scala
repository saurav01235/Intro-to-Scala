import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._
import scala.util.control.Breaks._

class Dfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean],check:Array[Boolean]):Boolean={
          print(src+" ")
          visit(src)=true
          check(src)=true
            for(i<-value(src)){
                if(visit(i)==false && traversal(i,value,visit,check) ){
                    return true
            }
               else if (check(i)==true){
                   println("treve: "+i+" inside else if src: "+src)
                   return true
               } 
               

        } 
        check(src)=false

      //  println("src: "+src)
           false
    }

}
object A extends App{

println("enter the no vertex")
var nov=readInt()
println("enter no of edge")
var noe=readInt()
var ll= new ArrayBuffer[ArrayBuffer[Int]]

for(i<-0 to nov-1){
    ll += new ArrayBuffer[Int]
}
for(i<-0 to noe-1){
var token=readLine().split(" ").map(_.toInt)
var a=token(0)
var b=token(1)
ll(a)+=b
}

var visit=new Array[Boolean](nov)
var check=new Array[Boolean](nov)


 
val dfs=new Dfs
    for(i<-0 to nov-1){
    if(visit(i)==false)
        if(dfs.traversal(i,ll,visit,check)==true){
            println("cycle Detected")
        }
        else
        println("false")
}
 println(ll)
//println(ll(0)(1)) 



}