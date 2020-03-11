import scala.collection.mutable.ArrayBuffer
object Bell extends App{
    print("enter no of vertex: ");
    var V=readInt()
    print("enter the no of edges in graph: ")
    var E=readInt()
   // var arr=new Array[(Int,Int,Int)](E)
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
        //var b1=(dest,src,weight)
       // arr(i) =b

        
        //list(src) +=b

        
        list(src)+=b
        
       /*  if(!list(dest).contains(b1)){
        list(dest)+=b1
        } */

    }
   /* println("Enter Source vertex :")
   var S=readInt() */
   
/* 
   arr.foreach(println)
  var a= arr.sortBy(_._3)


   a.foreach(p=>print(p+" "));println()
   arr.foreach(p=>print(p+" ")) */
   println(list)
   println()

//   kruskal.invokeKruskal(a,V)
  // primSpan.minSpan(S,list,V)
    

}
