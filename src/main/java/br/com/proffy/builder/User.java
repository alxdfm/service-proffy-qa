package br.com.proffy.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    private String id;
    private String subject;
    private String cost;
    private String user_id;
    private String name;
    private String avatar;
    private String whatsapp;
    private String bio;
    private List<Schedule> schedule;


}
