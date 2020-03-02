class Wire{
    private var sigVal=false
    private var actions:List[Actions]=List()
    def getSignal:Boolean=sigVal
    def setSignal(s:Boolean):Unit={
        if(s!=sigVal){
        sigVal=s
        actions foreach(_())
        }
    }
    def addAction(a:Actions):Unit={
        actions=a::actions
        a()
    }
}