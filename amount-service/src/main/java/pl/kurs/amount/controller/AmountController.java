package pl.kurs.amount.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kurs.amount.model.dto.AmountDto;
import pl.kurs.amount.service.AmountService;

@RestController
@RequestMapping("/api/v1/amount")
@RequiredArgsConstructor
public class AmountController {

    private final AmountService amountService;

    @PostMapping("/add/{value}")
    public ResponseEntity<AmountDto> add(@PathVariable int value) {
        return ResponseEntity.ok(amountService.add(value));
    }
}
