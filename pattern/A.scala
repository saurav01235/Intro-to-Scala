object even{
    def unapply(a:Int):Option[Boolean]={
        if (a%2==0) Some(false) else None
}
}
object A extends App{
    var a=10
    val res=a match {
        case even(_)=>"No is even"
        case _ => "not applicable"
    }

println(res)
}