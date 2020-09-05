fun main()
{

    var a1=WebDeveloper("Ahmed",24,30000.0)
    var a2=AndroiedDeveloper("Abdulqader",24,15000.0)
    var a3=IOSDeveloper("Omar",24,20000.0)
    a1.webSite()
    a2.androied()
    a3.iosApp()


}
open class Employee
{
    var name:String=""
    var age:Int=17
    var salary:Double=1000.0

    constructor(name:String,age:Int,salary:Double)
    {
        this.name=name
        this.age=age
        this.salary=salary
    }

}
class WebDeveloper:Employee
{   var webSite:String="Web Developer"
    constructor(wName:String,wAge:Int,wSalary:Double):super(wName,wAge,wSalary)
    {
        this.name=wName
        this.age=wAge
        this.salary=wSalary
    }
    fun webSite()
    {
        println("Name: $name \t"+"Age : $age \t "+"Salary : $salary \t"+"who is a $webSite")
    }
}
class AndroiedDeveloper:Employee
{   var androied:String="Androied Developer"
    constructor(aName:String,aAge:Int,aSalary:Double):super(aName,aAge,aSalary)
    {
        this.name=aName;
        this.age=aAge;
        this.salary=salary;
    }
    fun androied()
    {
        println("Name: $name \t"+"Age : $age \t "+"Salary : $salary \t"+"who is a $androied")
    }
}
class IOSDeveloper:Employee
{   var iosApp:String="IOS Developer"
    constructor(iName:String,iAge:Int,iSalary:Double):super(iName,iAge,iSalary)
    {
        this.name=iName
        this.age=iAge;
        this.salary=iSalary
    }

    fun iosApp()
    {
        println("Name: $name \t"+"Age : $age \t "+"Salary : $salary \t"+"who is a $iosApp")
    }

}