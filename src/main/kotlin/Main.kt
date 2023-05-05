fun main() {
    println( structure("joyce",43,"Kenyan",))
    println(strings("money"))
    println(names(""))
    println(voels("joyjojoh"))

}


//1. Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x,
// I am y years old and I am from z.” Where x, y, and z are the provided name, age,
// and country respectively. (3 points)
fun structure(  name:String,age:Int, country:String):String{
     return "Hi, my $name is I am $age years old and I am from $country."
}
//2. Write a function that takes in a String and returns its length (2 points)
fun strings(words:String): Int{
    return  words.length

}
//3. Write a function that takes in a name and prints out
// “That’s me!” when your name is passed to it, otherwise, it prints out
// “I don’t know who that is” (3 points)
fun names( names:String):String{
    if (names==names){
        return "thats me"
    }
    else{
        return  "i dont know who that is"
    }

}

//4. Write a Kotlin function that takes in a string will all the vowels
// replaces by the character ‘*’. Use string interpolation to generate the output. (2 points)
fun voels( letters: String):String{
    var vowels="aeiou"
    var emptystring=""
    for (i in letters){
        if (i ==x){
            emptystring+="*"

        }
    }
    return "new output is $emptystring"
    }



