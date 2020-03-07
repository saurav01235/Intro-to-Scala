//Shortest path in dag
import scala.io.StdIn.{readLine,readInt}
import scala.collection.mutable._

object TopologicalSort{
    def topSort(src:Int,visit:Array[Boolean],st:Stack[Int],list:ArrayBuffer[ArrayBuffer[(Int,Int)]]):Stack[Int]={
        for(i<-list(src)){
            if(visit(i._1)==false){
            topSort(i._1,visit,st,list)
            }
        }
        visit(src)=true
        st.push(src)

        st
    }
    
    def sortestPath(s:Int,V:Int,list:ArrayBuffer[ArrayBuffer[(Int,Int)]]){
        val INF=Int.MaxValue
        var stack= new Stack[Int]
        var dis=new Array[Int](V)
        var visited=new Array[Boolean](V)

        for(i <- 0 until V){
            if(visited(i)==false){
                topSort(i,visited,stack,list)
            }
        }
        println(stack)
        for(i<-0 until V)
        dis(i)=INF
        dis(s)=0

        while (!stack.isEmpty){
            var u=stack.pop()
            if(dis(u)!=INF){
                for (i<-list(u)){
                    if(dis(i._1)>(dis(u)+i._2)){
                        dis(i._1)=(dis(u)+i._2)
                    }

                }
            }
        }

        for(i<- 0 until V){
            if(dis(i)==INF)
            print(" INF ")
            else
            printf(" %d ",dis(i))
        }
        println()








    }
}

object A extends App{
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

        
        list(src) +=b

    }
    println("Enter Source vertex :")
    var S=readInt()
    //var t=new TopologicalSort
    println(s"Sortest path from vertex $S to all other vertex is: ")
    //println(sortestPath(S,V,list))
    //val ts=new TopologicalSort
    TopologicalSort.sortestPath(S,V,list)



    println(list)






}