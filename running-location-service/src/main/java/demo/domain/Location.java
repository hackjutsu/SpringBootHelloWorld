package demo.domain;


import javax.persistence.*;
import java.util.Date;

// Entity means this class is to be translated to a default table "LOCATION"
@Entity
// Mapped to "RUNNING_LOCATIONS"
@Table(name = "RUNNING_LOCATIONS")
public class Location {
    enum GpsStatus{
        EXCELLENT, OK, UNRELIABLE, BAD, NOFIX, UNKNOWN;
    }

    public enum RunnerMovementType {
        STOPPED, IN_MOTION;

        public boolean isMoving() {
            return this != STOPPED;
        }
    }

    @Id
    @GeneratedValue
    private Long id;

    // Create a embedded table
    @Embedded
    // Override the bandMake to a different column
    @AttributeOverride(name = "bandMake", column = @Column(name = "unit_band_make"))
    private final UnitInfo unitInfo;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "fmi", column = @Column(name = "medical_fmi")),
        @AttributeOverride(name = "bfr", column = @Column(name = "medical_bfr"))
    })
    private MedicalInfo medicalInfo;

    private double latitude;
    private double longtitude;

    private String heading;
    private double gpsSpeed;
    private GpsStatus gpsStatus;

    private double odometer;
    private double totalRunningTime;
    private double totalIdleTime;
    private double totalCaloriesBurnt;
    private String address;
    private Date timestamp = new Date();
    private String gearProvider;
    private RunnerMovementType runnerMovementType = RunnerMovementType.STOPPED;
    private String serviceType;

    public Location(String runningId) {
        this.unitInfo = new UnitInfo(runningId);
    }
}
