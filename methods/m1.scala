object m1{
    def name: String = System.getProperty("user.name")
name="saurav jain"
    def addThenMultiply(a:Int,b:Int)(c:Int):Int=
    (a+b)*c
    
    def main(args:Array[String]){
        println("Hello, " + name + "!")
        println(addThenMultiply(5,6)(7))
    }
}