 class Rational(a:Int,b:Int){
    def numer = a;
    def denom = b;

    def add(that:Rational):Rational={
        new Rational(numer*that.denom+denom*that.numer,denom*that.denom)

    }
    override def toString(): String = numer+"/"+denom

    
}
object A{
    def addRational(a:Rational,b:Rational):Rational={
        new Rational(a.numer*b.denom+b.numer+a.denom,a.denom*b.denom)

    }
    val x=new Rational(3,4)
    val y=new Rational(7,10)
    println(x.add(y))
    println(new Rational(1,2))
    def makeString(a:Rational):String={
        a.numer+"/"+a.denom
    }
     def main(args:Array[String]){
        println(makeString(addRational(new Rational(1,2),new Rational(2,4))))
    }
}