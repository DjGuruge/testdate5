import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class CreaDataSet {
    public static String addYear(String dateString, int years) {
        OffsetDateTime date = OffsetDateTime.parse(dateString);
        date = date.plusYears(years);
        DateTimeFormatter testoFormat = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.ITALY);
        return testoFormat.format(date);

    }

}
