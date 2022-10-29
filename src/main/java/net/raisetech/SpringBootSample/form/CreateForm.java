package net.raisetech.SpringBootSample.form;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Getter
public class CreateForm {
    @NotBlank
    @Size(max = 19)
    private String name;
}
