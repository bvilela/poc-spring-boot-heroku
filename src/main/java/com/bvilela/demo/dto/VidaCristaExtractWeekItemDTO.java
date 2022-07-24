package com.bvilela.demo.dto;

import java.util.List;

import com.bvilela.demo.enuns.VidaCristaExtractItemType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class VidaCristaExtractWeekItemDTO {

	private String title;
	private VidaCristaExtractItemType type;
	private List<String> participants;
	
	public VidaCristaExtractWeekItemDTO(String title, VidaCristaExtractItemType type) {
		this.title = title;
		this.type = type;
	}
	
}
