package lk.ijse.vehicleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vehicle")
public class TestController {

    @GetMapping
    public String getVehicle() {
        return "vehicle";
    }
}
