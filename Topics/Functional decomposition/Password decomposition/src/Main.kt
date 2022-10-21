fun passwordLessThan5(): String {
    var newPassword = ""
    if (newPassword.length < 5) {
        println("Your password should be longer than five characters, please write a new password")
        newPassword = "FiveCharacters"
    }
    return newPassword
}

fun passwordLongerThan5(password: String) {
    println("Your password is correct, please enter your name")
    val name = "John"
    println("Congratulations! Password for $name is $password")
}