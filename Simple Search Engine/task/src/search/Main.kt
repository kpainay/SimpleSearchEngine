package search

import java.io.File

fun main(args: Array<String>) {
    val separator = File.separator

    val pathname =  if(args.size != 0) args[1] else " "
    val peopleFile = File(pathname)

    val searchEngine = SearchEngine()
    if (peopleFile.exists()) searchEngine.fetchPeopleFromFile(peopleFile) else searchEngine.fetchPeopleFromCLI()


    var option = -1
    while (option != 0) {
        presentMenu()
        option = readln().toInt()
        when (option) {
            1 -> {
                println("Select a matching strategy: ALL, ANY, NONE")
                val strategy = readln()
                println("Enter a name or email to search all suitable people.")
                val query = readln()
                when (strategy) {
                    "ALL" -> {
                        val result = searchEngine.searchAll(query)
                        println("${result.size} persons found:")
                        result.forEach { println(it) }
                    }

                    "ANY" -> {
                        val result = searchEngine.searchIndex(query)
                        println("${result.size} persons found:")
                        result.forEach { println(it) }
                    }

                    "NONE" -> {
                        val result = searchEngine.searchIndexInverse(query)
                        println("${result.size} persons found:")
                        result.forEach { println(it) }
                    }

                    else -> println("Unknown strategy")
                }
                }
            2 -> {
                searchEngine.showPeople()
            }
            0 -> {
                println("\nBye!")
                break
            }
            else -> {
                println("Incorrect option! Try again.")
            }
        }
    }
}

private fun searchFor(person: String, query: String): String {

    if (person.contains(query, ignoreCase = true)) {
        return person
    }
    return ""
}

private fun updateIndex(peopleIndex: MutableMap<String, MutableList<Int>>, people: MutableList<String>){
    for (person in people){
        for (wrd in person.split(" ")){
            val word = wrd.lowercase()
            if (peopleIndex.containsKey(word))
                peopleIndex[word]?.add(people.indexOf(person))
            else
                peopleIndex[word] = mutableListOf(people.indexOf(person))
        }
    }
}

private fun showPeople(people: MutableList<String>) {
    println("=== List of people ===")
    for (person in people) {
        println(person)
    }
}

private fun presentMenu() {
    println("\n=== MENU ===")
    println(
        "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit"
    )
}

private fun getAllPeople(): MutableList<String> {
    println("Enter the number of people:")

    val numberOfPeople = readln().toInt()
    println("Enter all people:")

    val people = MutableList(numberOfPeople) { readln() }
    return people
}

fun search(str: String, word: String) {
    val wordList = str.split(" ")
    val result = "Not found"
    var index = 0

    if (wordList.contains(word)) {
        index = wordList.indexOf(word)
        println(index+1)
    } else {
        println(result)
    }
}

class SearchEngine() {
    private val people = mutableListOf<String>()
    private val peopleIndex = mutableMapOf<String, MutableList<Int>>()

    fun addPerson(person: String) {
        people.add(person)
    }
    private fun updateIndex(peopleIndex: MutableMap<String, MutableList<Int>>, people: MutableList<String>){
        for (person in people){
            for (wrd in person.split(" ")){
                val word = wrd.lowercase()
                if (peopleIndex.containsKey(word))
                    peopleIndex[word]?.add(people.indexOf(person))
                else
                    peopleIndex[word] = mutableListOf(people.indexOf(person))
            }
        }
    }
    fun fetchPeopleFromFile(file: File) {
        if (file.exists()) {
            file.forEachLine { people.add(it) }
        }
        updateIndex(peopleIndex, people)
    }
    fun fetchPeopleFromCLI() {
        println("Enter the number of people:")
        val numberOfPeople = readLine()!!.toInt()
        println("Enter all people:")
        for (i in 0 until numberOfPeople) {
            people.add(readLine()!!)
        }
        updateIndex(peopleIndex, people)
    }
    fun searchIndex() {
        println("Enter the name or email to search all suitable people.")
        val query = readln()

        val allPeople = peopleIndex[query.lowercase()]
        if (allPeople != null) {
            val plural = if (allPeople.size > 1) "s" else ""
            println("${allPeople.size} person$plural found:")
            for (i in allPeople) {
                println(people[i])
            }

        } else
            println( "No matching people found." )
    }
    fun searchIndex(query: String): MutableList<String> {
        val peopleFound = mutableListOf<Int>()

        for (i in query.split(" ")) {
            peopleFound.addAll(peopleIndex[i.lowercase()] ?: listOf())
        }
        return peopleFound.map { people[it] }.toMutableList()
    }
    fun search(query: String): String {
//        println("Enter the name or email to search all suitable people.")
        for (person in people) {
            if (person.contains(query, ignoreCase = true)) {
                return person
            }
        }
        return ""
    }
    fun searchIndexInverse(query: String): MutableList<String> {
        val facts = mutableListOf<Boolean>()
        val peopleFound = mutableListOf<String>()
        for (person in people) {
            for (i in query.split(" ")) {
                if (!person.contains(i, ignoreCase = true)) {
                    facts.add(true)
                } else {
                    facts.add(false)
                }
            }
            if (!facts.contains(false)) {
                peopleFound.add(person)
            } else {
                facts.clear()
            }
        }
        return peopleFound
    }
    fun searchAll(query: String): MutableList<String> {
        val facts = mutableListOf<Boolean>()
        val peopleFound = mutableListOf<String>()
        for (person in people) {
            for (i in query.split(" ")) {
                if (person.contains(i, ignoreCase = true)) {
                    facts.add(true)
                } else {
                    facts.add(false)
                }
            }
            if (!facts.contains(false)) {
                peopleFound.add(person)
            } else {
                facts.clear()
            }
        }
        return  peopleFound
    }

    fun showPeople() {
        println("=== List of people ===")
        for (person in people) {
            println(person)
        }
    }

}

enum class Strategy{
    ANY,
    ALL,
    NONE
}
