package com.test.springsql.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SpringDataModel {
    private long id;
    private String name;
    private String description;
}
