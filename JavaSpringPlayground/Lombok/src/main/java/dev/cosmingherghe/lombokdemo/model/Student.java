package dev.cosmingherghe.lombokdemo.model;

import lombok.*;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data //@ is like having implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor //to be able to use Builder and to not get conflicts
@Builder
public class Student {
    private Long id;
    private int indexNumber;
    private String firstName;
    private String lastName;
}