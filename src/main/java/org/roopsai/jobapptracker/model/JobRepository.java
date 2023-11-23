package org.roopsai.jobapptracker.model;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
    Job findByTitle(String title);
}
