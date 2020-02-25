import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._

class Dfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean]){
          print(src+" ")
            for(i<-value(src)){
                
                if(visit(i)==false){
                visit(i)=true
                traversal(i,value,visit)
                }
        

        } 
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
visit(0)=true


 
val dfs=new Dfs
dfs.traversal(0,ll,visit)
//  println(ll)
// println(ll(0)(1)) 



}