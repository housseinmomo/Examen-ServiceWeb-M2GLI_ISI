package com.mugen_exam_webservice.abdoulfatah_houssein_kaire.controllers;

import com.mugen_exam_webservice.abdoulfatah_houssein_kaire.models.DayResponse;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("dayfinder")
public class DayFinder {

    @PostMapping()
    public DayResponse dayfinder(@RequestBody String dateInput) throws ParseException {
        System.out.println(dateInput);
        Date date= new SimpleDateFormat("dd/MM/yyyy").parse(dateInput);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);

        return new DayResponse(dateInput, dayWeekText);
    }
}
