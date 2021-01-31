package dev.cosmingherghe.lombokdemo.model;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
    private Long id;
    private int indexNumber;
    private String firstName;
    private String lastName;
}
