package com.avaliacao.rd.client.RD.service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ClientRequestDto {
    private String firstName;
    private String lastName;
}