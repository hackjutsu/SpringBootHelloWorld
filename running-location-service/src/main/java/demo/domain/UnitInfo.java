package demo.domain;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by vagrant on 4/4/17.
 */
@Data
@Embeddable
public class UnitInfo {

    private final String runningId;
    private String bandMake;
    private String customName;
    private String unitNumber;

    public UnitInfo(String runningId, String bandMake, String customName, String unitNumber) {
        this.runningId = runningId;
        this.bandMake = bandMake;
        this.customName = customName;
        this.unitNumber = unitNumber;
    }

    public UnitInfo() {
        this.runningId = "";
    }

    public UnitInfo(String runningId) {
        this.runningId = runningId;
    }
}
