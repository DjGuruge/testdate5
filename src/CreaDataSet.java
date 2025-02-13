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

    //
//    public static OffsetDateTime subtractMonths(OffsetDateTime data, int month) {
//        return data.minusMonths(month);
//    }
//
//    public static OffsetDateTime addDays(OffsetDateTime data, int days) {
//        return data.plusDays(days);
//    }
//
//    public static ZonedDateTime addItalianGeoLocation(OffsetDateTime data) {
//        return data.atZoneSameInstant(ZoneId.of("Europe/Rome"));
//    }

//    public static void stampaRisultati1(OffsetDateTime data) {
//        System.out.println(CreaDataSet.addItalianGeoLocation(data));
//
//    }

//
//    public static void stampaRisultati(OffsetDateTime data, int number) {
//        System.out.println(CreaDataSet.addYear(data, number));
//        System.out.println(CreaDataSet.subtractMonths(data, number));
//        System.out.println(CreaDataSet.addDays(data, number));
//    }
}
