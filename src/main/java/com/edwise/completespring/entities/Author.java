package com.edwise.completespring.entities;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotEmpty;

@ApiModel(value = "Author entity", description = "Complete info of a entity author")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class Author {

    @ApiModelProperty(value = "The name of the author", required = true)
    @NotEmpty
    private String name;

    @ApiModelProperty(value = "The surname of the author", required = false)
    @NotEmpty
    private String surname;

    public Author copyFrom(Author other) {
        this.name = other.name;
        this.surname = other.surname;

        return this;
    }
}
