data class Person(val name: String, val age: Int)

fun main() {
    val persons = mutableListOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 30),
        Person("Dave", 20),
        Person("Eve", 25)
    )
    sortPersons(persons)
    persons.forEach { println(it) }
}

fun sortPersons(persons: MutableList<Person>) {
   
    for (i in 0 until persons.size - 1) {
        for (j in 0 until persons.size - 1 - i) {
            
            if (persons[j].age < persons[j + 1].age) {
                swap(persons, j, j + 1)
            } else if (persons[j].age == persons[j + 1].age) {
                
                if (persons[j].name > persons[j + 1].name) {
                    swap(persons, j, j + 1)
                }
            }
        }
    }
}

fun swap(persons: MutableList<Person>, idx1: Int, idx2: Int) {
    val temp = persons[idx1]
    persons[idx1] = persons[idx2]
    persons[idx2] = temp
}
