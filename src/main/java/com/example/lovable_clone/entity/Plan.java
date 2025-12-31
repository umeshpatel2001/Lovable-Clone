package com.example.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;

    String name;

    String stripePriceId;
    Integer maxProject;
    Integer maxProjectPerDay;
    Integer maxPreviews;
    Boolean unlimitedAi;

    Boolean active;
}
