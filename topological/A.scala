// Topological sort
import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
import  scala.io.StdIn.readLine
import scala.collection.mutable._
import scala.util.control.Breaks._

class Dfs{
    def traversal(src:Int,value:ArrayBuffer[ArrayBuffer[Int]],visit:Array[Boolean],s:Stack[Int]):Stack[Int]={
         // print(src+" ")
          //visit(src)=true  
            for(i<-value(src)){
                if(visit(i)==false){
                    traversal(i,value,visit,s)         
            }   
        } 
        visit(src)=true 
         s.push(src)
      //  println("src: "+src)
           s
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
var a=token(0);var b=token(1)
ll(a)+=b
}
var visit=new Array[Boolean](nov)
val dfs=new Dfs
var s=new Stack[Int]()
    for(i<-0 to nov-1){
    if(visit(i)==false){
     println(s+"previous")
      (dfs.traversal(i,ll,visit,s))
      println(s)
    }
}
while(!s.isEmpty){
    println(s.pop())
}
println(ll) 
}