package com.example.demo2.cdi;


import lombok.*;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Scope;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named implements Serializable {

    private Long namedId;
    private String namedData = "Merhabalar Named Cdi Bean";

    public String merhabaDe(String isim){

        if(isim.equals("")){
            return "";
        }
        else{
            return "Merhaba" +isim ;
        }


    }



}
