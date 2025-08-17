package com.ahmed.employee_api.repository;

import com.ahmed.employee_api.model.Title;
import com.ahmed.employee_api.model.TitleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, TitleId> {
}
