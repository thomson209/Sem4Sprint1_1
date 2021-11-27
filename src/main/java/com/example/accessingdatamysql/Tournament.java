package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
public class Tournament {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private LocalDate start;
    private LocalDate end;
    private String location;
    private long entryFee;
    private long cashPrize;
    private String participants;
    private String finalStandings;



    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(long entryFee) {
        this.entryFee = entryFee;
    }

    public long getCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(long cashPrize) {
        this.cashPrize = cashPrize;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getFinalStandings() {
        return finalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        this.finalStandings = finalStandings;
    }

}

