package com.example.pslnvoicing.vo.workbench;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientQueryVo {
    private String clientName;
    private String clientNum;
    private String clientContact;
    private String clientPhone;
}
