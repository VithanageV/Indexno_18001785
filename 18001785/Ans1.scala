object Fahern extends App{
    def wage(hours:Int):Int=hours*150;

    def ot(hours:Int):Int=hours*75;

    def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2);

    def tax(income:Int)=income*0.1;

    def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-   tax(income(h1,h2));
 

    println(takeHome(40,20));
}
