package com.JobportalCode.jobportalproject.repository;

import com.JobportalCode.jobportalproject.entity.JobPostActivity;
import com.JobportalCode.jobportalproject.entity.JobSeekerApply;
import com.JobportalCode.jobportalproject.entity.JobSeekerProfile;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
