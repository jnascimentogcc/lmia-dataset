package com.actadi.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateHelp {

    public static LocalDateTime getGMTFromEuropeDublin() {

        LocalDateTime dateUE = LocalDateTime.now();
        ZonedDateTime zonedUE = dateUE.atZone(ZoneId.of("Europe/Dublin"));

        return zonedUE.withZoneSameInstant(ZoneId.of("GMT")).toLocalDateTime();
    }

    public static LocalDateTime convertToLocalDateTimeFromDate(Date dateToConvert) {

        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.of("Europe/Dublin"))
                .toLocalDateTime();    }
}
