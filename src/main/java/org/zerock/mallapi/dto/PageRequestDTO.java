package org.zerock.mallapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder // 상속관계의 클래스들 간의 빌더 패턴을 지원
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
	
	@Builder.Default // 빌더 패턴 사용시 기본값을 설정할 수 있도록 함.
	private int page = 1;

	@Builder.Default
	private int size = 10;
}
