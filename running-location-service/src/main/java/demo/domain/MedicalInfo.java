package demo.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@RequiredArgsConstructor
public class MedicalInfo {

    private final long bfr;

    private final long fmi;
}

