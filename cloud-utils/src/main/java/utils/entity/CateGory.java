package utils.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CateGory implements Serializable {
    private Integer categoryId;
    private String categoryName;
    private String imgUrl;
}
