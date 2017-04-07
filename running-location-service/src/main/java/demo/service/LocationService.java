package demo.service;

import demo.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by vagrant on 4/6/17.
 */
public interface LocationService {
    List<Location> saveRunningLocations(List<Location> runningLocations);

    void deleteAll();

    // Why movementType use String rather than enum? Query will pass in a String type.
    Page<Location> findByRunnerMovementType(String movementType, Pageable pageable);
}
