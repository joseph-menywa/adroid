fun main() {
    //standard library functions/ Predefined functions
    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x")
    var y = Math.round(45.45)
    println("The output is $y")

    school() //Calling User-Defined Function
    student("Joseph",19)
    student("Ian",22)

    employee("John",22000,false)
    employee("Ann",100000,true)


}

      //User-Defined Function
      fun school(){
          println("eMobilis")
      }

//Parameter/Variable and Arguments/Value
fun student(name: String,age:Int){
    println("$name is $age years old")


}
fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary. Disability:$disability")
}