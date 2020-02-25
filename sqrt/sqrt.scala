import scala.io.StdIn.readLine;
object sqrt extends App{
    def sqrtIter(guess:Double,x:Double):Double={
        if(isGood(guess,x))
        guess
        else
       // println(guess)
        sqrtIter(improve(guess,x),x)
    }
    def isGood(guess:Double,x:Double):Boolean={
           if (abs((guess*guess)-x)<0.001) true
           else false
    }
    def improve(guess:Double,x:Double):Double={
        ((guess+(x/guess))/2.0)
    }
    def abs(x:Double):Double={
        if(x<0) -(x) else x
    }

    def sqrt(x:Double):Double=sqrtIter(1,x)


println("enter no to find Squre root: ")
var x=readLine().toInt
    println(sqrt(x))
}