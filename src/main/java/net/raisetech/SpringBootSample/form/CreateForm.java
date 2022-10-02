package net.raisetech.SpringBootSample.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateForm {
    @NotBlank
    @Size(max = 19)
    private String name;

    public String getName() {
        return name;
    }
}
