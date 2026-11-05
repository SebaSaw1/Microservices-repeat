package pl.kurs.amount.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kurs.amount.model.dto.AmountDto;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
@RequiredArgsConstructor
public class AmountService {

    private int sum = 0;

    public AmountDto add(int value) {
        sum += value;
        return new AmountDto(sum, getInstanceName());
    }

    public AmountDto getSum() {
        return new AmountDto(sum, getInstanceName());
    }

    // dodawnie wartosci przekazanej w body


    // pobieranie aktualnej wartosci



    // czyszczenie sumy

    private String getInstanceName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        }catch (UnknownHostException e) {
            return "UNKNOWN-instance";
        }
    }
}
