package org.skydream.dev_step_be.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sample")
public class SampleController {

    @GetMapping
    public String helloCICD() {
        return "hello CI!";
    }
}
