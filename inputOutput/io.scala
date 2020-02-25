import scala.io.StdIn.readLine
object hello extends App{
    print("enter the first name: ")
    var firstName=readLine()
    print("enter the second name: ")
    var secondName=readLine()

    println(s"firstName: $firstName SecondName: $secondName")

}