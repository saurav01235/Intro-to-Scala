// sum of number between a and b
class A{

 def sumOfSquare(f:Int=> Int,a:Int,b:Int):Int={
     def sumNum(a:Int,acc:Int):Int=
         if (a>b) acc
         else sumNum(a+1,f(a)+acc)
     
     sumNum(a,0)
 }
}
////////////////////////////////////////////////////////////////////////////////
//currying
class B{
    def product(f:Int=>Int,a:Int,b:Int):Int={
        if(a>b) 1
        else f(a)*product(f,a+1,b)
    }
}
//more concise using currying
class C{
    val b=new B
    def fact(a: Int)=b.product(x=>x,1,a)
}




//other combining implemnetation using curry
class D{
def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int={
    if (a>b) zero
    else combine(f(a),mapReduce(f,combine,zero)(a+1,b))
  }
def factorial(f:Int=>Int,a:Int):Int=mapReduce(f,(x,y)=>x*y,1)(1,a)
def fac(f:Int=>Int,a:Int):Int={
    factorial(f,a)
}
}



object A1 extends App{
 val a=new A
 val b=new B
 val c=new C
 val d=new D
println("Interval of No: 3 5")
 print("Sum of squares: ")
 println(a.sumOfSquare(x=>x*x,3,5))

 print("product of squares: ")
 println(b.product(x=>x*x,3,5))

 print("factorial of number : ")
 println(c.fact(5))

  print("factorial of number using map reduce: ")
 println(d.fac(x=>x,5))
}