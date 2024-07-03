fun sortByAge(personList: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return personList.sortedBy { it.second }
}

fun main() {
    val people = listOf(
        "Alice" to 30,
        "Bob" to 25,
        "Charlie" to 35,
        "David" to 20
    )
    
    val sortedPeople = sortByAge(people)
    
    println("Sorted by age:")
    for (person in sortedPeople) {
        println("${person.first}: ${person.second}")
    }
}
