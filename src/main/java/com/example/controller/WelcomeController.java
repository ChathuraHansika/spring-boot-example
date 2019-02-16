package com.example.controller;

import com.example.model.Errorbean;
import com.example.model.TestData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Chathura Hansika on 12/9/2018.
 */
@RestController
@RequestMapping(value = "api/v1/")
public class WelcomeController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseEntity getTestDataList() {
        try {
            ArrayList<TestData> testDatas = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                testDatas.add(new TestData(UUID.randomUUID().toString(), i + ""));
                System.out.println(testDatas.get(i));
            }
//            throw new Exception();
            return new ResponseEntity<ArrayList<TestData>>(testDatas, HttpStatus.OK);
        } catch (Exception e) {
            Errorbean errorbean = new Errorbean();
            errorbean.setStatus("ERROR");
            errorbean.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value() + "");
            errorbean.setError_description("INTERNAL_SERVER_ERROR");
            ResponseEntity<Errorbean> errorbeanResponseEntity = new ResponseEntity<Errorbean>(errorbean, HttpStatus.INTERNAL_SERVER_ERROR);
            return errorbeanResponseEntity;
        }

    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public int add(){
        return 200;
    }

}
