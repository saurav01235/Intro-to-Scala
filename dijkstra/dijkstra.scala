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
  
   //primSpan.minSpan(S,list,V)
    

}
