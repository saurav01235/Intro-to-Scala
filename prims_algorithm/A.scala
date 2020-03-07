import scala.collection.mutable._
import scala.collection.immutable.Stack
import scala.collection.mutable.Queue
import  scala.io.StdIn.{readInt,readLine}
object primSpan{
    var c=0;
//this is test
   
    def prim(src:Int,list:ArrayBuffer[ArrayBuffer[(Int,Int)]],dis:Array[Int],visit:Array[Boolean],q:Queue[(Int,Int)],V:Int,sorce:Array[Int]):(Queue[(Int,Int)],Array[Int])={
            
        if(q.size==V) return (q,sorce)
                var tem=(src,Int.MaxValue)
                var tem1=(src,Int.MaxValue)
                for(k<-0 until visit.length)
                {  println("outside ")
                    if(visit(k)==true){
                        println("Inside "+k)
                for(i<-list(k)){
                    if(visit(i._1)==false)
                    {
                        if(dis(i._1)>=i._2){
                            dis(i._1)=i._2
                            tem1=i
                            println(tem1+ "///")
                        }
                        if(tem1._2<tem._2){
                        tem=tem1
                        sorce(c)=k
                        c +=1
                        println(tem+ "//---/")
                        }
                    }
                }
            }
        }
        visit.foreach(print)
        println()
                visit(tem._1)=true
                q.enqueue(tem)
                prim(tem._1,list,dis,visit,q,V,sorce)
            
            

    (q,sorce)

    }
   

    def minSpan(src:Int,list:ArrayBuffer[ArrayBuffer[(Int,Int)]],v:Int){
      val INF=Int.MaxValue
      val sorce=new Array[Int](v)
      var q=new Queue[(Int,Int)]
      var visit=new Array[Boolean](v)
      var distance=new Array[Int](v)
     for(i<-0 until v)
        distance(i)=INF

     q.enqueue((src,src))
     visit(src)=true
    
    

    var tup=prim(src,list,distance,visit,q,v,sorce)
    var s=tup._1
    var s1=tup._2

   s.foreach(println)
    var p=0;
   for(i<-s){
       var a =i._1
       var b=i._2
       println(s"path from ${s1(p)} to $a  of weight $b")
       p +=1

   }
   
  //  println()

    }
   

}

object Call extends App{
    print("enter no of vertex: ");
    var V=readInt()
    print("enter the no of edges in graph: ")
    var E=readInt()
    var list=new ArrayBuffer[ArrayBuffer[(Int,Int)]](V)
    for(i<- 0 until V) 
    list += new ArrayBuffer[(Int,Int)]
    println("enter edges from One to next Node :")
    for(i<- 0 until E){
        var token=readLine().split(" ").map(_.toInt)
        var src=token(0)
        var dest=token(1)
        var weight=token(2)
        var b=(dest,weight)
        var b1=(src,weight)

        
        //list(src) +=b

        if(!list(src).contains(b)){
        list(src)+=b
        }
        if(!list(dest).contains(b1)){
        list(dest)+=b1
        }

    }
   println("Enter Source vertex :")
   var S=readInt()

   println(list)
  
   primSpan.minSpan(S,list,V)
    

}
