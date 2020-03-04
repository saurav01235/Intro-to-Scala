//topological using bfs

import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._

class Bfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean],level:Array[Int],q:Queue[Int]){

        while(q.isEmpty==false){
           var tem=q.dequeue
           visit(tem)=true
            print(tem+" ") 
          //  print(q.dequeue)
            for(i<-value(tem)){
                if(visit(i)==false){
                level(i)=level(i)-1
              //  println(q+"////")
                if(level(i)==0){
                    q.enqueue(i)
                   // visit(i)=true
                }
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
var level=new Array[Int](nov)
for(i<-0 to noe-1){
var token=readLine().split(" ").map(_.toInt)
var a=token(0)
var b=token(1)
ll(a)+=b
level(b)=level(b)+1

}

var visit=new Array[Boolean](nov)
var q=Queue[Int]()
val bfs=new Bfs

for(i<-0 to level.length-1){
   // println(level(i))
            if(level(i)==0){
                q.enqueue(i)
            }
        }
println(level)

//for(i<-0 to nov-1){
 //   if(visit(i)==false)
bfs.traversal(0,ll,visit,level,q)
//}
println(ll)
/* while(!q.isEmpty){
    print(q.dequeue())
}
 */


}