package com.sk.practice.springclient.web.dto.wrench;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Data
@Builder
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor

public class RoleDto {
        private Long id;
        private String roleName;
        private String displayName;
        private String description;
        private Integer type;
        private Integer organizationId;
        private String userGroup;
        private Integer orgLevelId;
        private Integer legacyRole;
        private Integer status;
        private Date updateDate;
        private Date createDate;
    }
