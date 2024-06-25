package GongGong.contest.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * 이미지 관련 테스트 컨트롤러
 * 프로젝트 루트의 상대 경로에 이미지 저장
 */
@Controller
public class ImageController {
    
    @GetMapping("/image")
    public String imageForm() {
        return "test/imagetest";
    }
    
    @PostMapping("/image")
    public String imageConfirm(MultipartFile image) throws IOException {
        
        //프로젝트 루트 경로
        String currentDir = System.getProperty("user.dir");
        System.out.println("currentDir = " + currentDir);
        
        // 상위 디렉토리 경로 계산
        File currentDirFile = new File(currentDir);
        String parentDir = currentDirFile.getParent();
        System.out.println("parentDir = " + parentDir);
        
        
        // 상위 디렉토리에 있는 image 폴더에 저장
        String uploadDir = parentDir + "/image/";
        System.out.println("uploadDir = " + uploadDir);
        
        /*File uploadDirectory = new File(uploadDir);
        if (!uploadDirectory.exists()) {
            System.out.println("폴더 없음");
            uploadDirectory.mkdirs();
        }*/
        
        Path path = Paths.get(uploadDir + image.getOriginalFilename());
        System.out.println("저장할 경로: " + path);
        
        try {
            image.transferTo(new File(path.toString()));
            System.out.println("이미지 저장 성공: " + image.getOriginalFilename());
        } catch (IOException e) {
            System.out.println("이미지 저장 실패");
        }
        
        return "redirect:/";
    }
    
    
}
