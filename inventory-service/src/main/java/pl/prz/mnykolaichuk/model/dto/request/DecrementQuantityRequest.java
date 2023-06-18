package pl.prz.mnykolaichuk.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecrementQuantityRequest {
    private String skuCode;
    private Integer quantity;

}