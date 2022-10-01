package net.raisetech.SpringBootSample.form;

import javax.validation.constraints.NotBlank;

public class CreateForm {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }
}
