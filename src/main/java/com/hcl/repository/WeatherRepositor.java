package com.hcl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.domain.WeatherReport;

@Repository("weatherRepository") 
public interface WeatherRepositor extends JpaRepository<WeatherReport, Long>
{

}
