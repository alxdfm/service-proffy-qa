package br.com.proffy.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Schedule {
    private String weekday;
    private String from;
    private String to;
}
