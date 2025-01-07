package com.JobportalCode.jobportalproject.repository;

import com.JobportalCode.jobportalproject.entity.JobPostActivity;
import com.JobportalCode.jobportalproject.entity.JobSeekerProfile;
import com.JobportalCode.jobportalproject.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
