package com.sk.practice.springclient.web.dto.lemonsquad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Jacksonized
public class StatusDto {
    private long Id;
    private String name;
    private String description;
}
