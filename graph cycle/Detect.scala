import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._
import scala.util.control.Breaks._

class Dfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean],parent:Int):Boolean={
          print(src+" ")
          visit(src)=true
            for(i<-value(src)){
                if(visit(i)==false){
                   // println("treve: "+i+" src: "+src+" parent: "+parent)
               if (traversal(i,value,visit,src)==true){
                   println("treve: "+i+" 'inside true'  src: "+src+" parent: "+parent)
                   return true
               }
            }
               else if (i!=parent){
                   println("treve: "+i+" inside else if src: "+src+" parent: "+parent)
                   return true
               }

        } 
        println("src: "+src+" parent: "+parent)
           false
    }

}
object callDfs extends App{

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
if(!ll(a).contains(b)){
ll(a)+=b
}
if(!ll(b).contains(a)){
ll(b)+=a
}
}

var visit=new Array[Boolean](nov)


 
val dfs=new Dfs
    for(i<-0 to nov-1){
    if(visit(i)==false)
        if(dfs.traversal(i,ll,visit,-1)==true){
            println("cycle Detected")
        }
        else
        print("false")
}
 println(ll)
//println(ll(0)(1)) 



}