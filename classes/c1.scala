
class Greeter(prefix:String,suffix:String){
    def greet(name:String):Unit={
        println(prefix+name+suffix)
    }
}
object A extends App{
    val g=new Greeter("hello ,","we love ")
    g.greet("scala developer")

}