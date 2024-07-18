package GongGong.contest.controller;

import GongGong.contest.domain.Location;
import GongGong.contest.domain.Member;
import GongGong.contest.service.LocationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {
    
    private final LocationService locationService;
    @GetMapping("/")
    public String home() {
        
        return "home";
    }
    
    // 메인페이지
    @GetMapping("/mainpage")
    public ResponseEntity<List<Location>> mainpage(HttpServletRequest request, HttpSession session) {
        
        String json = "";
        
        List<Location> locations = locationService.getLocations();
        
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
    
    
}
