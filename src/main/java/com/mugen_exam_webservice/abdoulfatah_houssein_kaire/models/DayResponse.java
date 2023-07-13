package com.mugen_exam_webservice.abdoulfatah_houssein_kaire.models;

import java.util.Date;

public class DayResponse {
    private String date;
    private String dayOfWeek;

    public DayResponse() {
    }

    public DayResponse(String date, String dayOfWeek) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
