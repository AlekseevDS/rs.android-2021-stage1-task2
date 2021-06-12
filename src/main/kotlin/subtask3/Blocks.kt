package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        if (blockB.equals(String::class)) {
            val strList = blockA.filterIsInstance<String>()
            var resultStr = ""
            for (i in strList) {
                resultStr = resultStr.plus(i)
            }
            return resultStr
        } else if (blockB.equals(Int::class)) {
            val intList = blockA.filterIsInstance<Int>()
            var resultInt = 0
            for (i in intList) {
                resultInt += i
            }
            return resultInt
        } else if (blockB.equals(LocalDate::class)) {
            val dateList = blockA.filterIsInstance<LocalDate>()
            var resultDate: LocalDate = LocalDate.now()
            var tmpDate = 0L
            for (i in dateList) {
                if (i.toEpochDay() > tmpDate) {
                    tmpDate = i.toEpochDay()
                    resultDate = LocalDate.parse(i.toString())
                }
            }

            return resultDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        }
        return "no data"
    }
}







