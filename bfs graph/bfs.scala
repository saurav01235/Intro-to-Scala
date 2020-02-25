import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._

class Bfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean]){
        var q=Queue[Int]()
        visit(src)=true
        q.enqueue(src)
        while(q.isEmpty==false){
            var tem=q.dequeue
            print(tem+" ")
            for(i<-value(tem)){
                if(visit(i)==false){
                q.enqueue(i)
                visit(i)=true
                }
            }
        

        } 
    }

}
object callBfs extends App{

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


 /* for(i<- visit){
    println(i)
}  */
val bfs=new Bfs
bfs.traversal(0,ll,visit)
/* println(ll)
println(ll(0)(1)) */



}