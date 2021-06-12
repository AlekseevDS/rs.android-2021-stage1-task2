package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var c: String = ""
        for (i in a) {if (b.contains(i.toUpperCase())) {c = c.plus(i.toUpperCase())}}
        return if (b.equals(c)) "YES" else "NO"
    }
}


