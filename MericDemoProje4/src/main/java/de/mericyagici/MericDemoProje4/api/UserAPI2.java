package de.mericyagici.MericDemoProje4.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
@RequestMapping("/api2")
public class UserAPI2 {
    @GetMapping("v2/user/{id}")
    public final String getUserByName(@PathVariable Long name){
        String kullaniciadi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        kullaniciadi=scanner.nextLine();
        final String message1 = "Merhaba"+kullaniciadi;
        return message1;


    }
}
