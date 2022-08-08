package com.example.demo2.cdi;


import com.example.demo2.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Typed;
import javax.faces.annotation.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped
@Typed(_04_New.class)
public class _04_New implements Serializable {

    //üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L)
                .studentName("student Adi")
                .studentSurname("student surname")
                .build();


        return studentDto.getStudentName();

    }



    @Inject
    private String tuketilenData;




}
