package com.bvilela.demo.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.bvilela.demo.ListBuilderException;
import com.bvilela.demo.dto.VidaCristaExtractWeekDTO;

public interface Test2ExtractService {

	String getUrlMeetingWorkbook(LocalDate lastDate);

	List<VidaCristaExtractWeekDTO> extractWeeksBySite(String url) throws IOException, ListBuilderException;

	void extractWeekItemsBySite(List<VidaCristaExtractWeekDTO> list) throws IOException, ListBuilderException;

}
