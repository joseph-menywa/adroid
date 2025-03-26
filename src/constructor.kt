fun main() {

    var dog1 = dog("Billy","Chihuahua","Browa",34)
    println(dog1.breed+dog1.age.toString())
    var dog2 =dog("Mike","Kienyeji","Black",89)
    println(dog2.breed)
    var dog3 =dog("Rexi","German Shepherd","Black",9)
    println(dog3.breed)
    var dog4 =dog("Ian","Siberian Husky","White",70)
    println(dog4.breed)

}


class dog(var name:String,var breed:String,var color:String,var age:Int){

}