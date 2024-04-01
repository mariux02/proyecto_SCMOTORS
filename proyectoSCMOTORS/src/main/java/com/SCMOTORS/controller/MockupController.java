package com.SCMOTORS.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/mockups")
public class MockupController {

    @GetMapping("/mockup_1")
    public String mockup_1() {
        return "/mockups/mockup_1";
    }
    
    @GetMapping("/mockup_2")
    public String mockup_2() {
        return "/mockups/mockup_2";
    }
    @GetMapping("/mockup_3")
    public String mockup_3() {
        return "/mockups/mockup_3";
    }
    @GetMapping("/mockup_4")
    public String mockup_4() {
        return "/mockups/mockup_4";
    }
    @GetMapping("/mockup_5")
    public String mockup_5() {
        return "/mockups/mockup_5";
    }
    @GetMapping("/mockup_6")
    public String mockup_6() {
        return "/mockups/mockup_6";
    }
    @GetMapping("/mockup_7")
    public String mockup_7() {
        return "/mockups/mockup_7";
    }
    @GetMapping("/mockup_8")
    public String mockup_8() {
        return "/mockups/mockup_8";
    }
    @GetMapping("/mockup_14")
    public String mockup_14() {
        return "/mockups/mockup_14";
    }
    @GetMapping("/mockup_15")
    public String mockup_15() {
        return "/mockups/mockup_15";
    }
    @GetMapping("/mockup_16")
    public String mockup_16() {
        return "/mockups/mockup_16";
    }
    @GetMapping("/mockup_17")
    public String mockup_17() {
        return "/mockups/mockup_17";
    }
    @GetMapping("/mockup_18")
    public String mockup_18() {
        return "/mockups/mockup_18";
    }
    @GetMapping("/mockup_19")
    public String mockup_19() {
        return "/mockups/mockup_19";
    }
    @GetMapping("/mockup_20")
    public String mockup_20() {
        return "/mockups/mockup_20";
    }
    @GetMapping("/mockup_21")
    public String mockup_21() {
        return "/mockups/mockup_21";
    }
    @GetMapping("/mockup_22")
    public String mockup_22() {
        return "/mockups/mockup_22";
    }
    
}
