package GongGong.contest.service;


import GongGong.contest.domain.Location;
import GongGong.contest.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationService {
    
    private final LocationRepository locationRepository;
    
    
    public List<Location> getLocations() {
        
        Location location = new Location();
        
        Location l1 = locationRepository.findById(1L).get();
        Location l2 = locationRepository.findById(2L).get();
        Location l3 = locationRepository.findById(3L).get();
        Location l4 = locationRepository.findById(4L).get();
        
        List<Location> locations = new ArrayList<>();
        locations.add(l1);
        locations.add(l2);
        locations.add(l3);
        locations.add(l4);
        
        return locations;
    }
}
