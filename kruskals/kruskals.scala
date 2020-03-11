import scala.collection.mutable._
import scala.collection.immutable.Stack
import scala.collection.mutable.Queue
import  scala.io.StdIn.{readInt,readLine}
import scala.util.control.Breaks._

object kruskal{

    def find(p:Int,parent: =>Array[Int]):Int={
        if(parent(p)==p) p

        else find(parent(p),parent)

        }

    def union(x:Int,y:Int,parent: =>Array[Int]){
        var X=find(x,parent)
        var Y=find(y,parent)
        if(X==Y) return
        else parent(Y)=X
    }
    def invokeKruskal(list:Array[(Int,Int,Int)],v:Int){
        var res=new Array[(Int,Int,Int)](v-1)
        var parent=new Array[Int](v)
        for(i<- 0 until v){
            parent(i)=i
        }
        var s=0
        breakable{
        for(i<-0 until list.length ){
            var tem=list(i)
            var x=find(tem._1,parent)
            var y=find(tem._2,parent)

            parent.foreach(p=>print(p+"--->"))
                println()

            if(x!=y){
                res(s)=tem
                union(x,y,parent)
                s=s+1
               // println(s+"<-------->")
            }
           // println(v+ "<=======================>")
            if(s==v)
            break
            }   
             }

                println()
                parent.foreach(p=>print(p+"---"))
                println()

                res.foreach(p=>println(p+ "//////////"))
                println()
        


    }
}


object Call extends App{
    print("enter no of vertex: ");
    var V=readInt()
    print("enter the no of edges in graph: ")
    var E=readInt()
    var arr=new Array[(Int,Int,Int)](E)
    var list=new ArrayBuffer[ArrayBuffer[(Int,Int,Int)]](V)
    for(i<- 0 until V) 
    list += new ArrayBuffer[(Int,Int,Int)]
    println("enter edges from One to next Node :")
    for(i<- 0 until E){
        var token=readLine().split(" ").map(_.toInt)
        var src=token(0)
        var dest=token(1)
        var weight=token(2)
        var b=(src,dest,weight)
        var b1=(dest,src,weight)
        arr(i) =b

        
        //list(src) +=b

        if(!list(src).contains(b)){
        list(src)+=b
        }
        if(!list(dest).contains(b1)){
        list(dest)+=b1
        }

    }
   /* println("Enter Source vertex :")
   var S=readInt() */
   

   arr.foreach(println)
  var a= arr.sortBy(_._3)


   a.foreach(p=>print(p+" "));println()
   arr.foreach(p=>print(p+" "))
   println()

  kruskal.invokeKruskal(a,V)
  // primSpan.minSpan(S,list,V)
    

}
