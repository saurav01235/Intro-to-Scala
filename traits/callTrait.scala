class DefaultGreet extends Greeter

class CustomizableGreet(suffix:String,prefix:String) extends Greeter{
override def greet(name:String):Unit={
    println(suffix+name+prefix)
}
}

object A extends App{
    val a=new DefaultGreet();
    val b=new CustomizableGreet("Hello ,"," developer")
    a.greet("saurav")
    b.greet("Scala")
}
