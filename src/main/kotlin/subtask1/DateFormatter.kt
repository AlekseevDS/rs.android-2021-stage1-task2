package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val rusLocale: Locale  = Locale.Builder().setLanguage("ru").setScript("Cyrl").build();

        try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val text_day_of_the_week = date.getDayOfWeek().getDisplayName(TextStyle.FULL, rusLocale).toLowerCase()
            val text_month = date.month.getDisplayName(TextStyle.FULL, rusLocale).toLowerCase()
            val result = "$day $text_month, $text_day_of_the_week"
            return result

        } catch (e: DateTimeException) {
            return "Такого дня не существует"
            //e.printStackTrace();

        }

    }
}
