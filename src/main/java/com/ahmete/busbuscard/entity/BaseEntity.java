package com.ahmete.busbuscard.entity;

import com.ahmete.busbuscard.utility.enums.EState;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@MappedSuperclass
public class BaseEntity {
	@Builder.Default
	EState state=EState.ACTIVE;
	@Builder.Default
	LocalDate createAt=LocalDate.now();
	@Builder.Default
	LocalDate updateAt=LocalDate.now();
}