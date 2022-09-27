package net.raisetech.SpringBootSample.controller;

import net.raisetech.SpringBootSample.form.CreateForm;
import net.raisetech.SpringBootSample.form.UpdateForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;
import java.util.Optional;

@RestController
public class NameController {
    @GetMapping("/names")
    public ResponseEntity<Map<String, String>> getNames(@RequestParam(value = "name", defaultValue = "name") String name) {
        if("name".equals(name)) {
            return ResponseEntity.ok(Map.of("message", "nameに指定された人物が存在しません"));
        } else {
            return ResponseEntity.ok(Map.of("message", name));
        }
    }

    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        String urlStr = "http://localhost:8080";
        URI url = UriComponentsBuilder.fromUriString(urlStr)
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created URL:" + url);
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated. name:" + form.getName()));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "name successfully delete"));
    }
}
